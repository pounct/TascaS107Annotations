package n3exercici1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Serializable;
import com.google.gson.Gson;

public class Treballador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

	@Override
	public String toString() {
		return "Treballador " + nom + "  " + cognom + ", preu/hora=" + preuHhora + "]";
	}

	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);

	}
	
	// @EnFitxerJSON FOR DEFAULT DIRECTORI
	
	@EnFitxerJSON(directori = ".\\treballador.json")
	public void toPathFile(String destination) {
		System.out.println("toPathFile....");
		try {

			BufferedWriter fitxer = new BufferedWriter(new FileWriter(destination));

			fitxer.write(this.toJson());
			System.out.println("toPathFile....writed");

			fitxer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
