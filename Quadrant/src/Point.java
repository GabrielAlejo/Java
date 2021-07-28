import java.util.Scanner;

public class Point {
	private Scanner scanner;
	public int x, y;
	
	public void initProgram() {
		scanner = new Scanner(System.in);
		System.out.print("Ingrese coordenada x: ");
		x = scanner.nextInt();
		System.out.print("Ingrese coordenada y: ");
		y = scanner.nextInt();
	}
	
	public void Quadrant() {
		if ( (x > 0) && (y > 0) )
			System.out.println("El punto se encuentra en el primer cuadrante");
		else if ( (x < 0) && (y > 0) )
			System.out.println("El punto se encuentra en el segundo cuadrante");
		else if ( (x < 0) && (y < 0) )
			System.out.println("El punto se encuentra en el tercer cuadrante");
		else if ( (x > 0) && (y < 0) )
			System.out.println("El punto se encuentra en el cuarto cuadrante");
		else
			System.out.println("El punnto no se encuentra en ningún cuadrante");
	}

	public static void main(String[] args) {
		Point p = new Point();
		p.initProgram();
		p.Quadrant();
	}

}
