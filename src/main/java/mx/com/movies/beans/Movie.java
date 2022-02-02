package mx.com.movies.beans;

import mx.com.movies.db.ActorDB;

import java.util.List;

public class Movie {

    public Movie() {
    }

    public Movie(int idMovie, String nameMovie, String genre) {
        this.idMovie = idMovie;
        this.nameMovie = nameMovie;
        this.genre = genre;
    }

    public Movie(String nameMovie, String genre) {
        this.nameMovie = nameMovie;
        this.genre = genre;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    private int idMovie;
    private String nameMovie;
    private String genre;

    @Override
    public String toString() {
        return "Movie{" +
                "idMovie=" + idMovie +
                ", nameMovie='" + nameMovie + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
