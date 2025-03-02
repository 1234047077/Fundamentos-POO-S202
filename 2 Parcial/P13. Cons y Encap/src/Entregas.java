import javax.swing.JOptionPane;
public class Entregas {

    private String numeroGuia;
    private String estado;

    public Entregas(String numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";
    }

    public void actualizarEstado() {
        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En tránsito / Entregado):");
        if (nuevoEstado.equalsIgnoreCase("En tránsito") || nuevoEstado.equalsIgnoreCase("Entregado")) {
            this.estado = nuevoEstado;
            JOptionPane.showMessageDialog(null, "Estado actualizado a: " + this.estado);
        } else {
            JOptionPane.showMessageDialog(null, "Estado no válido. Solo se permite 'En tránsito' o 'Entregado'.");
        }
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public String getEstado() {
        return estado;
    }
}



