// tentando fazer uma calculadora simples com Scanner

import java.util.Scanner;

public class bot {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        //entrada de numero:
        System.out.print("Digite um número: ");
        double num1 = scan.nextDouble();
        System.out.print("Digite outro número: ");
        double num2 = scan.nextDouble();

        //escolha da operação:
        System.out.print("Qual operação você quer? + - / * ?: ");
        char operacao = scan.next().charAt(0);
        scan.close();
        double result;

        switch (operacao) {
            case '+':
               result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Algo deu errado");
                return;
        }

        System.out.println(num1+" "+operacao+" "+num2+": "+result);
    }
}