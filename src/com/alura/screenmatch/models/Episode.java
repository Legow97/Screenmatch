package com.alura.screenmatch.models;

import com.alura.screenmatch.calculos.Clasification;

public class Episode implements Clasification {
    private int number;
    private String name;
    private Serie serie;
    private int totalVisualisation;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualisation() {
        return totalVisualisation;
    }

    public void setTotalVisualisation(int totalVisualisation) {
        this.totalVisualisation = totalVisualisation;
    }

    @Override
    public int getClasification() {
        if(totalVisualisation>100) {return 4;}
        else{return 2;}
    }
}
