package locadora;

import java.util.Date;
import java.util.Arrays;

public class Locacao {
    private Date data;
    private double valorTotalAPagar;
    private Filme[] listaFilmes;
    private int indiceFilme;

    public Locacao() {
        this.listaFilmes = new Filme[10];
        this.valorTotalAPagar = 0.0;
        this.indiceFilme = 0;
    }

    public Locacao(Date data) {
        this.data = data;
        this.listaFilmes = new Filme[10];
        this.valorTotalAPagar = 0.0;
        this.indiceFilme = 0;
    }

    public void addFilme(Filme filme) {
        if (indiceFilme < listaFilmes.length) {
            this.listaFilmes[indiceFilme] = filme;
            this.valorTotalAPagar += filme.getValorLocacao();
            indiceFilme++;
        } else {
            System.out.println("Limite de 10 filmes por locação atingido.");
        }
    }

    public Date getData() {
        return data;
    }

    public double getValorTotalAPagar() {
        return valorTotalAPagar;
    }

    public Filme[] getListaFilmes() {
        return Arrays.copyOf(listaFilmes, indiceFilme);
    }
}