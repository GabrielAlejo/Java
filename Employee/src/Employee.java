import java.util.Scanner;

public class Employee {
	private Scanner scanner;
	private String name;
	private float salary;
	
	public void initProgram() {
		scanner = new Scanner(System.in);
		System.out.print("Ingrese nombre de empleado: ");
		name = scanner.next();
		System.out.print("Ingrese su salario: ");
		salary = scanner.nextFloat();
	}
	
	public void showEmploye() {
		System.out.println("Nombre del empleado: " + name);
		System.out.println("Salario del empleado: " + salary);
	}
	
	public void calcSalary() {
		if ( salary >= 3000 )
			System.out.println("Debe pagar impuestos");
		else 
			System.out.println("No paga impuestos");
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.initProgram();
		e.showEmploye();
		e.calcSalary();
	}

}
