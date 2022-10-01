import java.util.Scanner;

public class Cuadrado {
	private Scanner sScanner;
	int iLado;

	public void Inicializar() {
		sScanner = new Scanner(System.in);
		System.out.print("Ingrese valor del lado: ");
		iLado = sScanner.nextInt();
	}

	public void ImprimirPerimetro() {
		int perimetro;
		perimetro = iLado * 4;

		System.out.println("El perimetro es: " + perimetro);
	}

	public void ImprimirSuperficie() {
		int superficie;
		superficie = iLado * iLado;

		System.out.println("La superficie es: " + superficie);
	}

	public static void main(String[] args) {
		Cuadrado cuadrado1;
		cuadrado1 = new Cuadrado();
		cuadrado1.Inicializar();
		cuadrado1.ImprimirPerimetro();
		cuadrado1.ImprimirSuperficie();
	}

}
