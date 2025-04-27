package teatromoro;

public class Mensajes {

	public static void imprimirCentrado(String mensaje, String color) {

		int espacios = Decorativo.ANCHO_CONSOLA - mensaje.length() / 2;
		String textoCentrado = String.format("%" + (espacios + mensaje.length()) + "s", mensaje);
		System.out.print(color + textoCentrado + ColorTexto.RESET_COLOR);
		System.out.println(color + " ".repeat(espacios) + ColorTexto.RESET_COLOR);
	}

	public static void mensajeInicial() {
		String mensajeBienvenida = "¡¡¡ BIENVENID@S A " + Main.NOMBRE_TEATRO + " !!!";

		imprimirCentrado("-".repeat(mensajeBienvenida.length()), ColorTexto.CYAN_NEGRO);
		imprimirCentrado(mensajeBienvenida, ColorTexto.VERDE_NEGRO);
		imprimirCentrado("-".repeat(mensajeBienvenida.length()), ColorTexto.CYAN_NEGRO);
		System.out.println();

		imprimirCentrado("CAPACIDAD DE LA SALA: " + Main.CAPACIDAD_SALA, ColorTexto.NEGRO_CYAN);
		System.out.println();

		imprimirCentrado("PRECIO DE LAS ENTRADAS", ColorTexto.NEGRO_CYAN);
		imprimirCentrado("VIP   : $" + Main.PRECIO_VIP, ColorTexto.VERDE_NEGRO);
		imprimirCentrado("Platea: $" + Main.PRECIO_PLATEA, ColorTexto.VERDE_NEGRO);
		imprimirCentrado("Balcón: $" + Main.PRECIO_BALCON + " ", ColorTexto.VERDE_NEGRO);
		System.out.println();

		imprimirCentrado("PROMOCIONES ", ColorTexto.NEGRO_CYAN);
		imprimirCentrado("Estudiante  : " + (int) (Main.DESCUENTO_ESTUDIANTE * 100) + "% dcto", ColorTexto.VERDE_NEGRO);
		imprimirCentrado("Tercera Edad: " + (int) (Main.DESCUENTO_TERCERAEDAD * 100) + "% dcto",
				ColorTexto.VERDE_NEGRO);

		ColorTexto.seleccion("\n\nPresione Enter para continuar...");
		EntradaUsuario.getScanner().nextLine();
	}

	public static void mensajeFinal() {
		String mensajeDespedida = "¡¡¡ " + Main.NOMBRE_TEATRO + " AGRADECE SU VISITA !!!";
		Decorativo.separadorLinea();
		imprimirCentrado("-".repeat(mensajeDespedida.length()), ColorTexto.CYAN_NEGRO);
		imprimirCentrado(mensajeDespedida, ColorTexto.VERDE_NEGRO);
		imprimirCentrado("-".repeat(mensajeDespedida.length()), ColorTexto.CYAN_NEGRO);
	}
}
