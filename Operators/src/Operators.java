import java.util.Scanner;

public class Operators {
	private Scanner scanner;
	private int[] salary;
	
	public Operators() {
		scanner = new Scanner(System.in);
		salary = new int[5];
		for (int i = 0; i < 5; i++)
		{
			System.out.print("Ingrese el sueldo del operario: ");
			salary[i] = scanner.nextInt();
		}
	}
	
	public void showData() {
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Sueldo: " + salary[i]);
		}
	}

	public static void main(String[] args) {
		Operators o = new Operators();
		o.showData();
	}

}
