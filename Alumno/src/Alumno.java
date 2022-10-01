import java.util.Scanner;

public class Alumno {
	private Scanner sScanner;
	private String sNombre;
	private int iEdad;

	public Alumno() {
		sScanner = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		sNombre = sScanner.next();
		
		System.out.print("Ingrese edad: ");
		iEdad = sScanner.nextInt();
	}
	
	public void Imprimir() {
		System.out.println("Nombre del alumno: " + sNombre);
		System.out.println("Edad del alumno: " + iEdad);
	}
	
	public void EsMayorDeEdad() {
		if (iEdad >= 18) {
			System.out.println("El alumno " + sNombre + " es mayor de edad.");
		}
		else {
			System.out.println("El alumno " + sNombre + " no es mayor de edad.");
		}
	}

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno();
		alumno1.Imprimir();
		alumno1.EsMayorDeEdad();
	}
}
