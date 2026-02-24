public class Programador extends Empleado{
    protected String lenguajeDominante;

    public Programador(String nombre, double salarioBase, String lenguajeDominante) {
        super(nombre, salarioBase);
        this.lenguajeDominante = lenguajeDominante;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }


    @Override
    public double calcularSalario(){
        double base = super.calcularSalario();
        return base *= 1.1;
    }

    @Override
    public String toString(){
        String stringEmpleado = super.toString();
        return stringEmpleado + ". Lenguaje dominante: " + this.lenguajeDominante;
    }
}
