package exercicio02;

public class AuxiliarEscritorio extends Funcionario {

    private double bonusAnual;


    public AuxiliarEscritorio(){};


    public AuxiliarEscritorio(String nome, double salarioMensal, double bonusAnual) {
        super(nome, salarioMensal);
        this.bonusAnual = bonusAnual;
    }


    public double salarioAnual(double salarioMensal){

        return (salarioMensal * 13) + this.bonusAnual;

    }
}
