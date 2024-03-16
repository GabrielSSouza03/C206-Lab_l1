public class App {
    public static void main(String[] args) {

        Produtos p1 = new Produtos();
        Produtos p2 = new Produtos();

        Carrinho carrinho = new Carrinho();

        p1.nome = "Arroz";
        p1.descricao = "Organico";
        p1.fabricante = "MST";
        p1.preco = 20;

        p2.nome = "Halls";
        p2.descricao = "Drops";
        p2.fabricante = "Adams";
        p2.preco = 2;

        carrinho.produto[0] = p1;
        carrinho.produto[1] = p2;

        carrinho.exibirInfo();

        double precoTotal = carrinho.calculaTotal();
        System.out.println("Preço total da compra: " + precoTotal);
    }

    public static  class Produtos {
        String nome;
        String descricao;
        String fabricante;
        double preco;

    }

    public static class Carrinho {

        double total;
        Produtos[] produto = new Produtos[5];

        double calculaTotal() {
            double precoTotal = 0.0;

            for (int i = 0; i < produto.length; i++) {
                if (produto[i] != null) {
                    precoTotal += produto[i].preco;
                }

            }
            return precoTotal;

        }

        void exibirInfo() {
            for (int i = 0; i < produto.length; i++) {
                if (produto[i] != null) {
                    System.out.println("Nome: " + produto[i].nome);
                    System.out.println("Descrição: " + produto[i].descricao);
                    System.out.println("Fabricante:" + produto[i].fabricante);
                    System.out.println("Preço: " + produto[i].preco);

                }
            }

        }
    }

}