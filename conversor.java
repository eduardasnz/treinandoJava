//Fazer um conversor de celsius para fahrenheit e vise/versa

import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //entrada de dados:
        System.out.print("Quantos graus em celsius está fazendo agora? ");
        double celsius = scan.nextDouble();
        scan.close();

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Em celsius é: "+celsius+"°"+". Em fahrenheit é: "+fahrenheit+"F");

    }
}