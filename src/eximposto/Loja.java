package eximposto;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Loja {
    private String nome;
    private int quantidade;
    private String tipo;
    private Set<Livro> livros = new LinkedHashSet<>();
    private Set<VideoGame> games = new LinkedHashSet<>();

    public Loja(String nome, int quantidade, String tipo, Set<Livro> livros, Set<VideoGame> games) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.livros = livros;
        this.games = games;
    }

    public Loja(String americas, int quantidade, List<Livro> livros, List<VideoGame> games) {

    }

    public static void add(Loja americanas) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Set<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Set<Livro> livros) {
        this.livros = livros;
    }

    public Set<VideoGame> getGames() {
        return games;
    }

    public void setGames(Set<VideoGame> games) {
        this.games = games;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", tipo='" + tipo + '\'' +
                ", livros=" + livros +
                ", games=" + games +
                '}';
    }
}

