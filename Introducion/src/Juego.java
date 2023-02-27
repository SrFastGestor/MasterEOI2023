import javax.swing.*;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
      String dato;
      int y = 1;
      int n = 2;
      dato = JOptionPane.showInputDialog("¿Quieres jugar a un juego\n1 para si\n2 para no");

    // con integer.perseint se convierte la variable "dato" de String a int
      int numero = Integer.parseInt(dato);

        boolean comprobar;
      comprobar = numero == y;

      System.out.println("¿El jugador a querido jugar? = " + comprobar);


    }
}
