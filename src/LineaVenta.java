public class LineaVenta extends BaseModel {
    int precio;
    int cantidad;
    String producto;
    int precioTotal;
    public LineaVenta(int precio, int cantidad, String producto) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.producto = producto;
        computePrecioFinal();
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        //deberia de usar el PreUpdate o PrePersist/PostPersist
    }

    @Depends({"precio","cantidad"})
    public void computePrecioFinal(){
        this.precioTotal = (precio * cantidad);
        System.out.println("Recalculado");
    }
}
