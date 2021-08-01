
public class Bank {
	private Client client1, client2, client3;

	public Bank() {
		client1 = new Client("Juan");
		client2 = new Client("Ana");
		client3 = new Client("Pedro");
	}
	
	public void operar() {
		client1.deposit(100);
		client2.deposit(150);
		client3.deposit(200);
		client3.extraer(150);
	}
	
	public void depositosTotales() {
		int t = client1.returnMonto() + client2.returnMonto() + client3.returnMonto();
		System.out.println("El total de dinero en el banco es: " + t);
		
		client1.imprimir();
		client2.imprimir();
		client3.imprimir();
	}
	
	public static void main(String[] arg) {
		Bank b = new Bank();
		b.operar();
		b.depositosTotales();
	}
}
