
public class Main {
    public static void main(String[] args) {

        //CREAMOS EL PRIMER OBJETO
        Spartan MasterChief = new Spartan();

        //USAR ATRIBUTOS
        MasterChief.nombre = "John";
        MasterChief.salud = 100;
        MasterChief.escudo = 140;
        MasterChief.armaPrincipal = "Rifle de asalto";

        //INVOCAMOS LOS METODOS
        MasterChief.mostrarInfo();
        MasterChief.atacar(" Grunt ");
        MasterChief.recargarArma(75);
        MasterChief.correr(true);

        //CREAMOS EL SEGUNDO OBJETO
        Spartan NobleSix = new Spartan();

        //ATRIBUTOS
        NobleSix.nombre = "Noble Six";
        NobleSix.salud = 150;
        NobleSix.escudo = 20;
        NobleSix.armaPrincipal = "Pistola de Plasma";

        //METODOS
        NobleSix.mostrarInfo();
        NobleSix.atacar("Grunt ");
        NobleSix.recargarArma(10);
        NobleSix.correr(false);

    }
}