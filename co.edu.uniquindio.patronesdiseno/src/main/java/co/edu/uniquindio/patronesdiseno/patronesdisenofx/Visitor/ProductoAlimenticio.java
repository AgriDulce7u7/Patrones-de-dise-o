package co.edu.uniquindio.patronesdiseno.patronesdisenofx.Visitor;

public class ProductoAlimenticio implements Producto {
    private double precio;

    public ProductoAlimenticio(double precio) {
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public double aceptar(VisitorImpuesto visitor) {
        return visitor.visitarProductoAlimenticio(this);
    }
}
