
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*3. Escribir un programa que solicite un entero X, introducido por el usuario y
        después
        muestre en pantalla la suma de todos los enteros desde 1 hasta X .*/

        System.out.println("Ingrese numero entero: ");
        int num = sc.nextInt();

        // SUMA LOS ENTEROS 6, 1+2+3+4+5+6 = 21
        int suma = 0;
        for (int i = 1; i <= num; i++) {
            suma += i;
        }

        System.out.println("Suma de todos los enteros desde 1 hasta X: " + suma);


    }
}