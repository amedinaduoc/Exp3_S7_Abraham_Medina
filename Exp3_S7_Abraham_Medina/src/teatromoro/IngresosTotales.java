package teatromoro;

public class IngresosTotales {

	public static void ingresosTotales() {
		int sumaCostoBase = 0;
		int sumaTotales = 0;
		int contarVip = 0;
		int contarPlatea = 0;
		int contarBalcon = 0;
		
		for (Entradas entrada : RegistroEntradas.getEntradas()) {
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
		
        imprimirDetalleUbicacion("VIP   ", contarVip, Main.PRECIO_VIP);
        imprimirDetalleUbicacion("PLATEA", contarPlatea, Main.PRECIO_PLATEA);
        imprimirDetalleUbicacion("BALCÓN", contarBalcon, Main.PRECIO_BALCON);
		
		System.out.println();
		Decorativo.separadorSegmentadoCyanNegro();
		ColorTexto.colorTexto("Ventas totales         : " + RegistroEntradas.entradasVendidas + "\n",	ColorTexto.CYAN);
		ColorTexto.colorTexto("Costo total base       : $" + sumaCostoBase + "\n", ColorTexto.AMARILLO);
		ColorTexto.colorTexto("Total descuentos       : $" + (sumaCostoBase - sumaTotales) + "\n", ColorTexto.VERDE);
		Decorativo.separadorSegmentadoCyanNegro();
		ColorTexto.colorTexto("Ingresos totales       : $" + sumaTotales + "\n", ColorTexto.VERDE_NEGRO);
		Decorativo.separadorSegmentadoCyanNegro();

		ColorTexto.colorTexto("\n\nPresione Enter para continuar...", ColorTexto.AMARILLO);
		EntradaUsuario.getScanner().nextLine();
	}
	
	private static void imprimirDetalleUbicacion(String ubicacion, int cantidad, int precio) {
        if (cantidad > 0) {
            ColorTexto.colorTexto("Ventas ubicación " + ubicacion + ": " + cantidad + "\n", ColorTexto.CYAN);
            ColorTexto.colorTexto("Valor unitario " + ubicacion + "  : $" + precio + "\n", ColorTexto.VERDE);
            ColorTexto.colorTexto("Costo total base " + ubicacion + ": $" + (cantidad * precio) + "\n", ColorTexto.AMARILLO);
            Decorativo.separadorSegmentadoCyan();
        }
    }
}