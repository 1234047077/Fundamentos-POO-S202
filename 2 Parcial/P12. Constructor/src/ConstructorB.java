import javax.swing.JOptionPane;

public class ConstructorB {
    private int noCuenta;
    private String titular;
    private int saldo;
    private int edad;


    public ConstructorB(int noCuenta, String titular, int saldo, int edad) {
        this.noCuenta = noCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.edad = edad;
    }


    public int getNoCuenta() {
        return noCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getEdad() {
        return edad;
    }

    // Métodos
    public void mostrarRegistros() {
        String mensaje = "-------- REGISTROS --------\n" +
                "NÚMERO DE CUENTA: " + noCuenta + "\n" +
                "TITULAR: " + titular + "\n" +
                "SALDO: $" + saldo + "\n" +
                "EDAD: " + edad;
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void consultarSaldo() {
        JOptionPane.showMessageDialog(null, "-------- SALDO --------\n" +
                "SALDO ACTUAL: $" + saldo);
    }

    public void ingresarEfectivo() {
        String ingreso = JOptionPane.showInputDialog("Ingrese la cantidad que desea ingresar:");
        if (ingreso != null) {
            int ingEfectivo = Integer.parseInt(ingreso);
            if (ingEfectivo <= 0) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor válido.");
            } else {
                saldo += ingEfectivo;
                JOptionPane.showMessageDialog(null, "Operación exitosa.\nSu saldo final es: $" + saldo);
            }
        }
    }

    public void retirarEfectivo() {
        String retiro = JOptionPane.showInputDialog("Ingrese la cantidad que desea retirar:");
        if (retiro != null) {
            int retiroEfectivo = Integer.parseInt(retiro);
            if (retiroEfectivo > saldo) {
                JOptionPane.showMessageDialog(null, "Fondos insuficientes.");
            } else {
                saldo -= retiroEfectivo;
                JOptionPane.showMessageDialog(null, "Operación exitosa.\nSu saldo final es: $" + saldo);
            }
        }
    }

    public void depositar() {
        String numCuentaDep = JOptionPane.showInputDialog("Ingrese el número de cuenta a depositar:");
        String titularDep = JOptionPane.showInputDialog("Ingrese el nombre del titular a depositar:");
        String cantDepStr = JOptionPane.showInputDialog("Ingrese la cantidad a depositar:");

        if (numCuentaDep != null && titularDep != null && cantDepStr != null) {
            int cantDep = Integer.parseInt(cantDepStr);
            if (cantDep <= 0) {
                JOptionPane.showMessageDialog(null, "Error: No puede depositar una cantidad negativa o cero.");
            } else if (cantDep > saldo) {
                JOptionPane.showMessageDialog(null, "Fondos insuficientes para realizar el depósito.");
            } else {
                saldo -= cantDep;
                JOptionPane.showMessageDialog(null, "Depósito realizado con éxito.\nSu saldo final es: $" + saldo);
            }
        }
    }

}
