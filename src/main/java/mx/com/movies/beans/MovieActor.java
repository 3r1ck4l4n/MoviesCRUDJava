package mx.com.movies.beans;

public class MovieActor{
    public MovieActor() {
    }

    public MovieActor(int id_actor, int id_movie, Movie movie, Actor actor) {
        this.id_actor = id_actor;
        this.id_movie = id_movie;
        this.movie = movie;
        this.actor = actor;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public MovieActor(int id_actor, int id_movie) {
        this.id_actor = id_actor;
        this.id_movie = id_movie;
    }

    public int getId_actor() {
        return id_actor;
    }

    public void setId_actor(int id_actor) {
        this.id_actor = id_actor;
    }

    public int getId_movie() {
        return id_movie;
    }

    public void setId_movie(int id_movie) {
        this.id_movie = id_movie;
    }

    private int id_actor;
    private int id_movie;
    private Movie movie;
    private Actor actor;
}
