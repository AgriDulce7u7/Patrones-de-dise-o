package co.edu.uniquindio.patronesdiseno.patronesdisenofx.Visitor;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private ListView<Producto> lvProductos;

    private List<Producto> productos;
    private VisitorImpuesto visitor;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Crear una lista de productos
        productos = new ArrayList<>();
        productos.add(new ProductoAlimenticio(10000));
        productos.add(new ProductoTecnologico(500000));
        productos.add(new ProductoAlimenticio(15000));
        productos.add(new ProductoTecnologico(800000));

        visitor = new VisitorImpuestoColombia();

        // Mostrar los productos en la lista
        for (Producto producto : productos) {
            lvProductos.getItems().add(producto);
        }
    }

    @FXML
    public void calcularImpuestos() {
        lvProductos.getItems().clear();
        for (Producto producto : productos) {
            double precioConImpuesto = producto.aceptar(visitor);
            lvProductos.getItems().add("Precio con impuesto: " + precioConImpuesto);
        }
    }
}
