import java.util.Scanner;

public class Dia25 {
    public static void main(String[] args) {

        String numero;
        int solucion = 7;
        int p = 5;
        //Iniciamos el scaner
        Scanner dato = new Scanner(System.in);

        System.out.println("Adivina que numero estoy pensando\nDame un numero del 0 al 9");

        numero = dato.nextLine();
       // System.out.println("El numero que has introducido es: " + numero);

        int entrada = Integer.parseInt(numero);
        // System.out.println("numero = " + numero);


        boolean resultado = solucion == entrada;

        System.out.println("¿Has acertado? = " + resultado);


    }
}
