import javax.swing.*;

public class IntroducionDeDatos {
    public static void main(String[] args) {
        // Leer dato (en formato String)
        String dato;
        //Introduce datos por ventana emergente
        dato = JOptionPane.showInputDialog("Dame un numero entero");
        System.out.println("imprime lo introducido = " + dato);

        // convierte la variable de formato string con integer en un int (numero entero)
        int numero = Integer.parseInt(dato);

        System.out.println("imprime ya como int = " + dato);
        //imprime en binario
        System.out.println("Binario = " + Integer.toBinaryString(numero));

        //imprime en octal
        System.out.println("Octal = " + Integer.toOctalString(numero));

        //imprime en exadecimal
        System.out.println("Exadecimal = " + Integer.toHexString(numero));

    }
}
