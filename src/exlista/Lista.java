package exlista;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lista {
    public static void main(String[] args) {
        //Exercicio 4
        List <Pessoas> pessoa = new ArrayList<>();
        pessoa.add(new Pessoas("João",15));
        pessoa.add(new Pessoas("Leandro",21));
        pessoa.add(new Pessoas("Paulo", 17));
        pessoa.add(new Pessoas("Jessica", 18));
        System.out.println(pessoa);

        while (pessoa.isEmpty()){
            System.out.println("a Lista está vazia");

        }



    }


}
