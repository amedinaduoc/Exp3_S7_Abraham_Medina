package teatromoro;

public class Entradas {

	private int id;
	private String ubicacion;
	private int costoBaseEntrada;
	private String tipoEntrada;
	private String descuento;
	private int costoTotal;

	public Entradas(int id, String ubicacion, int costoBaseEntrada, String tipoEntrada, String descuento,
			int costoTotal) {
		this.id = id;
		this.ubicacion = ubicacion;
		this.costoBaseEntrada = costoBaseEntrada;
		this.tipoEntrada = tipoEntrada;
		this.descuento = descuento;
		this.costoTotal = costoTotal;
	}

	public Entradas() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCostoBaseEntrada() {
		return costoBaseEntrada;
	}

	public void setCostoBaseEntrada(int costoBaseEntrada) {
		this.costoBaseEntrada = costoBaseEntrada;
	}

	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public int getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(int costoTotal) {
		this.costoTotal = costoTotal;
	}

	@Override
	public String toString() {
					return
				    "Compra N°         : " + id
				+ "\nUbicación         : " + ubicacion
				+ "\nCosto base        : $"+ costoBaseEntrada
				+ "\nDescuento Aplicado: " + descuento
				+ "\nCosto Final       : $"+ costoTotal;
	}
}