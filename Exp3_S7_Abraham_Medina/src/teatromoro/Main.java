package teatromoro;

public class Main {
	static final String NOMBRE_TEATRO = "TEATRO MORO";
	static final int CAPACIDAD_SALA = 60;
	static final int PRECIO_VIP = 14000;
	static final int PRECIO_PLATEA = 10000;
	static final int PRECIO_BALCON = 7000;
	static final double DESCUENTO_ESTUDIANTE = 0.10;
	static final double DESCUENTO_TERCERAEDAD = 0.15;
	static Long numeroBoleta;

	public static void main(String[] args) {
		Mensajes.mensajeInicial();
		MenuPrincipal.mostrarMenu();
	}
}