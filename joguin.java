import java.util.Scanner;
import java.util.Random;

public class joguin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();


        int tentativas=0;
        int max=10;

        System.out.println("Advinhe em que número eu estou pensando: ");

        int numero = random.nextInt(10);

        while (tentativas < max) {
            int a = scan.nextInt();
            tentativas++;
            if (a == numero) {
                System.out.printf("Parabéns, finalmente acertou! Só precisou de %d para acertar...",tentativas);
                break;
            } else {
                System.err.println(" ERROU!!!!!!! ");
            }
        }
    }
}
