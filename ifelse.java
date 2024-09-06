public class ifelse {
    public static void main(String[] args){

        // == > < >= <= != ! (true / false)
        
        int nota= 60;
        int media= 60;
        int falta= 7;
        int maxFalta= 3;


        // operação ternária:
        String res;

        res=(nota >= media ? "Aprovado!" : "Reprovado!");
        System.out.println("Resultado: " + res);


        //operação com if/else:
        if((nota >= media) && (falta <= maxFalta)){
            System.out.println("Aprovado!");
        } else if(nota >= 40){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado!");
        }
        System.out.println("fim do programa");
    
        //operação com switch:
        int pos=5;

        switch (pos) {
            case 1:
                System.out.println("Primeiro Lugar!");
                break;
            case 2:
            System.out.println("Segundo lugar!");
                break;
            case 3:
            System.out.println("Segundo lugar!");
                break;
            case 4: case 5: case 6:
            System.out.println("Prêmio de participação, parabéns");
                break;
            default:
            System.out.println("Não subiu no pódio");

        }
    }

}
