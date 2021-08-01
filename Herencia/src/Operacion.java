import java.util.Scanner;

public class Operacion {
	protected Scanner scanner;
	protected int valor1, valor2, resultado;
	
	public Operacion() {
		scanner = new Scanner(System.in);
	}
	
	public void cargar1() {
		System.out.print("Ingrese primer valor: ");
		valor1 = scanner.nextInt();
	}
	
	public void cargar2() {
		System.out.print("Ingrese segundo valor: ");
		valor2 = scanner.nextInt();
	}
	
	public int showResult() {
		return resultado;
	}
}
