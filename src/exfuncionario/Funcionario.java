package exfuncionario;

public class Funcionario {
    public static void main(String[] args) {

        // Instanciando
        Gerente g1 = new Gerente();
        Supervisor s1 = new Supervisor();
        Vendedor v1 = new Vendedor();

        // Atributos
        g1.nome = "Pedro";
        g1.idade = 45;
        g1.salario = 20000.0;
        System.out.println("Gerente: " + g1.nome);
        System.out.println("Idade: " + g1.idade);
        System.out.println("Salario: " + g1.salario);
        g1.bonificacao(10000.0);
        System.out.println("Salario com a bonificação: " + g1.salario);

        System.out.println("-------------");

        s1.nome = "Vanessa";
        s1.idade = 34;
        s1.salario = 12000.0;
        System.out.println("Supervisor: " + s1.nome);
        System.out.println("Idade: " + s1.idade);
        System.out.println("Salario " + s1.salario);
        s1.bonificacao(5000.0);
        System.out.println("Salario com a bonificação: " + s1.salario);

        System.out.println("-------------");

        v1.nome = "Marco";
        v1.idade = 26;
        v1.salario = 3000.0;
        System.out.println("Vendedor: " + v1.nome);
        System.out.println("Idade: " + v1.idade);
        System.out.println("Salario " + v1.salario);
        v1.bonificacao(3000.0);
        System.out.println("Salario com a bonificação: " + v1.salario);

        System.out.println("-------------");

    }

    private void setSalario(double v) {
    }
}
