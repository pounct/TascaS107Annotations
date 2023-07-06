package n2exercici1;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class N2Exercici1 {

	public static void escriureFitxer(String resultado, String destination) {

		// Treballador treballador = new Treballador("nomt", "cognomt", 20);

		// String resultado = treballador.toJson();

		try {

			BufferedWriter fitxer = new BufferedWriter(new FileWriter(destination));

			fitxer.write(resultado);
			fitxer.newLine();

			fitxer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		String jsonTreballador = new Treballador("nomt", "cognomt", 20).toJson();
		
		String destination = ".\\src\\main\\java\\n2exercici1\\treballador.json";
		escriureFitxer(jsonTreballador, destination);

	}

}
