
//ZONA DE IMPORTACIÓN

import java.util.Scanner;

// CLASE PRINCIPAL
public class Main {
   //METODO PRINCIPAL (MAIN)
    public static void main(String[] args) {


        /*
         *//*
        System.out.printf("Hello and wordl CESAR ACOSTA!");
        System.out.printf("Hello and wordl CESAR ACOSTA!");
        System.out.printf("Hello and wordl CESAR ACOSTA!");
        *//*

        // 2. CADENAS

    String cadena = "cesar" + "acosta" + "cortez";
    System.out.println(cadena);

//LONGITUD DE LA CADENA, CUANTOS CARACTERES ESTA EN EL CONTENIDO DE ESA CADENA
    System.out.println(cadena.length());

    //EXTRACCION DE CARACTERES EN BASE A PARAMETROS
        System.out.println(cadena.substring(2,5));
        System.out.println(cadena.substring(2));
        System.out.println(cadena.substring(0,5));

        // 3. Variable
        String cadena2 = "333", cadena3, cadena4;
        int entero = 3, entero2, entero3;
        double decimal = 3.32425, decimal2, decimal3;

        //CONVERTIR CADENA A INT () = la cadena que se desea convertir

        entero2= Integer.parseInt(cadena2);
        System.out.println(entero2);

        //CONVERTIR DE UN NUMERO FLOTANTE A INT - DOUBLE A INT

        entero3= (int) decimal;
        System.out.println(entero3);

        //CONVERTIR DE DOUBLE A CADENA

        cadena2 = String.valueOf(decimal);
        System.out.println(cadena2);

        //CONVERTIR INT A DOBULE

        decimal2 = Double.valueOf(entero);
        System.out.println(decimal2);

        //CONVERCIÓN IMPLICITA (tenemos un decimal y queremos pasarlo a un double SOLO NUMERICOS)

        int i = 12;
        double numd = i;
        System.out.println(numd);
        */

        // 4. Solicitud de datos

        //Utilizar un objeto en tipo scanner
  /*  Scanner scn = new Scanner(System.in);

    //Cuando sea cadena usar nextline para especificar y lo vamos a vaciar en el STRING
    System.out.println("Escribe una cadena: ");
    String cadena = scn.nextLine();


    System.out.println("Escribe un numeor entero: ");
    int entero = scn.nextInt();


    System.out.println("Escribe un numero decimal: ");
    double decimal = scn.nextDouble();

//EXPRESAR LOS DATOS INGRESADOS
        System.out.println("Escribe un decimal guardado: " + decimal);
        System.out.println("Escribe un entero guardado: " + entero);
        System.out.println("Escribe un cadena guardado: " + cadena);
*/


// 5. BOOLEAN, OPERADORES LOGICO Y DE COMPARACIÓN

        //OPERADORES DE COMPARACIÓN SIEMPRE DEVUELVEN 1 BOOLEAN
        System.out.println(10>9);
        System.out.println(10 == 9);
        System.out.println(10 < 9);
        System.out.println(10>9);
        System.out.println(10>=9);
        System.out.println(10<=9);
        System.out.println(10!=9);
        //Diferente de

        //OPERADORES LOGICOS
        int x=3;

        System.out.println(x<5 && x>10); //FALSE
        System.out.println(x<5 || x>10);
        System.out.println(!(x< 5 && x>10));
        System.out.println(!(x<5 || x>10));
    }
}
