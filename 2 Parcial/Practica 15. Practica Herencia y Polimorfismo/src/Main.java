import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        int op;
        do {
            String[] opciones = {"Agregar Empleado", "Listar Empleados", "Salir"};
            op = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Gestión de Empleados",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (op) {
                case 0:
                    agregarEmpleado(empleados);
                    break;
                case 1:
                    listarEmpleados(empleados);
                    break;
            }
        } while (op != 2);
    }

    public static void agregarEmpleado(ArrayList<Empleado> empleados) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado:"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));

        String[] tipos = {"Conductor", "Administrativo"};
        int tipo = JOptionPane.showOptionDialog(null, "Seleccione el tipo de empleado", "Tipo de Empleado",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tipos, tipos[0]);

        if (tipo == 0) {
            String licencia = JOptionPane.showInputDialog("Ingrese el tipo de licencia:");
            empleados.add(new Conductor(nombre, id, salario, licencia));
        } else {
            String departamento = JOptionPane.showInputDialog("Ingrese el departamento:");
            empleados.add(new Administrativo(nombre, id, salario, departamento));
        }
    }

    public static void listarEmpleados(ArrayList<Empleado> empleados) {
        if (empleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
        } else {
            for (Empleado e : empleados) {
                e.mostrarInformacion();
            }
        }
    }
}
