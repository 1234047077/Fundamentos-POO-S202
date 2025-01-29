
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
/*
        6. Crea un programa que pida al usuario que introduzca una frase en y muestre
        en pantalla la frase invertida.*/

        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();

        // INVERTIR LA FRASE
        String fraseInvertida = new StringBuilder(frase).reverse().toString();

        System.out.println(fraseInvertida);
    }
}