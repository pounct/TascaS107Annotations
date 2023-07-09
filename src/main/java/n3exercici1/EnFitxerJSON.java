package n3exercici1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnFitxerJSON {
	
	String directori() default ".\\src\\main\\java\\n2exercici1\\treballador.json";



}
