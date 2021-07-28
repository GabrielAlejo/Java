import java.util.Scanner;

public class Square {
	private Scanner scanner;
	int side;

	public void initProgram() {
		scanner = new Scanner(System.in);
		System.out.print("Ingrese el valor del lado: ");
		side = scanner.nextInt();
	}
	
	public void showPerimeter() {
		int perimeter = side * 4;
		System.out.println("El perimetro del cuadrado es: " + perimeter);
	}
	
	public void showSurface() {
		int surface = side * side;
		System.out.println("La superficie del cuadrado es: " + surface);
	}
	
	public static void main(String[] args) {
		Square s = new Square();
		s.initProgram();
		s.showPerimeter();
		s.showSurface();
	}

}
