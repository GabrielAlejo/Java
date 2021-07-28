import java.util.Scanner;;

public class Person {
	private Scanner scanner;
	private String name;
	private int age;
	
	public void initProgram() {
		scanner = new Scanner(System.in);
		System.out.print("Ingrese nombre: ");
		name = scanner.next();
		System.out.print("Ingrese edad: ");
		age = scanner.nextInt();
	}
	
	public void showData() {
		System.out.println("Nombre: " + name);
		System.out.println("Edad: " + age);
	}
	
	public void showResult() {
		if ( age >= 18 ) {
			System.out.println(name + " es mayor de edad.");
		}
		else {
			System.out.println(name + " es menor de edad.");
		}
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.initProgram();
		p.showData();
		p.showResult();
	}
}
