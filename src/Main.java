import com.alura.screenmatch.calculos.CalculatorTime;
import com.alura.screenmatch.calculos.RecomendationFilter;
import com.alura.screenmatch.models.Episode;
import com.alura.screenmatch.models.Movie;
import com.alura.screenmatch.models.Serie;
import com.alura.screenmatch.models.Title;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setName("Matrix");
        movie1.setReleaseDate(1998);
        movie1.setDurationMinutes(120);
        movie1.setIncludeInPlan(true);

        movie1.muestraFichaTecnica();
        movie1.evaluate(10);
        movie1.evaluate(10);
        movie1.evaluate(7.8);
        System.out.println("Média de evaluaciones de la película: " + movie1.calculateMedia());

        Serie houseDragon = new Serie();
        houseDragon.setName("House of Dragon");
        houseDragon.setReleaseDate(2022);
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

        var movie2 = new Movie();
        movie2.setName("El señor de los anillos");
        movie2.setDurationMinutes(180);
        movie2.setReleaseDate(2001);

        ArrayList<Movie> listMovies = new ArrayList<>();
        listMovies.add(movie1);
        listMovies.add(movie2);

        System.out.println("Tamaño de la lista: " + listMovies.size());
        System.out.println("Primera Pelicula:" + listMovies.get(0).getName());
        System.out.println("toString: " + listMovies.get(1).toString());
        System.out.println(listMovies.toString());

        }


    }
