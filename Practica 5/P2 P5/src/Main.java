import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número ENTERO positivo: ");
        int numero = sc.nextInt();

        if (numero >= 0) {
            // Realizar la cuenta atrás
            System.out.print("Cuenta REGRESIVA: ");
            for (int i = numero; i >= 0; i--) {
                if (i == 0) {
                    System.out.print(i); // Último número sin coma
                } else {
                    System.out.print(i + ", ");
                }
            }
        } else {
            System.out.println("El número debe ser un entero positivo.");
        }


    }
}
