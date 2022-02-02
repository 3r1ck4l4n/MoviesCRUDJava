package mx.com.movies;

import mx.com.movies.beans.Movie;
import mx.com.movies.db.MovieDB;

public class Main {
    public static void main( String[] args ){
        MovieDB movieDB = new MovieDB();
        int result = movieDB.insertMovie(new Movie(2,"MSI","Action"));
         result += movieDB.insertMovie(new Movie("Pulp Fiction","Action"));
        System.out.println("Se actualizaron: "+result+ " renglones");


        //movieDB.deleteMovie(2);
    }
}
