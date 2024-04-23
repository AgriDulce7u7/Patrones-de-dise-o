package co.edu.uniquindio.patronesdiseno.patronesdisenofx.Iterator;

import java.util.List;

public class IteradorPeliculasLista implements IteradorPeliculas {
    private List<Pelicula> peliculas;
    private int indiceActual = 0;

    public IteradorPeliculasLista(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public boolean hasNext() {
        return indiceActual < peliculas.size();
    }

    @Override
    public Pelicula next() {
        Pelicula pelicula = peliculas.get(indiceActual);
        indiceActual++;
        return pelicula;
    }
}
