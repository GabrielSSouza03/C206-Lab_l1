import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Plataforma p1 = new Plataforma();
        Plataforma p2= new Plataforma();
         

        p1.nome="Asus";
        p1.criador="Dalai Lama";

        p2.nome= "Google Play";
        p2.criador="Jobs";

        
        plataforma.adicionarJogo(sc);
        plataforma.mostraMaisCaroBarato();
        plataforma.calculaDlc();
        plataforma.mostraInfo();
        for (Jogo jogo : plataforma.jogo) {
            jogo.mostraInfoJogo();
        }

    }

    public static class Plataforma {
        String nome;
        String criador;
        Jogo[] jogo = new Jogo[3];

        void mostraInfo() {
            
                    System.out.println("Nome:" + p1.nome);
                    System.out.println("Criador:" + p2.criador);

                
        }

        public void adicionarJogo(Scanner scan) {

            for (int i = 0; i < jogo.length; i++) {
                if (jogo[i] != null) {
                    System.out.println("Digite o nome do jogo:");
                    jogo[i].nomeJogo = sc.nextLine();
                    System.out.println("Digite o genero do jogo:");
                    jogo[i].genero = sc.nextLine();
                    System.out.println("Digite o preço do jogo:");
                    jogo[i].preco = sc.nextInt();
                    System.out.println("Possui dlç:");
                    jogo[i].dlc = sc.nextBoolean();
                    sc.nextLine();
                    jogo[i] = new Jogo(nome, genero, preco, dlc);
                }
            }
        }

        public void mostraMaisCaroBarato() {
            if (jogo[0] == null) {
                System.out.println("Não há jogos cadastrados.");
                return;
            }

            Jogo jogoMaisCaro = jogo[0];
            Jogo jogoMaisBarato = jogo[0];

            for (Jogo jogo : jogo) {
                if (jogo.getPreco() > jogoMaisCaro.getPreco()) {
                    jogoMaiscaro = jogo;
                }
                if (jogo.getPreco() < jogoMaisBarato.getPreco()) {
                    jogoMaisBarato = jogo;
                }

            }
        }

        public void calculaDlc() {
            int countDlc = 0;
            for (Jogo jogo : jogo) {
                if (jogo != null && jogo.dlc) {
                    countDlc++;
                }
            }
            System.out.println("Quantidade de jogos com DLC: " + countDlc);
        }
    }

    public static class Jogo {
        String nomeJogo;
        String genero;
        double preco;
        boolean dlc;

        void mostraInfoJogo() {
            for (int i; i < jogo.lenght; i++) {
                if (jogo[i] != null) {
                    System.out.println("Nome do jogo: " + jogo[i].nomeJogo);
                    System.out.println("Gênero: " + jogo[i].genero);
                    System.out.println("Preço:" + jogo[i].preco);
                    System.out.println("Possui DLC: " + jogo[i].dlc);
                    System.out.println();
                }
            }
        }

        public String getNome() {
            return nomeJogo;
        }

        public double getPreco() {
            return preco;
        }
    }
}