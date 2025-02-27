
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        ConstructorB cuenta = new ConstructorB(1023141241, "CESAR ACOSTA CORTEZ", 1690, 19);

        int op;

        do {
            String opcion = JOptionPane.showInputDialog(
                    "BIENVENIDO, SELECCIONE LA OPERACIÓN A REALIZAR:\n" +
                            "1. DATOS GENERALES\n" +
                            "2. CONSULTAR SALDO\n" +
                            "3. INGRESAR EFECTIVO\n" +
                            "4. RETIRAR EFECTIVO\n" +
                            "5. DEPÓSITO\n" +
                            "6. SALIR");

            if (opcion == null) {
                break;
            }

            op = Integer.parseInt(opcion);

            switch (op) {
                case 1:
                    cuenta.mostrarRegistros();
                    break;
                case 2:
                    cuenta.consultarSaldo();
                    break;
                case 3:
                    cuenta.ingresarEfectivo();
                    break;
                case 4:
                    cuenta.retirarEfectivo();
                    break;
                case 5:
                    cuenta.depositar();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema. ¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
            }
        } while (op != 6);
    }
}

