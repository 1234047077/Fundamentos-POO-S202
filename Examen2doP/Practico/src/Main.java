import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Generador generador = Generador.Datos();
        String matricula = generador.getMatricula();
        JOptionPane.showMessageDialog(null, "Matrícula generada: " + matricula);

    }
}



