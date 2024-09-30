package Heranca;

public class Gerente extends Funcionario{

    protected double bonus;

    //Métodos construtores
    public Gerente(){
    }
    public Gerente(String nome, String cpf, double salario, double bonus){
        this.nome=nome;
        setSalario(salario);
        this.bonus=bonus;
    }

    @Override
    public double calcularBonus(){
        return this.salario*this.bonus/100;
    }

    @Override
    public String trabalhar(){
        return "Gerente está trabalhando";
    }
}
