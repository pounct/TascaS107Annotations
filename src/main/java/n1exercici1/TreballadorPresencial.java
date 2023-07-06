package n1exercici1;

public class TreballadorPresencial extends Treballador {

	static double benzina;

	public TreballadorPresencial() {
	}

	public TreballadorPresencial(String nom, String cognom, double preuHhora) {
		super(nom, cognom, preuHhora);
	}

	@Override
	public double calcularSou(int nombreHores) {
		return getPreuHhora() * nombreHores + benzina;

	}

}
