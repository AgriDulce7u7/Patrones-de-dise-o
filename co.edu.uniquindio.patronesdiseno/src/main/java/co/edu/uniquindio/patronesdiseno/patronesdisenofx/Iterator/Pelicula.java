package co.edu.uniquindio.patronesdiseno.patronesdisenofx.Iterator;

public class Pelicula {
    private String titulo;
    private String director;

    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return titulo + " (" + director + ")";
    }
}