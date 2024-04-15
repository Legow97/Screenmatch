package com.alura.screenmatch.models;

import com.alura.screenmatch.calculos.Clasification;

public class Movie extends Title implements Clasification {
    private String director;

    public Movie(String name, int releaseDate) {
        super(name, releaseDate);
    }
    public Movie() {
        super();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasification() {
        return (int)calculateMedia()/2;
    }

    @Override
    public String toString() {
        return "Película:"+ this.getName() + "Lanzamiento:"+ getReleaseDate();
    }
}
