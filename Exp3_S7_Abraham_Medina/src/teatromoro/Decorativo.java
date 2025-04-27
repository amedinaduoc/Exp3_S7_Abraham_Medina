package teatromoro;

public class Decorativo {
	public static final int ANCHO_CONSOLA = 24;

	public static void separadorLinea() {
		System.out.println("\n\n");
		ColorTexto.colorTexto("_".repeat(ANCHO_CONSOLA * 2) + "\n", ColorTexto.AMARILLO);
		ColorTexto.colorTexto("-".repeat(ANCHO_CONSOLA) + "\n", ColorTexto.AMARILLO);
	}

	public static void separadorSegmentado() {
		ColorTexto.colorTexto("-".repeat(ANCHO_CONSOLA + 7) + "\n", ColorTexto.CYAN);
	}

	public static void separadorSegmentadoCentro() {
		ColorTexto.colorTexto("-".repeat(ANCHO_CONSOLA * 2) + "\n", ColorTexto.CYAN);
	}
}