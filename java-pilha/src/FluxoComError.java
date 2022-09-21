
public class FluxoComError {

	public static void main(String[] args) {

		System.out.println("Inicio do main");
		try {
			metodo1();

		} catch (NullPointerException | ArithmeticException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {

		System.out.println("Inicio do metodo1");
		metodo2();

		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
	System.out.println("Chamando Método 2");
	metodo2();
	System.out.println("Fim do Método 2");
	
	}
}