import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        
        Scanner scan=new Scanner(System.in);

        //tipos de loops

        //For
        for(int cont=0 ; cont < 5; cont++){
            System.out.println(cont + " - Dudinha");
        }
        System.out.println("fim do loop");

        //While
        System.out.print("digite um numero:");
        int max=scan.nextInt();
        int c=0;
        while(c < max){
            System.out.println(c + " - Ta funcionando.");
            c++;
        }

        //Do
        do{
            System.out.println(c + " - alguma coisa");
            c++;
        }while(c < 0);

    }
}
