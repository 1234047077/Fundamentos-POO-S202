import javax.swing.JOptionPane;
import java.security.SecureRandom;

public class GeneradorPass {

    private int longitud;
    private boolean usarMayusculas;
    private boolean usarEspeciales;

    public GeneradorPass(int longitud, boolean usarMayusculas, boolean usarEspeciales) {
        this.longitud = longitud;
        this.usarMayusculas = usarMayusculas;
        this.usarEspeciales = usarEspeciales;
    }

    public String generarContrasena() {
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String letrasMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String caracteresEspeciales = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        String todosCaracteres = letrasMinusculas + numeros;
        if (usarMayusculas) {
            todosCaracteres += letrasMayusculas;
        }
        if (usarEspeciales) {
            todosCaracteres += caracteresEspeciales;
        }

        SecureRandom random = new SecureRandom();
        StringBuilder contrasena = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(todosCaracteres.length());
            contrasena.append(todosCaracteres.charAt(indice));
        }

        return contrasena.toString();
    }

    public String comprobarFortaleza(String contrasena) {
        int fortaleza = 0;

        if (contrasena.length() >= 8) fortaleza++;
        if (contrasena.length() >= 12) fortaleza++;
        if (contrasena.matches(".*[A-Z].*")) fortaleza++;
        if (contrasena.matches(".*\\d.*")) fortaleza++;
        if (contrasena.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\",./<>?].*")) fortaleza++;

        if (fortaleza <= 2) return "DÉBIL";
        if (fortaleza <= 4) return "REGULAR";
        return "FUERTE";
    }
}




