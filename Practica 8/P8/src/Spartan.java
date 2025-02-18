public class Spartan {

    public String nombre;
    int escudo, salud;
    String armaPrincipal;

    public void mostrarInfo() {
        System.out.println("----INFORMACIÓN DEL SPARTAN----");
        System.out.println("SPARTAN: " + nombre);
        System.out.println("% DE SALUD: " + salud);
        System.out.println("% DE ESCUDO: " + escudo);
        System.out.println("ARMA DISPONIBLE: " + armaPrincipal);
        System.out.println("-----------------------------------");
    }//LLAVE MOSTRAR INFO

    public void atacar(String enemigo) {
        System.out.println(nombre + " ATACA A " + enemigo + "CON "+ armaPrincipal);
    }

    public void recargarArma (int municiones){
        int restantes = 10;
        int total = restantes + municiones;
        System.out.println(armaPrincipal+ " AHORA TIENE DISPONIBLE " + total + "balas");

    }


    public void correr(boolean status){
        if(status){
            System.out.println(nombre+ " ESTA CORRIENDO");
        }else{
            System.out.println(nombre+ " SE DETUVO");
        }

    }







}//LLAVE DE LA CLASE
