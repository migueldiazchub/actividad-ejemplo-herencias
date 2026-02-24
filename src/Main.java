public class Main {
    public static void main(String[] args){
        Empleado emp1 = new Empleado("Manolo", 2000);
        Programador pro1 = new Programador("Matilda", 2000, "C");
        Gerente ger1 = new Gerente("Grug", 2000, "Contabilidad");

        System.out.println(emp1);
        System.out.println(pro1);
        System.out.println(ger1);
        System.out.println("\n");
        System.out.println(emp1.calcularSalario());
        System.out.println(pro1.calcularSalario());
        System.out.println(ger1.calcularSalario());
    }
}
