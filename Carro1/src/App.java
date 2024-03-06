public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.cor = "Amarelo";
        carro1.marca = "Wolksvagen";
        carro1.modelo = "Corsa";
        carro1.velocidadeMax = 12200;
        carro1.velocidadeAtual = 9000000;
        carro1.setMotor(150, "Gasolina");

        carro2.cor = "Preto";
        carro2.marca = "Chevrolet";
        carro2.modelo = "Classic";
        carro2.velocidadeMax = 100;
        carro2.velocidadeAtual = 90;
        carro2.setMotor(90, "Flex");

        carro1.mostraInfo();
        carro2.mostraInfo();

    }

    static class Carro {
        String cor;
        String marca;
        String modelo;
        double velocidadeMax;
        double velocidadeAtual;

        Motor motor = new Motor();

        public void setMotor(int potencia, String tipo) {
            this.motor.potencia = potencia;
            this.motor.tipo = tipo;
        }

        public void ligar() {
            System.out.println("O carro está ligado!");

        }

        public void acelerar() {
            System.out.println("O carro está acelerando!");
        }

        public void mostraInfo() {
            System.out.println("Cor: " + cor);
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Velocidade Máxima: " + velocidadeMax);
            System.out.println("Velocidade Atual: " + velocidadeAtual);
            System.out.println("Potência do motor: " + motor.potencia);
            System.out.println("Tipo do Motor: " + motor.tipo);
        }

    }

    public static class Motor {
        int potencia;
        String tipo;
    }

}
