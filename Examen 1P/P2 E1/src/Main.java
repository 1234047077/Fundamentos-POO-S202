
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Programa que solicite una palabra y que la descomponga en letras ejemplo: IVAN
        Resultado: Letra 1: I Letra 2: V Letra 3: A Letra 4: N */

        Scanner sc = new Scanner(System.in);

                System.out.print("INTRODUCE UNA PALABRA: ");
                String palabra = sc.nextLine();

                for (int i = 0; i < palabra.length(); i++) {
                    System.out.println("Letra " + (i + 1) + ": " + palabra.charAt(i));
                }

            }
        }


