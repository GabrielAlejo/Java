
public class DadosGame {
	private Dado dado1, dado2, dado3;

	public DadosGame() {
		dado1 = new Dado();
		dado2 = new Dado();
		dado3 = new Dado();
	}
	
	public void play() {
		dado1.tirar();
		dado1.imprimir();
		dado2.tirar();
		dado2.imprimir();
		dado3.tirar();
		dado3.imprimir();
	}
	
	public void check() {
		if (dado1.retornarValor() == dado2.retornarValor() && dado1.retornarValor() == dado3.retornarValor())
			System.out.println("Ganó!");
		else
			System.out.println("Perdió! :(");
	}
	
	public static void main(String[] args) {
		DadosGame dg = new DadosGame();
		dg.play();
		dg.check();
	}

}
