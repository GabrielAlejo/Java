import java.util.Scanner;

public class Triangulo {
	private Scanner sScanner;
	private int iLado1, iLado2, iLado3;

	public void Inicializar() {
		sScanner = new Scanner(System.in);
		
		System.out.print("Medida lado 1: ");
		iLado1 = sScanner.nextInt();
		
		System.out.print("Medida lado 2: ");
		iLado2 = sScanner.nextInt();
		
		System.out.print("Medida lado 3: ");
		iLado3 = sScanner.nextInt();
	}
	
	public void LadoMayor() {
		System.out.println("Lado mayor: ");
		
		if (iLado1 > iLado2 && iLado1 > iLado3) {
			System.out.println(iLado1);
		}
		else {
			if (iLado2 > iLado3) {
				System.out.println(iLado2);
			} 
			else { 
				System.out.println(iLado3);
			}
		}
	}
	
	public void EsEquilatero() {
		if (iLado1 == iLado2 && iLado1 == iLado3) {
			System.out.println("Es un triangulo equilatero");
		}
		else {
			System.out.println("No es un triangulo equilatero");
		}
	}

	public static void main(String[] args) {
		Triangulo t = new Triangulo();
		t.Inicializar();
		t.LadoMayor();
		t.EsEquilatero();

	}

}
