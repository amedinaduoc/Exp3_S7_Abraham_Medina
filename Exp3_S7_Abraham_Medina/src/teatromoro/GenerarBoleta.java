package teatromoro;

public class GenerarBoleta {

	public static void mostrarBoleta(Entradas entrada) {
		if (entrada == null)
			return;

		Decorativo.separadorLinea();
		System.out.println("\n");
		Decorativo.separadorSegmentadoCentro();
		Mensajes.imprimirCentrado(Main.NOMBRE_TEATRO, ColorTexto.VERDE_NEGRO);
		Decorativo.separadorSegmentadoCentro();

		ColorTexto.colorTexto(entrada.toString() + "\n", ColorTexto.VERDE);

		Decorativo.separadorSegmentadoCentro();
		Mensajes.imprimirCentrado("GRACIAS POR SU VISITA AL " + Main.NOMBRE_TEATRO, ColorTexto.VERDE_NEGRO);
		Decorativo.separadorSegmentadoCentro();

		ColorTexto.seleccion("\n\nPresione Enter para continuar...");
		EntradaUsuario.getScanner().nextLine();
		EntradaUsuario.getScanner().nextLine();
	}
}