
public class Client {
	private String name;
	private int monto;
	
	public Client(String sName) {
		name = sName;
		monto = 0;
	}
	
	public void deposit(int m) {
		monto += m;
	}
	
	public void extraer(int m) {
		monto -= m;
	}
	
	public int returnMonto() {
		return monto;
	}
	
	public void imprimir() {
		System.out.println(name + " tiene depositado la suma de " + monto);
	}
}
