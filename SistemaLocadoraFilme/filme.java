package locadora;

public class Filme {
    private String titulo;
    private int ano;
    private String genero;
    private double valorLocacao;

    public Filme() {
    }

    public Filme(String titulo, int ano, String genero, double valorLocacao) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.valorLocacao = valorLocacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }
}