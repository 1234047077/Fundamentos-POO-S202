import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo = 0;

        System.out.println("Introduce las operaciones (D+ cantidad para depósito, R+ cantidad para retiro).");
        System.out.println("Presiona ENTER PARA finalizar.");

        while (true) {
            String entrada = sc.nextLine().trim();
            if (entrada.isEmpty()) break;

            char tipo = entrada.charAt(0);
            int cantidad = Integer.parseInt(entrada.substring(2));

            if (tipo == 'D') {
                saldo += cantidad;
            } else if (tipo == 'R') {
                saldo -= cantidad;
            } else {
                System.out.println("Operación inválida. Usa 'D' para depósito o 'R' para retiro.");
            }
        }

        System.out.println("Saldo final: " + saldo + " pesos.");

    }
}
