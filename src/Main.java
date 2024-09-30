import Encapsulamento.Produto;
import Heranca.Funcionario;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("Atividade 08 - Progração Orientada a Objetos\n1-Encapsulamento\n2-Heranca\n3-Polimorfismo\n4-Abstração\n9-Sair");
        do{
        System.out.print("Digite uma opção: ");
        op = sc.nextInt();
        switch (op) {
            case 1:
                Produto produto = new Produto();
                System.out.print("Digite o nome do produto: ");
                sc.next();
                produto.setNome(sc.nextLine());
                System.out.print("Digite o quantidade do produto: ");
                produto.setQuantidade(sc.nextInt());
                System.out.print("Digite o valor da produto: ");
                produto.setPreco(sc.nextDouble());
                System.out.println("Produto cadastrado: " + produto.toString());
                System.out.println("O produto possui desconto? Caso sim, digite a porcentagem aplicada (%). Caso não, digite 0");
                double desconto = sc.nextDouble();
                System.out.println("Preço com desconto: R$ " + produto.aplicarDesconto(desconto));
                break;
            case 2:
                int op2;
                do {
                    System.out.println("Cadastro de funcionários\n1-Cadastrar funcionario;\n2-Cadastrar desenvolvedor\n3-Cadastrar gerente\n9-Sair");
                    op2= sc.nextInt();
                }while(op2!=9);
                switch(op2){
                    case 1:
                        Funcionario func1 = new Funcionario();
                        System.out.print("Digite o nome do Funcionario: ");
                        sc.next();
                        func1.setNome(sc.next());
                        System.out.print("Digite o salário do Funcionario: ");
                        func1.setSalario(sc.nextDouble());
                        System.out.println("Funcionário cadastrado: " + func1.toString());
                        break;
                    case 2:
                        Funcionario gerente = new Gerente();
                        System.out.print("Digite o nome do Funcionario: ");
                        sc.next();
                        gerente.setNome(sc.next());
                        System.out.print("Digite o salário do Funcionario: ");
                        gerente.setSalario(sc.nextDouble());
                        System.out.println("Funcionário cadastrado: " + func1.toString());

                        break;
                    case 3:
                        Funcionario func1 = new Funcionario();
                        System.out.print("Digite o nome do Funcionario: ");
                        sc.next();
                        func1.setNome(sc.next());
                        System.out.print("Digite o salário do Funcionario: ");
                        func1.setSalario(sc.nextDouble());
                        System.out.println("Funcionário cadastrado: " + func1.toString());
                        break;
                }

                break;
            case 3:
                break;
            case 4:
                break;
            case 9:
                System.out.println("Volte sempre!");
            default:
                break;


        }while(op!=9);
        }
    }
}