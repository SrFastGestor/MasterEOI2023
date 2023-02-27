import java.util.Scanner;

public class juegoNumero {
    public static void main(String[] args) {
        int x = 9;
        int variableDelia;
         Scanner variableBloom = new Scanner(System.in);
        System.out.println("Facilitame un numero");
        String entrada = variableBloom.nextLine();
        //System.out.println(entrada);

        variableDelia = Integer.parseInt(entrada);
        boolean manolito;
        manolito = (x == variableDelia);
        System.out.println("Tu resultado es = " + manolito);


    }
}
