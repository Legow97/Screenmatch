package com.alura.screenmatch.models;

public class Title {
    private String name;
    private int releaseDate;
    private int durationMinutes;
    private boolean includeInPlan;
    private double sumEvaluation;
    private int totalEvaluations;

    public Title(String name, int releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }
    public Title() {

    }

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void setIncludeInPlan(boolean includeInPlan) {
        this.includeInPlan = includeInPlan;
    }

    public boolean isIncludeInPlan() {
        return includeInPlan;
    }

    public void muestraFichaTecnica(){
        System.out.println("""
                El nombre de la película es: %s
                Su fecha de lanzamineto es: %d
                Duración en minutos: %d
                """.format(getName(), getReleaseDate(),getReleaseDate()));
    }

    public void evaluate(double note){
    sumEvaluation += note;
    totalEvaluations++;
    }

    public double calculateMedia(){
        return sumEvaluation/totalEvaluations;
    }
}
