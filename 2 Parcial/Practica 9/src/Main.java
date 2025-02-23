import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Cuenta DatosG = new Cuenta();
        DatosG.NoCuenta = 1023141241;
        DatosG.Titular = "CESAR ACOSTA CORTEZ";
        DatosG.edad = 19;
        DatosG.Saldo = 1690;

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
                    DatosG.RegistrosCuentas();
                    break;

                case 2:
                    DatosG.Saldo();
                    break;

                case 3:
                    DatosG.IngresarEfectivo();
                    break;

                case 4:
                    DatosG.RetirarEfectivo();
                    break;

                case 5:
                    DatosG.Depositos();
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
