package n1exercici2;

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
		return getPreuHora() * nombreHores + tarifaPlanaInternet;

	}

	/**
	 *   test message ....
	 * 
	 * @deprecated metode no compatible o ....
	 */

	@Deprecated
	public void oldCalculoSouOnline() {
		System.out.println("Calculo Sou Online otra forma no usada para calcular Sou 2023...");
	}

}
