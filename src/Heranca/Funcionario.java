package Heranca;

public class Funcionario {
    protected String nome;
    protected double salario;

    //Metodos construtores
    public Funcionario(){

    }
    public Funcionario(double salario, String nome) {
        this.nome = nome;
        setSalario(salario);
    }

    //Metodos de acesso
    public String getNome() {
        return this.nome;
    }
    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        if(salario>=0){
            this.salario = salario;
        }else{
            this.salario = 0;
            System.out.println("Salário inválido. Definido como R$ 0,00");
        }
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Outros metodos
    public double calcularBonus(){
        double bonus = 0;
        return salario*bonus;
    }

    public String trabalhar(){
        return "Funcionário está trabalhando";
    }
}
