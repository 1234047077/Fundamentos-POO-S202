import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

        /*5. Escribe un programa que simule una calculadora básica utilizando un switch.
        El usuario debe ingresar dos números y un operador (+, -, *, /). Según el
        operador ingresado, el programa debe realizar la operación correspondiente y
        mostrar el resultado. Si el operador no es válido, el programa debe mostrar un
        mensaje de error.
*/
        System.out.println("\nHOLA, BIENVENIDO, INGRESE EL CALCULO QUE DESEA REALIZAR (+,-,*,/)");


        System.out.print("Ingrese el primer numero: ");
        int primero = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int segundo = sc.nextInt();

        System.out.print("Ingrese el operador: ");
        char operador = sc.next().charAt(0);

        double resultado;
        switch (operador) {
            case '+':
                resultado = primero + segundo;
                    System.out.println("El resultado es: " + resultado);
                    break;

            case '-':
                resultado = primero - segundo;
                System.out.println("El resultado es: " + resultado);
                break;

            case '*':
                resultado = primero * segundo;
                System.out.println("El resultado es: " + resultado);
                break;

            case '/':
                resultado = primero / segundo;
                System.out.println("El resultado es: " + resultado);
                break;

                default:
                    System.out.println("Operador incorrecto, ingrese datos validos");



        }
    }
}