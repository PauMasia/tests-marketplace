
import java.lang.reflect.Method;
import java.util.Date;


public abstract class BaseModel {
    private int id;

    private String create_uid;

    private Date create_date;

    public void setCreate_uid(String create_uid) {
        this.create_uid = create_uid;
    }

    protected void triggerDependents(String fieldName) {
        // Recorre todos los métodos de la clase actual
        for (Method method : this.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(Depends.class)) {
                Depends depends = method.getAnnotation(Depends.class);
                for (String dep : depends.value()) {
                    if (dep.equals(fieldName)) {
                        try {
                            method.setAccessible(true);
                            method.invoke(this); // Ejecuta el método dependiente
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
