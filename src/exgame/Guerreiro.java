package exgame;


import java.util.Random;

public class Guerreiro extends Personagem{

    String nome;
    String classe;
    int level;
    int inteligencia;
    int forca;
    int mana;
    int vida;

    Random aleatorio = new Random();
    int randomico = aleatorio.nextInt(300);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public int attack(int atak){
        int i = (forca * level) + randomico;
        return i;
    }
}
