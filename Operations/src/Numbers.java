import java.util.Scanner;

public class Numbers {
	private Scanner scanner;
	private int n1, n2;

	public void initProgram() {
		scanner = new Scanner(System.in);
		System.out.print("Ingrese primer n�mero: ");
		n1 = scanner.nextInt();
		System.out.print("Ingrese segundo n�mero: ");
		n2 = scanner.nextInt();
	}
	
	public void sum() {
		int result = n1 + n2;
		System.out.println("La operaci�n de " + n1 + " + " + n2 + " = " + result);
	}
	
	public void sub() {
		int result = n1 - n2;
		System.out.println("La operaci�n de " + n1 + " - " + n2 + " = " + result);
	}
	
	public void mult() {
		int result = n1 * n2;
		System.out.println("La operaci�n de " + n1 + " * " + n2 + " = " + result);
	}
	
	public void div() {
		int result = n1 / n2;
		System.out.println("La operaci�n de " + n1 + " / " + n2 + " = " + result);
	}
	
	public static void main(String[] args) {
		Numbers n = new Numbers();
		n.initProgram();
		n.sum();
		n.sub();
		n.mult();
		n.div();
	}

}
