public abstract class Personagem {
    String nome;
    int vida;
    int energia;
    int poder;

    public String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }


    public void usarHabilidade(){
        System.out.println("Usando habilidade!");

    }

    public void mostraInfo(){

    }


}
