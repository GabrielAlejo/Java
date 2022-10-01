import java.util.Scanner;

public class Operario {
	private Scanner sScanner;
	private int[] sueldos;

	public Operario() {
		sScanner = new Scanner(System.in);
		sueldos = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("Ingrese valor del sueldo: ");
			sueldos[i] = sScanner.nextInt();
		}
	}

	public void Imprimir() {
		for (int i = 0; i < 5; i++) {
			System.out.println(sueldos[i]);
		}
	}

	public static void main(String[] args) {
		Operario op = new Operario();
		op.Imprimir();
	}

}
