 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       /* 3. Escribir un programa para una empresa que tiene salas de juegos para todas
        las edades y quiere calcular de forma automática el precio que debe cobrar a
        sus clientes por entrar. El programa debe preguntar al usuario la edad del cliente
        y mostrar el precio de la entrada. Si el cliente es menor de 4 años puede entrar
        gratis, si tiene entre 4 y 18 años debe pagar $110 y si es mayor de 18 años, $190*/


        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();

        int precio;
        if (edad < 4) {
            precio = 0;
        } else if (edad <= 18) {
            precio = 110;
        } else {
            precio = 190;
        }


        System.out.println("El precio de la entrada es: $" + precio);

    }
}