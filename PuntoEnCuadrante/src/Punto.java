import java.util.Scanner;

public class Punto {
	private Scanner sScanner;
	private int x, y;
	
	public void Inicializar() {
		sScanner = new Scanner(System.in);
		
		System.out.print("Ingrese coordenada x: ");
		x = sScanner.nextInt();
		
		System.out.print("Ingrese coordenada y: ");
		y = sScanner.nextInt();
	}
	
	public void ImprimirCuadrante() {
		if (x > 0 && y > 0) {
			System.out.println("Se encuentra en el primer cuadrante.");
		}
		else {
			if (x < 0 && y > 0) {
				System.out.println("Se encuentra en el segundo cuadrante.");
			}
			else { 
				if (x < 0 && y < 0) {
					System.out.println("Se encuentra en el tercer cuadrante");
				}
				else {
					if (x > 0 && y < 0) {
						System.out.println("Se encuentra en el cuarto cuadrante");
					}
					else {
						System.out.println("El punto no está en un cuadrante");
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Punto punto1;
		punto1 = new Punto();
		punto1.Inicializar();
		punto1.ImprimirCuadrante();
	}

}
