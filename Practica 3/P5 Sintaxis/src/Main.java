
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/*  5. Una juguetería tiene mucho éxito en dos de sus productos: payasos y
        muñecas. Suele hacer venta por correo y la empresa de logística les cobra por
        peso de cada paquete así que deben calcular el peso de los payasos y muñecas
        que saldrán encada paquete a demanda. Cada payaso pesa 112 g y cada
        muñeca 75 g.
                Escribir un programa que lea el número de payasos y muñecas vendidos en el
        último pedido y calcule el peso total del paquete que será enviado.
        */

        System.out.println("Ingrese el numero de payasos vendido:");
        int numPy = sc.nextInt();

        System.out.println("Ingrese el numero de muñecas vendidas:");
        int numMu = sc.nextInt();

        int pesoPayaso = 112; // en gramos
        int pesoMuñeca = 75; // en gramos

        int pesoTotal = (numPy * pesoPayaso) + (numMu * pesoMuñeca);

        System.out.println("El peso total del paquete es: " + pesoTotal + " gramos.");




    }
}