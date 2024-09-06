public class regex{
    public static void main(String[] args) {
        //procura a ocorrência de 1 caractere
        boolean caractere = "M".matches(".");
        System.out.println(caractere);

        //procura a ocorrência de 2 caractere
        caractere = "Ma".matches("..");
        System.out.println(caractere);

        //validação de cep
        String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
        boolean valida = "99833-000".matches(cep);
        System.out.println(valida);

        //procura a ocorrência de um caractere n vezes
        boolean valor = "29".matches("\\d{2}");
        System.out.println(valor);

        //procura dígitos entre os valores de 2 e 5
        valor = "3131".matches("\\d{2,5}");
        System.out.println(valor);

        //criar expressão regular resumida data
        String data = "02/04/2004";
        valor = data.matches("\\d{2}/\\d{2}/\\d{4}");
        System.out.println("data: "+valor);
    }
}