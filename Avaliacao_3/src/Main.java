import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Boolean flag = true;
        Arquivo arquivo = new Arquivo();
        ArrayList<Jogos> jogosArray = new ArrayList<>();


        while (flag) {

            System.out.println("------ MENU ------");
            System.out.println("1 - Adicionar um novo Jogo ");
            System.out.println("2 - Mostrar jogos do Arquivo");
            System.out.println("3 - Ordenar jogo em ordem crescente em relação ao preco");
            System.out.println("4 - Ordenar jogo em ordem decrescente em relação ao preco");
            System.out.println("------------------");

            int op = sc.nextInt();
            sc.nextLine();
            switch (op) {

                case 1:
                    System.out.println("--- Adicionando jogo ---");

                    System.out.print("Entre com o nome do jogo: ");
                    String nome = sc.nextLine();

                    System.out.print("Entre com o genero do jogo: ");
                    String genero = sc.nextLine();


                    try {
                        System.out.print("Entre com o preco do jogo: ");
                        int game = sc.nextInt();
                        if (game > 0) {

                        } else {
                            throw new PrecoNegativoException("Jogo precisa ter um game com preco maior de 0");

                        }

                        Jogos j1 = new Jogos(nome, preco, genero);
                        arquivo.escrever(j1);
                        System.out.println("Jogo adicionado com sucesso!");

                    } catch (PrecoNegativoException e) {
                        System.out.println("preco do game inválida! Tente novamente!");
                        break;
                    }


                case 2:
                    jogosArray = arquivo.ler();

                    System.out.println("--- Lista de Jogos ---");
                    for (int i = 0; i < jogosArray.size(); i++) {
                        System.out.println("Nome do jogo: " + jogosArray.get(i).getNome());
                        System.out.println("Genero do jogo: " + jogosArray.get(i).getGenero());
                        System.out.println("Preco do jogo: " + jogosArray.get(i).getPreco());
                        System.out.println("-------------------");
                    }
                    break;


                case 3:

                    Collections.sort(jogosArray);
                    System.out.println("--- Lista de Jogos ---");
                    for (int i = 0; i < jogosArray.size(); i++) {
                        System.out.println("Nome do jogo: " + jogosArray.get(i).getNome());
                        System.out.println("Posição do jogo: " + jogosArray.get(i).getGenero());
                        System.out.println("Preco do jogo: " + jogosArray.get(i).getPreco());
                        System.out.println("-------------------");
                    }
                    break;


                case 4:
                    Collections.sort(jogosArray, Collections.reverseOrder());
                    System.out.println("--- Lista de Jogos ---");
                    for (int i = 0; i < jogosArray.size(); i++) {
                        System.out.println("Nome do jogo: " + jogosArray.get(i).getNome());
                        System.out.println("Posição do jogo: " + jogosArray.get(i).getGenero());
                        System.out.println("Preco do jogo: " + jogosArray.get(i).getPreco());
                        System.out.println("-------------------");
                    }
                    break;

                default:
                    System.out.println("Entre com uma opção válida de menu!");
                    break;
            }

        }


    }
}