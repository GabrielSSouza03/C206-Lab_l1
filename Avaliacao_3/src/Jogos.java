public class Jogos implements Comparable<Jogos> {

    private String nome;
    private double preco;
    private String genero:

    public Jogo(String nome, double preco, String genero) {
        this.nome = nome;
        this.preco = preco;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getGenero() {
        return genero;

    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int  compareTo(Jogos o) {
        return Integer.compare(o.preco, this.preco);
    }
}