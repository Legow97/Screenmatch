package com.alura.screenmatch.models;

public class Serie extends Title{
    private int seasons;
    private int episodesForSeason;
    private int minutesForEpisode;

    public Serie() {
    }

    public Serie(String name, int releaseDate) {
        super(name, releaseDate);
    }

    @Override
    public int getDurationMinutes() {
        return this.seasons*this.episodesForSeason*this.minutesForEpisode;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesForSeason() {
        return episodesForSeason;
    }

    public void setEpisodesForSeason(int episodesForSeason) {
        this.episodesForSeason = episodesForSeason;
    }

    public int getMinutesForEpisode() {
        return minutesForEpisode;
    }

    public void setMinutesForEpisode(int minutesForEpisode) {
        this.minutesForEpisode = minutesForEpisode;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getName() + " (" + this.getReleaseDate() + ")";
    }
}
