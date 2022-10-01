import java.util.Scanner;

public class Persona {
	private Scanner sScanner;
	private String sNombre;
	private int iEdad;
	
	public void Inicializar() {
		sScanner = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		sNombre = sScanner.next();
		
		System.out.print("Ingrese edad: ");
		iEdad = sScanner.nextInt();
	}
	
	public void Imprimir() {
		System.out.println("Nombre: " + sNombre);
		System.out.println("Edad: " + iEdad);
	}
	
	public void EsMayorEdad() {
		if (iEdad >= 18) {
			System.out.println(sNombre + " es mayor de edad");
		}
		else { 
			System.out.println(sNombre + " no es mayor de edad");
		}
	}
	
	public static void main (String[] ars ) {
		Persona persona1;
		persona1 = new Persona();
		persona1.Inicializar();
		persona1.Imprimir();
		persona1.EsMayorEdad();
	}
}
