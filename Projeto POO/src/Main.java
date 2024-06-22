import java.util.Scanner;

public class Main {
    private static Biblioteca biblioteca = new Biblioteca();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Buscar Livro por Título");
            System.out.println("4. Atualizar Livro");
            System.out.println("5. Remover Livro");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    buscarLivroPorTitulo();
                    break;
                case 4:
                    atualizarLivro();
                    break;
                case 5:
                    removerLivro();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void adicionarLivro() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        Livro livro = new Livro(titulo, autor, isbn);
        biblioteca.adicionarLivro(livro);
    }

    private static void listarLivros() {
        for (Livro livro : biblioteca.listarLivros()) {
            System.out.println(livro);
        }
    }

    private static void buscarLivroPorTitulo() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        Livro livro = biblioteca.buscarLivroPorTitulo(titulo);
        if (livro != null) {
            System.out.println(livro);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    private static void atualizarLivro() {
        System.out.print("ISBN do livro a ser atualizado: ");
        String isbn = scanner.nextLine();
        System.out.print("Novo Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Novo Autor: ");
        String autor = scanner.nextLine();
        Livro novoLivro = new Livro(titulo, autor, isbn);
        biblioteca.atualizarLivro(isbn, novoLivro);
    }

    private static void removerLivro() {
        System.out.print("ISBN do livro a ser removido: ");
        String isbn = scanner.nextLine();
        biblioteca.removerLivro(isbn);
    }
}
