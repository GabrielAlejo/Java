import java.util.Scanner;

public class Empleado {
	private Scanner sScanner;
	private String sNombre;
	private int iSueldo;
	
	public Empleado() {
		sScanner = new Scanner(System.in);
		
		System.out.print("Ingrese nombre del empleado: ");
		sNombre = sScanner.next();
		
		System.out.print("Ingrese sueldo del empleado " + sNombre + ": " );
		iSueldo = sScanner.nextInt();
	}
	
	public void PagarImpuestos() {
		if (iSueldo >= 3000) {
			System.out.print("El empleado " + sNombre + " debe pagar impuestos, ya que su sueldo es mayor a 3000 (" + iSueldo + ").");
		}
		else {
			System.out.print("El empleado " + sNombre + " no debe pagar impuestos, ya que su sueldo es " + iSueldo + ".");
		}
	}

	public static void main(String[] args) {
		Empleado e = new Empleado();
		e.PagarImpuestos();
	}

}
