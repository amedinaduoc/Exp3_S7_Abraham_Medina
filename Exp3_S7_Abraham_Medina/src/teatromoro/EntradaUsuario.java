package teatromoro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaUsuario {
	private static final Scanner scanner = new Scanner(System.in);

	public static Scanner getScanner() {
		return scanner;
	}

	static int leerValidarEntero() {
		int numero;
		try {
			numero = EntradaUsuario.getScanner().nextInt();
			EntradaUsuario.getScanner().nextLine();
		} catch (InputMismatchException e) {
			EntradaUsuario.getScanner().nextLine();
			numero = 0;
		}
		return numero;
	}
}