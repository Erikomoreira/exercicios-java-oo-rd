package exercicio02;

public class Gerente extends Funcionario {

    private double bonusVariavel;


    public Gerente(String nome, double salarioMensal, double bonusVariavel) {
        super(nome, salarioMensal);
        this.bonusVariavel = bonusVariavel;
    }


    public double salarioAnual(double salarioMensal){

        double salarioAnual = salarioMensal * 13;

        return (salarioAnual) + (salarioMensal * this.bonusVariavel);

    }

}
