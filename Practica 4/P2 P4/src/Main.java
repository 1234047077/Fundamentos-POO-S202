 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*2. Escribir un programa que pida al usuario un número entero y muestre por
        pantalla si es par o impar.
*/

        System.out.println("Ingrese un numero entero: ");
        int num = sc.nextInt();

        //FUNCION PAR O IMPAR
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par.");
        } else {
            System.out.println("El número " + num + " es impar.");
        }

    }
}