
public class Main {
    public static void main(String[] args) {

        //CREAMOS EL PRIMER OBJETO
        Spartan MasterChief = new Spartan("John", 100,70,"Rifle de Asalto");


        //INVOCAMOS LOS METODOS
        MasterChief.mostrarInfo();
        MasterChief.atacar(" Grunt ");
        MasterChief.recargarArma(75);
        MasterChief.correr(true);

//INTENTO DE USO DE UN METODO PRIVADO
        //MasterChief.consultaCortana();

        //USAMOS GET Y SET PARA CAMBIAR ATRIBUTO NOMBRE
        MasterChief.setNombre("CESAR");
        MasterChief.mostrarInfo();
        MasterChief.getNombre();
        System.out.println(MasterChief.getNombre());

        //CREAMOS EL SEGUNDO OBJETO
        Spartan NobleSix = new Spartan("Noble Six",30,25,"Pistola de Plasma");

        //METODOS
        NobleSix.mostrarInfo();
        NobleSix.atacar("Grunt ");
        NobleSix.recargarArma(10);
        NobleSix.correr(false);

    }
}