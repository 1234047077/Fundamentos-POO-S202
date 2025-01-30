
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*1. Escribir un programa que almacene la cadena de caracteres una contraseña
        en una variable, después que solicite al usuario una contraseña e imprima en
        pantalla si la contraseña introducida por el usuario coincide con la guardada en
        la variable sin tener en cuenta mayúscula y minúscula.*/

        String contraseñaGuardada = "wayOflife123";

        System.out.println("Ingrese la contraseña:");
        String contraseñaUsuario = sc.nextLine();

        // Comparar sin diferenciar mayúsculas y minúsculas
        if (contraseñaGuardada.equalsIgnoreCase(contraseñaUsuario)) {
            System.out.println("Contraseña correcta.");
        } else {
            System.out.println("Contraseña incorrecta.");
        }

    }
}