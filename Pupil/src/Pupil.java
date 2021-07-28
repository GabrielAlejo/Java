import java.util.Scanner;

public class Pupil {
	private Scanner scanner;
	private String name;
	private int age;
	
	public Pupil() {
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
	
	public void isAgeLegal() {
		if ( age >= 18 )
			System.out.println(name + " es mayor de edad");
		else
			System.out.println(name + " no es mayor de edad.");
	}

	public static void main(String[] args) {
		Pupil p = new Pupil();
		p.showData();
		p.isAgeLegal();
	}

}
