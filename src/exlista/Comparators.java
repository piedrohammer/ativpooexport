package exlista;

public class Comparators {
    class Pessoas implements Comparable<Pessoas> {

        public final String nome;
        public final Integer idade;

        Pessoas(String nome, Integer idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public Integer getIdade() {
            return idade;
        }

        @Override
        public int compareTo(Pessoas o) {
            return 0;
        }
    }
}
