package com.example.json_checkpoint;

import com.fasterxml.jackson.annotation.JsonProperty;

public class New_Movies {
    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @JsonProperty("Minutes")
    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }
    @JsonProperty("Genre")
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @JsonProperty("Rating")
    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
    @JsonProperty("Metascore")
    public Integer getMetaScore() {
        return metaScore;
    }

    public void setMetaScore(Integer metaScore) {
        this.metaScore = metaScore;
    }
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @JsonProperty("Votes")
    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }
    @JsonProperty("Gross")
    public Double getGross() {
        return gross;
    }

    public void setGross(Double gross) {
        this.gross = gross;
    }
    @JsonProperty("Year")
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    @JsonProperty("Credits")
    public Person[] getCredits() {
        return credits;
    }

    public void setCredits(Person[] credits) {
        this.credits = credits;
    }

    private String title;
    private Integer minutes;
    private String genre;
    private Double rating;
    private Integer metaScore;
    private String description;
    private Integer votes;
    private Double gross;
    private String year;
    private Person[] credits;
}
