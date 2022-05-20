package exgame;

public class Personagem {
    public static void main(String[] args) {

        //Exercício 3
        Mago m1 = new Mago();
        Guerreiro g1 = new Guerreiro();



        // Atributos Mago
        m1.nome = "Implacavel";
        m1.classe = "Mago";
        m1.level = 50;
        m1.inteligencia = 200;
        m1.forca = 20;
        m1.mana = 200;
        m1.vida = 100;
        System.out.println("Seu Nick: " + m1.nome);
        System.out.println("Sua classe: " + m1.classe);
        System.out.println("Seu level: " + m1.level);
        System.out.println("Sua inteligencia: " + m1.inteligencia);
        System.out.println("Sua força: " + m1.forca);
        System.out.println("Sua mana: " + m1.mana);
        System.out.println("Sua vida: " + m1.vida);
        m1.attack(123);
        System.out.println("Seu ataque " + m1.attack(123));

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        // Atributos Guerreiro
        g1.nome = "Brutus";
        g1.classe = "Guerreiro";
        g1.level = 50;
        g1.inteligencia = 20;
        g1.forca = 200;
        g1.mana = 10;
        g1.vida = 300;
        System.out.println("Seu Nick: " + g1.nome);
        System.out.println("Sua classe: " + g1.classe);
        System.out.println("Seu level: " + g1.level);
        System.out.println("Sua inteligencia: " + g1.inteligencia);
        System.out.println("Sua força: " + g1.forca);
        System.out.println("Sua mana: " + g1.mana);
        System.out.println("Sua vida: " + g1.vida);
        g1.attack(123);
        System.out.println("Seu ataque " + g1.attack(123));


    }
}

