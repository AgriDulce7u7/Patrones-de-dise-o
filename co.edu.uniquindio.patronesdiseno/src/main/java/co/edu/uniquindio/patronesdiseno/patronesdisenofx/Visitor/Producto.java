package co.edu.uniquindio.patronesdiseno.patronesdisenofx.Visitor;

public interface Producto {
    double getPrecio();
    double aceptar(VisitorImpuesto visitor);
}