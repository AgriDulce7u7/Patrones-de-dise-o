package co.edu.uniquindio.patronesdiseno.patronesdisenofx.Visitor;

public interface VisitorImpuesto {
    double visitarProductoAlimenticio(ProductoAlimenticio producto);
    double visitarProductoTecnologico(ProductoTecnologico producto);
}
