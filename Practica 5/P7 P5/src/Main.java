
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de * en la base (IMPAR): ");
        int base = sc.nextInt();

        if (base % 2 == 0) {
            System.out.println("La base debe ser un número impar.");
        } else {
            int altura = (base / 2) + 1;
            int i = 1;

            while (i <= altura) {
                int espacios = altura - i;
                int j = 0;

                // ESPACIOS ANTES DE ASTERISCOS
                while (j < espacios) {
                    System.out.print(" ");
                    j++;
                }

                // ASTERISCO
                int k = 0;
                while (k < (2 * i - 1)) {
                    System.out.print("*");
                    k++;
                }

                System.out.println();
                i++;
            }

            // TRONCO ARBOL
            int troncoAltura = base / 5; // ALTURA
            if (troncoAltura == 0) troncoAltura = 1; // 1 LINEA MIN

            int espaciosTronco = (base - 1) / 2;
            int t = 0;
            while (t < troncoAltura) {
                int e = 0;
                while (e < espaciosTronco) {
                    System.out.print(" ");
                    e++;
                }
                System.out.println("*");
                t++;
            }
        }


    }
}

