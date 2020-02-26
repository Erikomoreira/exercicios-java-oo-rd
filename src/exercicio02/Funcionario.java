package exercicio02;

public abstract class Funcionario {

    private String nome;
    private double salarioMensal;


    public Funcionario(){}

    public Funcionario(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public double salarioAnual(){


        return this.salarioMensal * 13;

    }
}
