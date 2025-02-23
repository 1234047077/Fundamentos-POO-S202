import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.Random;
import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {


        GeneradorPass generador = new GeneradorPass();


        String LongContra = JOptionPane.showInputDialog("INTRODUCE LONGITUD DE CONTRASEÑA (8 POR DEFUALT):");
        int longitud = validarLongitud(LongContra); // Validar la longitud


        int InclMays = JOptionPane.showConfirmDialog(null, "¿MAYUSCULAS?", "MAYUSCULAS", JOptionPane.YES_NO_OPTION);
        boolean usarMayusculas = (InclMays == JOptionPane.YES_OPTION);


        int InclEspeciales = JOptionPane.showConfirmDialog(null, "¿CARACTERES ESPECIALES?", "CARACTERES ESCPECIALES", JOptionPane.YES_NO_OPTION);
        boolean usarEspeciales = (InclEspeciales == JOptionPane.YES_OPTION);


        String contrasena = generador.generarContrasena(longitud, usarMayusculas, usarEspeciales);


        JOptionPane.showMessageDialog(null, "TU CONTRASEÑA CREADA" + ": " + contrasena, "CONTRASEÑA CREADA", JOptionPane.INFORMATION_MESSAGE);


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
                    JOptionPane.showMessageDialog(null, "VALOR INVALIDO, TIENE QUE SER MAYOR QUE 0. DEFUALT (8).", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VALOR INVALIDO, DEFUALT (8).", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        }
        return longitud;
    }
}