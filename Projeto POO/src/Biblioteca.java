import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private static final String FILE_NAME = "biblioteca.dat";

    public Biblioteca() {
        this.livros = new ArrayList<>();
        carregarDados();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        salvarDados();
    }

    public List<Livro> listarLivros() {
        return livros;
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void atualizarLivro(String isbn, Livro novoLivro) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getIsbn().equals(isbn)) {
                livros.set(i, novoLivro);
                salvarDados();
                return;
            }
        }
    }

    public void removerLivro(String isbn) {
        livros.removeIf(livro -> livro.getIsbn().equals(isbn));
        salvarDados();
    }

    private void salvarDados() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(livros);
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    private void carregarDados() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            livros = (List<Livro>) ois.readObject();
        } catch (FileNotFoundException e) {
            // Arquivo não encontrado, iniciar com lista vazia
            livros = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar dados: " + e.getMessage());
        }
    }
}
