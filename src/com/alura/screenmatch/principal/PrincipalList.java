package com.alura.screenmatch.principal;

import com.alura.screenmatch.models.Movie;
import com.alura.screenmatch.models.Serie;
import com.alura.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalList {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Matrix",1998);
        movie1.evaluate(10);

        var movie2 = new Movie("El señor de los anillos",2001);
        movie2.evaluate(6);

        var movie3 = new Movie("Avatar", 2023);
        movie3.evaluate(10);

        Serie houseDragon = new Serie("House of Dragon",2022);

        Movie m1 = movie1;

        List<Title> lista = new ArrayList<>();
        lista.add(movie1);
        lista.add(movie2);
        lista.add(movie3);
        lista.add(houseDragon);

        for (Title item : lista) {
            System.out.println(item.getName());
            if(item instanceof Movie movie && movie.getClasification()>2){
                System.out.println(movie.getClasification());
            }
        }

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Title::getReleaseDate));
        System.out.println(lista);
    }

}
