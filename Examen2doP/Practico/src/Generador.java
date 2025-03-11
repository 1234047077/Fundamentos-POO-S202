import javax.swing.JOptionPane;
import java.util.Random;

public class Generador {

    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private int AnoNacimiento;
    private String Carrera;
    private String matricula;

    public Generador(String Nombre, String ApellidoPaterno, String ApellidoMaterno, int AnoNacimiento, String Carrera){
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.AnoNacimiento = AnoNacimiento;
        this.Carrera = Carrera;
        this.matricula = generarMatricula();

    }

    public static Generador Datos(){
        String Nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
        String ApellidoPaterno = JOptionPane.showInputDialog("Ingrese su Apellido Paterno");
        String ApellidoMaterno = JOptionPane.showInputDialog("Ingrese su Apellido Materno");
        int AnoNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Año de Nacimiento"));
        String Carrera = JOptionPane.showInputDialog("Ingrese su Carrera");
        return new Generador(Nombre,ApellidoPaterno,ApellidoMaterno,AnoNacimiento,Carrera);

    }

    public String generarMatricula(){
        Random random = new Random();
        int AnoActual = 2025;
        String matricula = "";
        matricula += Carrera.substring(0, 3);
        matricula += String.format("%02d", AnoActual % 100);
        matricula += String.format("%02d", AnoNacimiento % 100);
        matricula += Nombre.substring(0, 1);
        matricula += ApellidoPaterno.substring(0, 3);
        matricula += ApellidoMaterno.substring(0, 3);
        matricula += String.format("%03d", random.nextInt(25));
        return matricula;
    }

    public String getMatricula(){
        return matricula;
    }
}
























