import java.util.Scanner;

public class Operacion {
	private Scanner sScanner;
	private int iValor1, iValor2;

	public Operacion() {
		sScanner = new Scanner(System.in);
		
		System.out.print("Ingrese primer valor: ");
		iValor1 = sScanner.nextInt();
		
		System.out.print("Ingrese segundo valor: ");
		iValor2 = sScanner.nextInt();
	}
	
	public void Suma() {
		int resultado;
		resultado = iValor1 + iValor2;
		
		System.out.println("El resultado de la Suma es: " + resultado);
	}
	
	public void Resta() {
		int resultado;
		resultado = iValor1 - iValor2;
		
		System.out.println("El resultado de la Resta es: " + resultado);
	}
	
	public void Multiplicar() {
		int resultado;
		resultado = iValor1 * iValor2;
		
		System.out.println("El resultado de la Multiplicación es: " + resultado);
	}
	
	public void Division() {
		int resultado;
		resultado = iValor1 / iValor2;
		
		System.out.println("El resultado de la División es: " + resultado);
	}

	public static void main(String[] args) {
		Operacion op = new Operacion();
		
		op.Suma();
		op.Resta();
		op.Multiplicar();
		op.Division();
	}

}
