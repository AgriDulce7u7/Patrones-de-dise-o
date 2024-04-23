package co.edu.uniquindio.patronesdiseno.patronesdisenofx.Visitor;

public class ProductoTecnologico implements Producto {
    private double precio;

    public ProductoTecnologico(double precio) {
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public double aceptar(VisitorImpuesto visitor) {
        return visitor.visitarProductoTecnologico(this);
    }
}
