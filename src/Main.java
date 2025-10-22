import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LineaVenta ln = new LineaVenta(10,3,"Cebolla");
        LineaVenta ln2 = new LineaVenta(20,2,"Patata");
        LineaVenta ln3 = new LineaVenta(6,4,"Huevos");

        ln.setPrecio(11); // res 33
        System.out.println("💰 Precio final recalculado Cebolla: " + ln.precioTotal);

        ln2.cantidad=5; // res 100

        System.out.println("💰 Precio final recalculado Patata: " + ln2.precioTotal);

        ln3.producto=" cambiar nombre";

        System.out.println("💰 Precio final recalculado nombre cambiado: " + ln3.precioTotal);

    }
}

