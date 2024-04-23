package co.edu.uniquindio.patronesdiseno.patronesdisenofx.Visitor;

public class VisitorImpuestoColombia implements VisitorImpuesto {
    @Override
    public double visitarProductoAlimenticio(ProductoAlimenticio producto) {
        double precio = producto.getPrecio();
        double impuesto = precio * 0.05; // 5% de impuesto para productos alimenticios
        return precio + impuesto;
    }

    @Override
    public double visitarProductoTecnologico(ProductoTecnologico producto) {
        double precio = producto.getPrecio();
        double impuesto = precio * 0.19; // 19% de impuesto para productos tecnológicos
        return precio + impuesto;
    }
}
