public class Gerente extends Empleado {
    protected String departamento;

    public Gerente(String nombre, double salarioBase, String departamento) {
        super(nombre, salarioBase);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    @Override
    public double calcularSalario(){
        double base = super.calcularSalario();
        return base + 500;
    }

    @Override
    public String toString(){
        String stringEmpleado = super.toString();
        return stringEmpleado + ". Departamento: " + this.departamento;
    }
}
