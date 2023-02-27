public class ConvercionNumerica {
    public static void main(String[] args) {
        int numero = 14;

        //imprime en binario
        System.out.println("Binario = " + Integer.toBinaryString(numero));

        //imprime en octal
        System.out.println("Octal = " + Integer.toOctalString(numero));

        //imprime en exadecimal
        System.out.println("Exadecimal = " + Integer.toHexString(numero));
    }


}
