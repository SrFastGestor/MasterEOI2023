import java.util.Scanner;

public class IntroducionConsola {
    public static void main(String[] args) {
        //ejercicio leer datos desde la consola

        String dato;

        //crear objeto de la clase scaner // system in es como se llama la consola, system out es salida por consola
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un dato");

        // next line hace que cuando le demos un enter almacene el dato
        dato = entrada.nextLine();


        System.out.println("Dato que me has introducido = " + dato);
    }
}
