package n1exercici1;

public class TreballadorOnline extends Treballador {

	private final double tarifaPlanaInternet;

	public TreballadorOnline(double tarifaPlanaInternet) {
		this.tarifaPlanaInternet = tarifaPlanaInternet;
	}

	public TreballadorOnline(String nom, String cognom, double preuHhora, double tarifaPlanaInternet) {

		super(nom, cognom, preuHhora);
		this.tarifaPlanaInternet = tarifaPlanaInternet;
	}

	@Override
	public double calcularSou(int nombreHores) {
		return getPreuHhora() * nombreHores + tarifaPlanaInternet;

	}

}
