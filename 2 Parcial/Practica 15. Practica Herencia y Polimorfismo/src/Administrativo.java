import javax.swing.JOptionPane;
 class Administrativo extends Empleado{

  private String Departamento;

  public Administrativo(String nombre, int id, double salario, String departamento) {
    super(nombre, id, salario);
    this.Departamento = departamento;
  }

  @Override
  public void mostrarInformacion() {
    super.mostrarInformacion();
    JOptionPane.showMessageDialog(null, "Administrativo: " + nombre + "\nID: " + id + "\nSalario: $" + salario + "\nDepartamento: " + Departamento);
  }


}
