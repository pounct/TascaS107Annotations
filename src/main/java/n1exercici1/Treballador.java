package n1exercici1;

public class Treballador {

	private String nom;
	private String cognom;
	private double preuHhora;
	
	

	public Treballador() {

	}

	public Treballador(String nom, String cognom, double preuHhora) {

		this.nom = nom;
		this.cognom = cognom;
		this.preuHhora = preuHhora;
	}
	
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public double getPreuHhora() {
		return preuHhora;
	}

	public void setPreuHhora(double preuHhora) {
		this.preuHhora = preuHhora;
	}
	
	

	public double calcularSou(int nombreHores) {
		return preuHhora * nombreHores;

	}

}
