package n2exercici1;

import java.lang.reflect.Method;

public class N2Exercici1 {

	public static void main(String[] args) {

		Treballador treballador = new Treballador("nomt", "cognomt", 20);

		Method method;
		try {
			method = treballador.getClass().getMethod("jsonToPathFile", String.class);

			EnFitxerJSON enFitxerJSON = method.getAnnotation(EnFitxerJSON.class);

			String destination = enFitxerJSON.directori();

			treballador.jsonToPathFile(destination);

		} catch (NoSuchMethodException | SecurityException e) {

			e.printStackTrace();
		}

	}

}
