
public class Main {
    public static void main(String[] args) {

        SpartanII MasterChief = new SpartanII("JOHN", 100, "Fusil", 100);
        MasterChief.mostrarInfo();
        MasterChief.usarManejoAvanzado();
        MasterChief.atacar("ALFREDO ADAME");
        MasterChief.recibirDano(1);
        MasterChief.recargarEscudo();

        SpartanIII NobleSix = new SpartanIII("GUSTAVO ADOLFO INFANTE", 100, "Rifle Plasma", 100);
        NobleSix.mostrarInfo();
        NobleSix.atacar("COVENANT");
        NobleSix.recibirDano(70);
        NobleSix.camuflajeActivo();

        SpartanIV Kelly = new SpartanIV("KELLY", 100, "Escopeta", 100);
        Kelly.mostrarInfo();
        Kelly.usarPropulsores();
        Kelly.atacar("MARCO REGIL");
        Kelly.recibirDano(10);





    }
}