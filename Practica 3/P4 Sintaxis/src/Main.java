
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      /*  4. Codifica un programa que pregunte el nombre del usuario y después de que
        el usuario lo introduzca muestre por pantalla <NOMBRE> tiene <n> letras,
                donde<NOMBRE> es el nombre de usuario en mayúsculas y <n> es el número
        de letras que tienen el nombre.  */

    System.out.println("Ingrese su nombre de usuario: ");
    String nombre = sc.nextLine().trim();

// Convertir a mayúsculas y contar letras (sin espacios)
        String nomMayus = nombre.toUpperCase();
        int numLetras = nombre.replace(" ", "").length();


        System.out.println( nomMayus + " tiene " + numLetras + " letras.");


    }
}