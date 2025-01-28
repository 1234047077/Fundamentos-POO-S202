
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Solicita Numero de horas trabajadas

        Scanner scn = new Scanner(System.in);

    System.out.println("Ingrese numero de horas trabajadas: ");
    int horas = scn.nextInt();

    System.out.println("Ingrese el costo por hora: ");
    double costo = scn.nextDouble();

    double pago = horas * costo;

    System.out.println("El pago es: " + pago);


    }
}