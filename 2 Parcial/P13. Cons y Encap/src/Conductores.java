import javax.swing.JOptionPane;
public class Conductores {

    private String Nombre;
    private String Identificacion;
    private String Licencia;

    public Conductores(String nombre, String identificacion, String licencia) {
        this.Nombre = nombre;
        this.Identificacion = identificacion;
        this.Licencia = licencia;
    }

public static Conductores crearConductor() {
        String Nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
        String Identificacion = JOptionPane.showInputDialog("Ingrese la identificación del conductor:");
        String Licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");
        return new Conductores(Nombre, Identificacion, Licencia);
}

    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Nombre: " + Nombre + "\nIdentificación: " + Identificacion + "\nLicencia: " + Licencia);
    }


//GETS
    public String getNombre() {
        return Nombre;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public String getLicencia() {
        return Licencia;
    }

//SETS Solo para el nombre (identificación y licencia no pueden modificarse)

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}

