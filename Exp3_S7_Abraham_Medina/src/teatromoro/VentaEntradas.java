package teatromoro;

//import java.util.InputMismatchException;

public class VentaEntradas {

	public static void ubicacion() {
		int ubicacion = 0;
		String ubicacionSeleccionada = "";
		int precioSeleccionado = 0;

		do {
			Decorativo.separadorLinea();
			Mensajes.imprimirCentrado("****** SELECCIONAR UBICACIÓN ******", ColorTexto.NEGRO_CYAN);
			ColorTexto.colorTexto("\n"
					+ "1 . VIP   : $" + Main.PRECIO_VIP + "\n"
					+ "2 . PLATEA: $" + Main.PRECIO_PLATEA + "\n"
					+ "3 . BALCÓN: $" + Main.PRECIO_BALCON + "\n", ColorTexto.RESET_COLOR);
			ColorTexto.colorTexto("\nIngrese el número de la ubicación deseada: ", ColorTexto.AMARILLO);

			ubicacion = EntradaUsuario.leerValidarEntero();

			switch (ubicacion) {
				case 1 -> {
					ubicacionSeleccionada = "VIP";
					precioSeleccionado = Main.PRECIO_VIP;
				}
				case 2 -> {
					ubicacionSeleccionada = "PLATEA";
					precioSeleccionado = Main.PRECIO_PLATEA;
				}
				case 3 -> {
					ubicacionSeleccionada = "BALCÓN";
					precioSeleccionado = Main.PRECIO_BALCON;
				}
				default -> {
					System.out.println();
					Mensajes.imprimirCentrado("La opción ingresada no es válida!", ColorTexto.ROJO_NEGRO);
					ubicacion = 0;
				}
			}
		} while (ubicacion == 0);

		comprador(ubicacionSeleccionada, precioSeleccionado);
	}

	public static void comprador(String ubicacionSeleccionada, int precioSeleccionado) {
		String compradorSeleccionado = "";
		double descuentoSeleccionado = 0;
		int comprador = 0;

		do {
			Decorativo.separadorLinea();
			Mensajes.imprimirCentrado("****** SELECCIONAR COMPRADOR ******", ColorTexto.NEGRO_CYAN);
			ColorTexto.colorTexto("\n"
					+ "1 . ESTUDIANTE  : " + (int) (Main.DESCUENTO_ESTUDIANTE * 100) + "% dcto.\n"
					+ "2 . TERCERA EDAD: " + (int) (Main.DESCUENTO_TERCERAEDAD * 100) + "% dcto.\n",
					ColorTexto.RESET_COLOR);
			ColorTexto.colorTexto("\nIngrese el número del tipo de comprador: ", ColorTexto.AMARILLO);

			comprador = EntradaUsuario.leerValidarEntero();

			switch (comprador) {
				case 1 -> {
					compradorSeleccionado = "ESTUDIANTE";
					descuentoSeleccionado = Main.DESCUENTO_ESTUDIANTE;
				}
				case 2 -> {
					compradorSeleccionado = "TERCERA EDAD";
					descuentoSeleccionado = Main.DESCUENTO_TERCERAEDAD;
				}
				default -> {
					System.out.println();
					Mensajes.imprimirCentrado("La opción ingresada no es válida!", ColorTexto.ROJO_NEGRO);
					comprador = 0;
				}
			}
		} while (comprador == 0);

		Entradas entrada = RegistroEntradas.guardarEntrada(ubicacionSeleccionada, precioSeleccionado, compradorSeleccionado, descuentoSeleccionado);
		GenerarBoleta.mostrarBoleta(entrada);
	}

//	private static int leerValidarEntero() {
//		int numero;
//		try {
//			numero = EntradaUsuario.getScanner().nextInt();
//			EntradaUsuario.getScanner().nextLine();
//		} catch (InputMismatchException e) {
//			EntradaUsuario.getScanner().nextLine();
//			numero = 0;
//		}
//		return numero;
//	}
}
