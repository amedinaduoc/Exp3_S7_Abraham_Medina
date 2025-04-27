package teatromoro;

public class ResumenDeVentas {

	public static void resumen() {

		Decorativo.separadorLinea();
		Mensajes.imprimirCentrado("****** RESUMEN DE VENTAS ******", ColorTexto.NEGRO_CYAN);
		System.out.println();
		for (Entradas todasLasCompras : RegistroEntradas.getEntradas()) {
			ColorTexto.colorTexto(todasLasCompras + "\n", ColorTexto.VERDE);
			Decorativo.separadorSegmentado();
		}
		ColorTexto.colorTexto("\n\nPresione Enter para continuar...", ColorTexto.AMARILLO);
		EntradaUsuario.getScanner().nextLine();
		EntradaUsuario.getScanner().nextLine();
	}
}