import java.util.Scanner;

public class Triangle {
	private Scanner scanner;
	private int side1, side2, side3;
	
	public void initProgram() {
		scanner = new Scanner(System.in);
		System.out.print("Medida lado 1: ");
		side1 = scanner.nextInt();
		System.out.print("Medida lado 2: ");
		side2 = scanner.nextInt();
		System.out.print("Medida lado 3: ");
		side3 = scanner.nextInt();
	}
	
	public void isEquilateral() {
		if ( (side1 == side2) && (side3 == side3))
			System.out.println("El triangulo es equilatero");
		else
			System.out.println("No es un triangulo equilatero");
	}
	
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.initProgram();
		t.isEquilateral();
	}

}
