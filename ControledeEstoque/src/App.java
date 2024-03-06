public class App {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.codigoSerie = 1;
        produto1.codigoProduto = "cinco";
        produto1.nome = "tapioca";
        produto1.categoria = "alimento";
        produto1.quantidade = 23;

        produto2.codigoSerie = 2;
        produto2.codigoProduto = "quatro";
        produto2.nome = "Vassoura";
        produto2.categoria = "Limpeza";
        produto2.quantidade = 9;

        produto1.mostraInfo();
        produto2.mostraInfo();

    }

    public static class Produto {

        int codigoSerie;
        String codigoProduto;
        String nome;
        String categoria;
        int quantidade;

        public void mostraInfo() {
            System.out.println("Código de série: " + codigoSerie);
            System.out.println("Código do produto: " + codigoProduto);
            System.out.println("Nome: " + nome);
            System.out.println("Categoria: " + categoria);
            System.out.println("Quantidade: " + quantidade);

        }

    }
}
