package mx.com.movies;

import mx.com.movies.beans.Movie;
import mx.com.movies.beans.MovieActor;
import mx.com.movies.db.MovieActorDB;
import mx.com.movies.db.MovieDB;

import java.util.List;

public class Main {
    public static void main( String[] args ){
        MovieActorDB movieActorDB = new MovieActorDB();

        List<MovieActor> list = movieActorDB.returnRelationships();

        for (MovieActor movieActor:list) {
            System.out.println(movieActor);
        }

        //movieDB.deleteMovie(2);
    }
}
