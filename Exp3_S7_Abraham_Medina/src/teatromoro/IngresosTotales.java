package teatromoro;

public class IngresosTotales {

	public static void ingresosTotales() {
		int sumaCostoBase = 0;
		int sumaTotales = 0;
		int contarVip = 0;
		int contarPlatea = 0;
		int contarBalcon = 0;

		for (int i = 0; i < RegistroEntradas.getEntradas().size(); i++) {
			Entradas entrada = RegistroEntradas.getEntradas().get(i);
			sumaCostoBase += entrada.getCostoBaseEntrada();
			sumaTotales += entrada.getCostoTotal();

			String ubicacion = entrada.getUbicacion();
			if (ubicacion.contains("VIP")) {
				contarVip++;
			} else if (ubicacion.contains("PLATEA")) {
				contarPlatea++;
			} else if (ubicacion.contains("BALCÓN")) {
				contarBalcon++;
			}
		}

		Decorativo.separadorLinea();
		Mensajes.imprimirCentrado("****** INGRESOS TOTALES ******", ColorTexto.NEGRO_CYAN);
		System.out.println();
		if (contarVip >= 1) {
			ColorTexto.colorTexto("Ventas ubicación VIP   : " + contarVip + "\n", ColorTexto.CYAN);
			ColorTexto.colorTexto("Valor unitario VIP     : $" + Main.PRECIO_VIP + "\n", ColorTexto.VERDE);
			ColorTexto.colorTexto("Costo total base VIP   : $" + (contarVip * Main.PRECIO_VIP) + "\n",
					ColorTexto.AMARILLO);
			Decorativo.separadorSegmentado();
		}
		if (contarPlatea >= 1) {
			ColorTexto.colorTexto("Ventas ubicación Platea: " + contarPlatea + "\n", ColorTexto.CYAN);
			ColorTexto.colorTexto("Valor unitario Platea  : $" + Main.PRECIO_PLATEA + "\n", ColorTexto.VERDE);
			ColorTexto.colorTexto("Costo total base Platea: $" + (contarPlatea * Main.PRECIO_PLATEA) + "\n",
					ColorTexto.AMARILLO);
			Decorativo.separadorSegmentado();
		}
		if (contarBalcon >= 1) {
			ColorTexto.colorTexto("Ventas ubicación Balcón: " + contarBalcon + "\n", ColorTexto.CYAN);
			ColorTexto.colorTexto("Valor unitario Balcón  : $" + Main.PRECIO_BALCON + "\n", ColorTexto.VERDE);
			ColorTexto.colorTexto("Costo total base Balcón: $" + (contarBalcon * Main.PRECIO_BALCON) + "\n",
					ColorTexto.AMARILLO);
			Decorativo.separadorSegmentado();
		}
		ColorTexto.colorTexto("\nVentas totales         : " + RegistroEntradas.entradasVendidas + "\n",
				ColorTexto.CYAN);
		ColorTexto.colorTexto("Costo total base       : $" + sumaCostoBase + "\n", ColorTexto.AMARILLO);
		ColorTexto.colorTexto("Total descuentos       : $" + (sumaCostoBase - sumaTotales) + "\n", ColorTexto.VERDE);
		Decorativo.separadorSegmentado();
		ColorTexto.colorTexto("Ingresos totales       : $" + sumaTotales + "\n", ColorTexto.VERDE_NEGRO);
		Decorativo.separadorSegmentado();

		ColorTexto.colorTexto("\n\nPresione Enter para continuar...", ColorTexto.AMARILLO);
		EntradaUsuario.getScanner().nextLine();
		EntradaUsuario.getScanner().nextLine();
	}

}