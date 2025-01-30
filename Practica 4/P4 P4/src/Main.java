
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*4. Codifica un programa que solicite una cadena de caracteres e imprima como
        resultado si la cadena es palíndromo o no*/

        System.out.println("Ingrese una cadena de texto: ");
        String texto = sc.nextLine();

//ELIMINAR ESPACIOS, MAYUS, CONVERTIRLO TODO A MINUSCULAS (lowerCase)

        String cadenaLimpia = texto.replaceAll("\\s", "").toLowerCase();

        // COMPRAR CON CADENA INVERTIDA
        String invertida = new StringBuilder(cadenaLimpia).reverse().toString();

        // COMPARACION INVERTIDA CON ORIGINAL
        if (cadenaLimpia.equals(invertida)) {
            System.out.println("La cadena SI es un palíndromo.");
        } else {
            System.out.println("La cadena NO es un palíndromo.");
        }


    }
}