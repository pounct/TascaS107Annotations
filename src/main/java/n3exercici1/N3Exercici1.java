package n3exercici1;

import java.lang.reflect.Method;

public class N3Exercici1 {

	public static void main(String[] args) {

		Treballador treballador = new Treballador("nomt", "cognomt", 20);

		Method method;
		try {
			method = treballador.getClass().getMethod("toPathFile", String.class);

			EnFitxerJSON enFitxerJSON = method.getAnnotation(EnFitxerJSON.class);

			String destination = enFitxerJSON.directori();

			treballador.toPathFile(destination);

		} catch (NoSuchMethodException | SecurityException e) {

			e.printStackTrace();
		}

	}

}
