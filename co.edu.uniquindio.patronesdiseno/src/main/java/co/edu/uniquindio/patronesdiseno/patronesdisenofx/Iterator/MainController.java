package co.edu.uniquindio.patronesdiseno.patronesdisenofx.Iterator;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private ListView<Pelicula> lvPeliculas;

    private List<Pelicula> peliculas;
    private IteradorPeliculas iterador;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Crear una lista de películas
        peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("El Señor de los Anillos: La Comunidad del Anillo", "Peter Jackson"));
        peliculas.add(new Pelicula("El Padrino", "Francis Ford Coppola"));
        peliculas.add(new Pelicula("El Rey León", "Roger Allers, Rob Minkoff"));
        peliculas.add(new Pelicula("Inception", "Christopher Nolan"));

        // Crear el iterador
        iterador = new IteradorPeliculasLista(peliculas);

        // Mostrar la primera película
        siguientePelicula();
    }

    @FXML
    public void siguientePelicula() {
        if (iterador.hasNext()) {
            Pelicula pelicula = iterador.next();
            lvPeliculas.getItems().add(pelicula);
        } else {
            lvPeliculas.getItems().add(new Pelicula("No hay más películas", ""));
        }
    }
}
