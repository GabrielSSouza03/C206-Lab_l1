import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();


        double pi = 3.14;

        double comprimento = 2 * pi * raio;


        double volume= (4.0 / 3.0) * pi * Math.pow(raio, 3);

        // Exibir os resultados
        System.out.printf("Comprimento da circunferência: %.2f\n", comprimento);
        System.out.printf("Volume da esfera: %.2f\n", volume);
        System.out.printf("Valor de π : %.2f\n", pi);

        // Fechar o scanner
        scanner.close();
    }
}
