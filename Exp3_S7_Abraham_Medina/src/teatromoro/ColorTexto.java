package teatromoro;

public final class ColorTexto {

	static final String ROJO_NEGRO = "\u001B[31m\u001B[40m\u001B[1m";
	static final String NEGRO_CYAN = "\u001B[30m\u001B[46m\u001B[1m";
	static final String VERDE_NEGRO = "\u001B[32m\u001B[40m\u001B[1m";
	static final String CYAN_NEGRO = "\u001B[36m\u001B[40m\u001B[1m";
	static final String CYAN = "\u001B[36m";
	static final String VERDE = "\u001B[32m";
	static final String AMARILLO = "\u001B[33m";
	static final String RESET_COLOR = "\u001B[0m";

	private ColorTexto() {
	}

	static void colorTexto(String mensaje, String color) {
		System.out.print(color + mensaje + RESET_COLOR);
	}

	static void error(String mensaje) {
		colorTexto(mensaje, ROJO_NEGRO);
	}

	static void seleccion(String mensaje) {
		colorTexto(mensaje, AMARILLO);
	}
}