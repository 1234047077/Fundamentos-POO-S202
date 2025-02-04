
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Introduce un número entero positivo: ");
                int numero = scanner.nextInt();


                if (numero <= 0) {
                    System.out.println("Introduce un número entero positivo.");
                } else {

                    System.out.print("Números impares desde 1 hasta " + numero + ": ");
                    for (int i = 1; i <= numero; i += 2) {
                        if (i != 1) {
                            System.out.print(", ");
                        }
                        System.out.print(i);
                    }
                }

            }
        }
