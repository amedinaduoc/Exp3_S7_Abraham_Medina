package teatromoro;

import java.util.ArrayList;
import java.util.List;

public class RegistroEntradas {

	private static List<Entradas> listaEntradas = new ArrayList<>();
	static int entradasVendidas = 0;

	public static Entradas guardarEntrada(String ubicacionSeleccionada, int precioSeleccionado,
			String compradorSeleccionado, double descuentoSeleccionado) {
		entradasVendidas++;
		int totalEntrada = (int) (precioSeleccionado - (precioSeleccionado * descuentoSeleccionado));
		String descuentoTexto = (int) (descuentoSeleccionado * 100) + "%";

		Entradas nuevaEntrada = new Entradas(entradasVendidas, ubicacionSeleccionada, precioSeleccionado,
				compradorSeleccionado, descuentoTexto, totalEntrada);
		listaEntradas.add(nuevaEntrada);
		return nuevaEntrada;
	}

	public static List<Entradas> getEntradas() {
		return new ArrayList<>(listaEntradas);
	}
}