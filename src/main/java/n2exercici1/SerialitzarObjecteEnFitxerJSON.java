package n2exercici1;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.Type)
public @interface SerialitzarObjecteEnFitxerJSON {
	
	String directori() default ".\\treballador.json"; 

}


