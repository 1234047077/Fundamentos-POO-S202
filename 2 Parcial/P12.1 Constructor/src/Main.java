
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String LongContra = JOptionPane.showInputDialog("INTRODUCE LONGITUD DE CONTRASEÑA (8 POR DEFAULT):");
        int longitud = validarLongitud(LongContra);

        int InclMays = JOptionPane.showConfirmDialog(null, "¿MAYÚSCULAS?", "MAYÚSCULAS", JOptionPane.YES_NO_OPTION);
        boolean usarMayusculas = (InclMays == JOptionPane.YES_OPTION);

        int InclEspeciales = JOptionPane.showConfirmDialog(null, "¿CARACTERES ESPECIALES?", "CARACTERES ESPECIALES", JOptionPane.YES_NO_OPTION);
        boolean usarEspeciales = (InclEspeciales == JOptionPane.YES_OPTION);

        GeneradorPass generador = new GeneradorPass(longitud, usarMayusculas, usarEspeciales);

        String contrasena = generador.generarContrasena();
        JOptionPane.showMessageDialog(null, "TU CONTRASEÑA CREADA: " + contrasena, "CONTRASEÑA CREADA", JOptionPane.INFORMATION_MESSAGE);

        String fortaleza = generador.comprobarFortaleza(contrasena);
        JOptionPane.showMessageDialog(null, "FORTALEZA: " + fortaleza, "FORTALEZA", JOptionPane.INFORMATION_MESSAGE);
    }


    public static int validarLongitud(String entrada) {
        int longitud = 8; // Valor por defecto
        if (entrada != null && !entrada.isEmpty()) {
            try {
                int valor = Integer.parseInt(entrada);
                if (valor > 0) {
                    longitud = valor;
                } else {
                    JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO, DEBE SER MAYOR QUE 0. USANDO DEFAULT (8).", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO, USANDO DEFAULT (8).", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        }
        return longitud;
    }
}


