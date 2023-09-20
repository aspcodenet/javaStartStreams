package se.systementor.startStreams.models;

import java.util.List;

public class Movie {
    private int id;
    private String title;
    private int releaseYear;
    private String director;
    private List<Actor> actors;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void addActor(Actor actor){
        actors.add(actor);
    }

    public Iterable<Actor> getActors(){
        return actors;
    }
 
}
