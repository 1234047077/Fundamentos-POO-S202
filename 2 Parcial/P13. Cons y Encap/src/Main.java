import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        ArrayList<Conductores> conductores = new ArrayList<>();
        ArrayList<Envios> envios = new ArrayList<>();
        ArrayList<Entregas> entregas = new ArrayList<>();

        boolean salir = false;
        while (!salir) {
            String opcion = JOptionPane.showInputDialog("Menú:\n" +
                    "1. Registrar Vehículo\n" +
                    "2. Registrar Conductor\n" +
                    "3. Asignar Conductor a Vehículo\n" +
                    "4. Registrar Envío\n" +
                    "5. Registrar Entrega\n" +
                    "6. Actualizar Entrega\n" +
                    "7. Mostrar Información\n" +
                    "8. Salir");

            switch (opcion) {
                case "1":
                    vehiculos.add(Vehiculo.crearVehiculo());
                    break;
                case "2":
                    conductores.add(Conductores.crearConductor());
                    break;
                case "3":
                    if (vehiculos.isEmpty() || conductores.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Debe haber al menos un vehículo y un conductor registrados.");
                    } else {
                        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo para asignar conductor:");
                        for (Vehiculo v : vehiculos) {
                            if (v.getPlaca().equals(placa) && v.getConductor() == null) {
                                v   .asignarConductor(conductores.get(0)); // Se asigna el primer conductor disponible
                                JOptionPane.showMessageDialog(null, "Conductor asignado correctamente.");
                                break;
                            }
                        }
                    }
                    break;
                case "4":
                    envios.add(Envios.crearEnvio());
                    break;
                case "5":
                    String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía de la entrega:");
                    entregas.add(new Entregas(numeroGuia));
                    JOptionPane.showMessageDialog(null, "Entrega registrada con estado: Pendiente");
                    break;
                case "6":
                    numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía para actualizar estado:");
                    for (Entregas e : entregas) {
                        if (e.getNumeroGuia().equals(numeroGuia)) {
                            e.actualizarEstado();
                            break;
                        }
                    }
                    break;
                case "7":
                    StringBuilder info = new StringBuilder("Información Registrada:\n");
                    for (Vehiculo v : vehiculos) {
                        info.append("Vehículo: ").append(v.getPlaca()).append(" - Modelo: ").append(v.getModelo()).append("\n");
                    }
                    for (Conductores c : conductores) {
                        info.append("Conductor: ").append(c.getNombre()).append("\n");
                    }
                    for (Envios e : envios) {
                        info.append("Envío: ").append(e.getCodigoEnvio()).append(" - Destino: ").append(e.getDestino()).append("\n");
                    }
                    for (Entregas e : entregas) {
                        info.append("Entrega: ").append(e.getNumeroGuia()).append(" - Estado: ").append(e.getEstado()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, info.toString());
                    break;
                case "8":
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        }
    }
}

