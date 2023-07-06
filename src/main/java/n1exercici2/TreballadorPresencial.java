package n1exercici2;

public class TreballadorPresencial extends Treballador {

	static double benzina;

	public TreballadorPresencial() {
	}

	public TreballadorPresencial(String nom, String cognom, double preuHhora) {
		super(nom, cognom, preuHhora);
	}

	@Override
	public double calcularSou(int nombreHores) {
		return getPreuHora() * nombreHores + benzina;

	}
	
	/**
	 *   test message ....
	 * 
	 * @deprecated metode no compatible o ....
	 */

	@Deprecated
	public void oldCalculoSouPresencial() {
		System.out.println("Calculo Sou Presencial otra forma no usada para calcular Sou 2023...");
	}

}
