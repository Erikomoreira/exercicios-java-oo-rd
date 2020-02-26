package exercicio02;

public class TecnicoManutencao extends Funcionario{

    private double bonusAnual;
    private double isalubridade;

    public TecnicoManutencao(String nome, double salarioMensal, double bonusAnual, double isalubridade) {
        super(nome, salarioMensal);
        this.bonusAnual = bonusAnual;
        this.isalubridade = isalubridade;
    }


    public double salarioAnual(double salarioMensal){

        double salarioAnual = salarioMensal * 13;

        return (salarioAnual) + ((salarioMensal * isalubridade) * 13) + this.bonusAnual;

    }

}
