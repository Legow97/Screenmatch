package com.alura.screenmatch.principal;

import com.alura.screenmatch.calculos.CalculatorTime;
import com.alura.screenmatch.calculos.RecomendationFilter;
import com.alura.screenmatch.models.Episode;
import com.alura.screenmatch.models.Movie;
import com.alura.screenmatch.models.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Matrix",1998);
        movie1.setDurationMinutes(120);
        movie1.setIncludeInPlan(true);

        movie1.muestraFichaTecnica();
        movie1.evaluate(10);
        movie1.evaluate(10);
        movie1.evaluate(7.8);
        System.out.println("Média de evaluaciones de la película: " + movie1.calculateMedia());

        Serie houseDragon = new Serie("House of Dragon",2022);
        houseDragon.setSeasons(1);
        houseDragon.setMinutesForEpisode(50);
        houseDragon.setEpisodesForSeason(10);
        houseDragon.muestraFichaTecnica();

        System.out.println("------------------------------------------------");

        CalculatorTime calculator = new CalculatorTime();
        calculator.include(movie1);
        calculator.include(houseDragon);
        System.out.println(calculator.getTotalTime());

        RecomendationFilter recomendationFilter = new RecomendationFilter();
        recomendationFilter.filter(movie1);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setName("Targerian House");
        episode.setSerie(houseDragon);
        episode.setTotalVisualisation(300);

        recomendationFilter.filter(episode);

        var movie2 = new Movie("El señor de los anillos",2001);
        movie2.setDurationMinutes(180);

        var movie3 = new Movie("Avatar", 2023);
        movie3.setDurationMinutes(200);

        ArrayList<Movie> listMovies = new ArrayList<>();
        listMovies.add(movie1);
        listMovies.add(movie2);

        System.out.println("Tamaño de la lista: " + listMovies.size());
        System.out.println("Primera Pelicula:" + listMovies.get(0).getName());
        System.out.println("toString: " + listMovies.get(1).toString());
        System.out.println(listMovies.toString());
    }
}
