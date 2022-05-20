package excarro;

public class CarroTestar {
    public static void main(String[] args) {

        Carro c1 = new Carro();

        c1.setMarca("Fiat");
        System.out.println("O Carro é da marca" + c1.getMarca());

        c1.setModelo("Uno");
        System.out.println("O modelo do carro é: " + c1.getModelo());

        c1.setPlaca("ABC1234");
        System.out.println("A placa do carro é: " + c1.getPlaca());

        c1.setCor("Preto");
        System.out.println("A cor do carro é: " + c1.getCor());

        c1.setKm(40000);
        System.out.println("A quilometragem do carro é: " + c1.getKm());

        c1.setLigado(true);
        System.out.println();

        c1.setLitrosCombustivel(40);
        System.out.println("A quantidade de litros de combustível atual é de: " + c1.getLitrosCombustivel());

        c1.setVel(60);
        System.out.println("A velocidade atual é de: " + c1.getVel());

        c1.setPreco(450000);
        System.out.println("O preço do carro é: " + c1.getPreco());

        c1.setTanque(60);
        System.out.println("A capacidade maxima de gasolina é de: " + c1.getTanque());

        System.out.println("------------------------------------------");

        c1.acelerar(20);
        System.out.println("A sua velocidade atual é de: " + c1.vel);

        c1.abastecer(40);
        System.out.println("A quantidade de litros de combustível atual é de: " + c1.getLitrosCombustivel());

        c1.frear(60);
        System.out.println("A sua velocidade atual é de: " + c1.vel);

        c1.pintar("Branco");
        System.out.println(c1.cor);

        c1.ligar();
        c1.situacaoMotor();
        c1.desligar();






    }
}