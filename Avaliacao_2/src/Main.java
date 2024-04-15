public class Main {
    public static void main(String[] args) {


        Personagem[] personagem= new Personagem[3];

        Personagem mago = personagem[0];
        Personagem assassino = personagem[1];
        Personagem guerreiro = personagem[2];

        mago = new Mago();
        assassino = new Assassino();
        guerreiro = new Guerreiro();

        mago.setNome("Donald");
        mago.setVida(100);
        mago.setEnergia(9000);
        mago.setPoder(4500);
        mago.usarHabilidade();


        assassino.setNome("Jack");
        assassino.setVida(100);
        assassino.setEnergia(2000);
        assassino.setPoder(50);
        assassino.usarHabilidade();
       ((Assassino) assassino).atacar();

        Arma armaAssassino= new Arma();
        armaAssassino.setNomeArma("Faca");
        armaAssassino.setDano(35);



        guerreiro.setNome("Conan");
        guerreiro.setVida(100);
        guerreiro.setEnergia(90);
        guerreiro.setPoder(100);
        guerreiro.usarHabilidade();
       ((Guerreiro) guerreiro).atacar();

        Arma armaGuerreiro= new Arma();
        armaGuerreiro.setNomeArma("Clava");
        armaGuerreiro.setDano(35);



    }
}