import javax.swing.JOptionPane;
public class Vehiculo {

    private String placa;
    private String modelo;
    private double capacidadCarga;
    private Conductores conductor;

    public Vehiculo(String placa, String modelo, double capacidadCarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
        this.conductor = null;
    }

    public boolean asignarConductor(Conductores conductor) {
        if (this.conductor == null) {
            this.conductor = conductor;
            return true;
        } else {
            return false;
        }
    }

    public static Vehiculo crearVehiculo() {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        double capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga del vehículo:"));

        return new Vehiculo(placa, modelo, capacidadCarga);
    }

    public void mostrarInformacion() {
        String info = "Placa: " + placa + "\nModelo: " + modelo + "\nCapacidad de Carga: " + capacidadCarga + " kg";
        if (conductor != null) {
            info += "\nConductor: " + conductor.getNombre();
        } else {
            info += "\nConductor: No asignado";
        }
        JOptionPane.showMessageDialog(null, info);
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public Conductores getConductor() {
        return conductor;
    }
}