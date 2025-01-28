import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*2. Codifica un programa que pregunte el nombre completo del usuario en la
        consola y después muestre por pantalla el nombre completo del usuario tres
        veces, una con todas las letras minúsculas, otra con todas las letras mayúsculas y
        otra solo con la
        primera letra del nombre y de los apellidos en mayúscula. El usuario puede
        introducir su nombre combinando mayúsculas y minúsculas como quiera.
*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo:");
        String nombreCompleto = sc.nextLine();

        String[] palabras = nombreCompleto.split(" ");
        String resultado = "";

        for (String palabra : palabras) {
            resultado += palabra.substring(0, 1).toUpperCase() + palabra.substring(1).toLowerCase() + " ";
        }


        System.out.println( "El nombre completo es: " + nombreCompleto );
        System.out.println( "El nombre completo es: " + nombreCompleto );
        System.out.println( "El nombre completo es: " + nombreCompleto );


        System.out.println( "El nombre completo es: " + nombreCompleto.toLowerCase() );
        System.out.println( "El nombre completo es: " + nombreCompleto.toLowerCase() );
        System.out.println( "El nombre completo es: " + nombreCompleto.toLowerCase() );


        System.out.println( "El nombre completo es: " + nombreCompleto.toUpperCase() );
        System.out.println( "El nombre completo es: " + nombreCompleto.toUpperCase() );
        System.out.println( "El nombre completo es: " + nombreCompleto.toUpperCase() );


        System.out.println( "El nombre completo es: " + resultado.trim());
        System.out.println( "El nombre completo es: " + resultado.trim());
        System.out.println( "El nombre completo es: " + resultado.trim());



    }
}