package excarro;

public class Carro {
    // Atributos
    String marca;
    String modelo;
    String placa;
    String cor;
    float km;
    boolean isLigado;
    int litrosCombustivel;
    int vel;
    double preco;
    int tanque = 60;


    //Métodos getter and setter

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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }
    //Verifica se o motor está ligado ou não
    public void situacaoMotor(){
        if (isLigado){
            System.out.println("Motor ligado");
        }else System.out.println("Motor desligado");

    }

    //Acrescenta o valor pedido para aceleração
    public void acelerar(int aceleracao){
        vel += aceleracao;
    }

    //Acrescenta o valor pedido para abastecer
    public void abastecer(int combustivel) {

        if (litrosCombustivel == tanque || litrosCombustivel > tanque) {
            System.out.println("Não é possivel abastercer mais o tanque já está cheio");
        }
        else  litrosCombustivel += combustivel;
    }

    // Diminui a velocidade
    public void frear (int reduzir){

        if (vel == 0){
            System.out.println("Não é possivel freiar o carro pois ele já está parado");
        }
        else vel -= reduzir;
    }

    public void pintar(String cor) {
        cor = getCor();
    }

    //Verifica se o carro está ligado
    public void ligar (){
        if (this.isLigado){
            System.out.println("O carro esta ligado");

        }this.isLigado = true;

    }

    //Verifica se o carro está ligado
    public void desligar(){
        if (!this.isLigado){
            System.out.println("O carro está desligado");
        }
        if (this.vel > 0){
            this.isLigado = false;
        }
        System.out.println("O carro não pode ser desligado");

    }
}
