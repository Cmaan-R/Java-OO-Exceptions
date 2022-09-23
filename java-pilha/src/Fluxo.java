
public class Fluxo {

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

		System.out.println("Inicio do metodo2");
		throw new MinhaExcecao("Lançando Minha Própria Exceção Teste");

//		System.out.println("Fim do metodo2");

	}
}