package teatromoro;

import java.util.InputMismatchException;

public class ComprarEntradas {

	public static void ubicacion() {
//		int ubicacion = 0;
		String ubicacionSeleccionada = "";
		int precioSeleccionado = 0;

		Decorativo.separadorLinea();
		Mensajes.imprimirCentrado("****** SELECCIONAR UBICACIÓN ******", ColorTexto.NEGRO_CYAN);
		ColorTexto.colorTexto("\n1 . VIP   : $" + Main.PRECIO_VIP + "\n" + "2 . PLATEA: $" + Main.PRECIO_PLATEA + "\n"
				+ "3 . BALCÓN: $" + Main.PRECIO_BALCON + "\n", ColorTexto.RESET_COLOR);
		int ubicacion = solicitarOpcion("\nIngrese el número de la ubicación deseada: ", 1, 3);

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
		}
		comprador(ubicacionSeleccionada, precioSeleccionado);
	}

	public static void comprador(String ubicacionSeleccionada, int precioSeleccionado) {
		String compradorSeleccionado = "";
		double descuentoSeleccionado = 0;

		Decorativo.separadorLinea();
		Mensajes.imprimirCentrado("****** SELECCIONAR COMPRADOR ******", ColorTexto.NEGRO_CYAN);
		ColorTexto.colorTexto(
				"" + "\n1 . ESTUDIANTE  : " + (int) (Main.DESCUENTO_ESTUDIANTE * 100) + "% dcto.\n"
						+ "2 . TERCERA EDAD: " + (int) (Main.DESCUENTO_TERCERAEDAD * 100) + "% dcto.\n",
				ColorTexto.RESET_COLOR);
		int comprador = solicitarOpcion("\nIngrese el número de la opción deseada: ", 1, 2);
		switch (comprador) {
		case 1 -> {
			compradorSeleccionado = "ESTUDIANTE";
			descuentoSeleccionado = Main.DESCUENTO_ESTUDIANTE;
		}
		case 2 -> {
			compradorSeleccionado = "TERCERA EDAD";
			descuentoSeleccionado = Main.DESCUENTO_TERCERAEDAD;
		}
		}

		Entradas entrada = RegistroEntradas.guardarEntrada(ubicacionSeleccionada, precioSeleccionado, compradorSeleccionado, descuentoSeleccionado);
		GenerarBoleta.mostrarBoleta(entrada);
	}

	public static int solicitarOpcion(String mensaje, int min, int max) {
		int opcion = 0;
		do {
			ColorTexto.seleccion(mensaje);
			try {
				opcion = EntradaUsuario.getScanner().nextInt();
			} catch (InputMismatchException e) {
				EntradaUsuario.getScanner().nextLine();
				opcion = 0;
			}
			if (opcion < min || opcion > max) {
				Mensajes.imprimirCentrado("La opción ingresada no es válida!", ColorTexto.ROJO_NEGRO);
				opcion = 0;
			}
		} while (opcion == 0);
		return opcion;
	}
}