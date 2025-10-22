import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Esto permite poner @Depends encima de métodos
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Depends {
    String[] value(); // Lista de campos dependientes
}