package teatromoro;

//import java.util.InputMismatchException;

public class MenuPrincipal {

	public static void mostrarMenu() {
		int opcionMenu = 0;
		do {
			Decorativo.separadorLinea();
			Mensajes.imprimirCentrado("****** MENÚ PRINCIPAL ******", ColorTexto.NEGRO_CYAN);
			ColorTexto.colorTexto(
					"\n1 . Venta de entradas\n" + "2 . Resumen de ventas\n" + "3 . Ingresos totales\n" + "9 . Salir\n",
					ColorTexto.RESET_COLOR);
			ColorTexto.seleccion("\nIngrese el número de la opción deseada: ");
			
			
			opcionMenu = EntradaUsuario.leerValidarEntero();
//			try {
//				opcionMenu = EntradaUsuario.getScanner().nextInt();
//				EntradaUsuario.getScanner().nextLine();
//			} catch (InputMismatchException e) {
//				EntradaUsuario.getScanner().nextLine();
//				opcionMenu = 0;
//			}
			
			switch (opcionMenu) {
			case 1:
				VentaEntradas.ubicacion();
				break;
			case 2:
				if (hayVentasRegistradas()) {
					ResumenDeVentas.resumen();
				}
				break;
			case 3:
				if (hayVentasRegistradas()) {
					IngresosTotales.ingresosTotales();
				}
				break;
			case 9:
				Mensajes.mensajeFinal();
				break;
			default:
				Decorativo.separadorSegmentadoCyan();
				System.out.println("\n\n\n");
				Mensajes.imprimirCentrado("La opción ingresada no es válida!", ColorTexto.ROJO_NEGRO);
			}
		} while (opcionMenu != 9);
	}

	private static boolean hayVentasRegistradas() {
		if (RegistroEntradas.entradasVendidas < 1) {
			Decorativo.separadorSegmentadoCyan();
			System.out.println("\n\n\n");
			Mensajes.imprimirCentrado("No hay ventas registradas!", ColorTexto.ROJO_NEGRO);
			return false;
		}
		return true;
	}
}