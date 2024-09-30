package Heranca;

public class Desenvolvedor extends Funcionario{

    @Override
    public double calcularBonus(){
        double bonus = 10;
        return this.salario*bonus/100;
    }
    @Override
    public String trabalhar(){
        return "Desenvolvedor está trabalhando";
    }
}
