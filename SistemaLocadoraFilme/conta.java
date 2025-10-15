package locadora;

import java.util.Date;

public class Conta {
    private Cliente cliente;
    private int numero;
    private double saldoDevedor;
    private Locacao[] historicoLocacao;
    private int indiceHistorico;

    public Conta() {
        this.saldoDevedor = 0.0;
        this.historicoLocacao = new Locacao[20];
        this.indiceHistorico = 0;
    }

    public Conta(Cliente cliente, int numero) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldoDevedor = 0.0;
        this.historicoLocacao = new Locacao[20];
        this.indiceHistorico = 0;
    }

    public void locarFilmes(Filme[] filmes) {
        Locacao novaLocacao = new Locacao(new Date());

        for (Filme filme : filmes) {
            if (filme != null) {
                novaLocacao.addFilme(filme);
            }
        }

        if (indiceHistorico < historicoLocacao.length) {
            this.historicoLocacao[indiceHistorico] = novaLocacao;
            indiceHistorico++;
            this.saldoDevedor += novaLocacao.getValorTotalAPagar();
        } else {
            System.out.println("Limite de histórico de locação atingido para esta conta.");
        }
    }

    public String extratoHistorico() {
        StringBuilder extrato = new StringBuilder();

        extrato.append(".:: Histórico de Locações de ").append(this.cliente.getNome()).append("::.\n");
        extrato.append("Data da locação\tLista de filmes\tValor da locação\n");

        for (int i = 0; i < indiceHistorico; i++) {
            Locacao locacao = historicoLocacao[i];
            
            extrato.append(locacao.getData().toString()).append("\t");
            
            Filme[] filmes = locacao.getListaFilmes();
            for (int j = 0; j < filmes.length; j++) {
                extrato.append(filmes[j].getTitulo());
                if (j < filmes.length - 1) {
                    extrato.append(", ");
                }
            }
            
            extrato.append("\t").append(String.format("%.2f", locacao.getValorTotalAPagar())).append("\n");
        }

        extrato.append("\nSaldo Devedor Atual: ").append(String.format("%.2f", this.saldoDevedor)).append("\n");

        return extrato.toString();
    }

    public void pagarDebito(double valor) {
        if (valor > 0) {
            this.saldoDevedor -= valor;
            if (this.saldoDevedor < 0) {
                this.saldoDevedor = 0.0;
            }
        }
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }
}