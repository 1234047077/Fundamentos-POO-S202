import javax.swing.JOptionPane;

public class Cuenta {
    int NoCuenta;
    String Titular;
    int Saldo;
    int edad;

    public void RegistrosCuentas() {
        String mensaje = "-------- REGISTROS --------\n" +
                "NÚMERO DE CUENTA: " + NoCuenta + "\n" +
                "TITULAR: " + Titular + "\n" +
                "SALDO: $" + Saldo + "\n" +
                "EDAD: " + edad;
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void Saldo() {
        JOptionPane.showMessageDialog(null, "-------- SALDO --------\n" +
                "SALDO ACTUAL: $" + Saldo);
    }

    public void IngresarEfectivo() {
        String ingreso = JOptionPane.showInputDialog("Ingrese la cantidad que desea ingresar:");
        if (ingreso != null) {
            int ingEfectivo = Integer.parseInt(ingreso);
            if (ingEfectivo < Saldo){
                JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
            } else {

                Saldo += ingEfectivo;
                JOptionPane.showMessageDialog(null, "Operación exitosa.\nSu saldo final es: $" + Saldo);
            }
        }

    }

    public void RetirarEfectivo() {
        String retiro = JOptionPane.showInputDialog("Ingrese la cantidad que desea retirar:");
        if (retiro != null) {
            int RetiroEfectivo = Integer.parseInt(retiro);
            if (RetiroEfectivo > Saldo) {
                JOptionPane.showMessageDialog(null, "Fondos insuficientes.");
            } else {
                Saldo -= RetiroEfectivo;
                JOptionPane.showMessageDialog(null, "Operación exitosa.\nSu saldo final es: $" + Saldo);
            }
        }
    }

    public void Depositos() {
        String numCuentaDep = JOptionPane.showInputDialog("Ingrese el número de cuenta a depositar:");
        String titularDep = JOptionPane.showInputDialog("Ingrese el nombre del titular a depositar:");
        String cantDepStr = JOptionPane.showInputDialog("Ingrese la cantidad a depositar:");

        if (numCuentaDep != null && titularDep != null && cantDepStr != null) {
            int cantDep = Integer.parseInt(cantDepStr);

            if (cantDep > Saldo) {
                JOptionPane.showMessageDialog(null, "Fondos insuficientes para realizar el depósito.");
            } else {
                Saldo -= cantDep;
                JOptionPane.showMessageDialog(null, "Depósito realizado con éxito.\nSu saldo final es: $" + Saldo);
            }
        }
    }
}
