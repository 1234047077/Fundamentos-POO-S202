import javax.swing.JOptionPane;

public class Envios {

    private String codigoEnvio;
    private String destino;
    private double peso;


    public Envios(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = 0;
    }


    public Envios(String codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    public static Envios crearEnvio() {
        String codigoEnvio = JOptionPane.showInputDialog("Ingrese el código de envío:");
        String destino = JOptionPane.showInputDialog("Ingrese el destino del envío:");
        String respuestaPeso = JOptionPane.showInputDialog("¿Desea ingresar el peso? (S/N):");

        if (respuestaPeso.equalsIgnoreCase("S")) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del envío en kg:"));
            return new Envios(codigoEnvio, destino, peso); // Cambiado a Envios
        } else {
            return new Envios(codigoEnvio, destino);
        }
    }

    //GETS
    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public double getPeso() {
        return peso;
    }

//SET PESO
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null,
                "Código: " + codigoEnvio +
                        "\nDestino: " + destino +
                        "\nPeso: " + peso + " kg");
    }
}
