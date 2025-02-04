
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Introduce una letra: ");
        char letra = scanner.next().charAt(0);

        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }

        System.out.println("LETRA '" + letra + "' SE ENCUENTRA " + contador + " VECES EN LA FRASE.");
        scanner.close();
    }
}

