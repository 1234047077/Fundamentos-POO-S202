public class Spartan {

    private String nombre;
    private int escudo;
    private int salud;
    private String armaPrincipal;

    //CONSTRUCTOR


    public Spartan(String nombre, int escudo, int salud, String armaPrincipal) {
        this.nombre = nombre;
        this.escudo = escudo;
        this.salud = salud;
        this.armaPrincipal = armaPrincipal;
    }

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

    private void ConsultaCortana(){
        System.out.println("CONVERSACIÓN PRIVADA.... :0");
    }

    // ZONA GETS Y SETS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }





}//LLAVE DE LA CLASE
