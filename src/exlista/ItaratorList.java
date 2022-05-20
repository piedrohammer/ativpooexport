package exlista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratorLista {
    public static void main(String[] args) {
        // EXERCICIO 5
        List<Pessoas> pessoa = new ArrayList<>();
        pessoa.add(new Pessoas("João",15));
        pessoa.add(new Pessoas("Leandro",21));
        pessoa.add(new Pessoas("Paulo", 17));
        pessoa.add(new Pessoas("Jessica", 18));

        for (Pessoas pessoas: pessoa) {
            System.out.println(pessoas.getNome());
            System.out.println(pessoas.getIdade());

        }

        //EXERCÍO 6
        Iterator<Pessoas> pessoasIterator = pessoa.iterator();

        while (pessoasIterator.hasNext()){
            if (pessoasIterator.next().getIdade() <18){
                pessoasIterator.remove();
            }
        }


        for (Pessoas pessoas: pessoa) {
            System.out.println(pessoas.getNome());
            System.out.println(pessoas.getIdade());

        }




    }
}
