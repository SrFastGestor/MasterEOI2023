public class BooleanosYcaracteres {
    public static void main(String[] args) {



        //Tipo Char
        //Como teclado
        char caracter1 = '@';
        System.out.println("caracter1 = " + caracter1);
        //En unicode
        char caracter2 = '\u0040';
        System.out.println("caracter2 = " + caracter2);

        //En ASCII
        char caracter3 = 64;
        System.out.println("caracter3 = " + caracter3);

        // Cualquier otro char

        char caracter4 = 'F';
        System.out.println("caracter4 = " + caracter4);

        caracter4 = 'A';
        System.out.println("caracter4 = " + caracter4);
        System.out.println("-----------------------------");

        //Tipo Booleanos
        boolean boleano = true;

        System.out.println("boleano = " + boleano);

        boleano = false;

        System.out.println("boleano = " + boleano);

        int a = 5;
        int b = 8;
        boolean dato;

        dato = a > b;
        System.out.println("dato = " + dato);

        dato = (a - b) == 3;
        System.out.println("dato = " + dato);
// a menos b es 5 - 8 = -3 por lo que al preguntar si es distinto a 3 da que si
        dato = (a - b) != 3;
        System.out.println("dato = " + dato);
// ahora como si son iguales nos devuelve falso
        dato = (a - b) != -3;
        System.out.println("dato = " + dato);

        //resta
        dato = (b - a) == 3 ;
        System.out.println("dato = " + dato);
    }


}
