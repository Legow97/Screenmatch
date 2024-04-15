package com.alura.screenmatch.calculos;

import com.alura.screenmatch.models.Movie;
import com.alura.screenmatch.models.Title;

public class CalculatorTime {
    private int totalTime;

    public void include(Title titulo){
        this.totalTime += titulo.getDurationMinutes();

    }

    public int getTotalTime() {
        return totalTime;
    }
}
