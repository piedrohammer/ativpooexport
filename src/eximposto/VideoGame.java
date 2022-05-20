package eximposto;

public class VideoGame {

    String nome;
    int preco;
    int quantidade;
    String marca;
    String modelo;
    boolean usado;

    public VideoGame(String nome, int preco, int quantidade, String marca, String modelo, boolean usado) {

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean usado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        usado = usado;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", usado=" + usado +
                '}';
    }
}
