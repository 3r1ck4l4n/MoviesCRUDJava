package mx.com.movies.db;

import mx.com.movies.beans.Actor;
import mx.com.movies.beans.Movie;
import mx.com.movies.beans.MovieActor;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MovieActorDB extends DBConnection{

    public int insertMovie(MovieActor movieActor){

        return 0;
    }

    public List<MovieActor> returnRelationships(){
        openConnection();
        String query = "SELECT * FROM PELICULAS INNER JOIN ACTOR_MOVIE ON PELICULAS.ID_PELICULAS = ACTOR_MOVIE.ID_MOVIE "+
        "INNER JOIN ACTORES ON ACTORES.ID_ACTOR = ACTOR_MOVIE.ID_ACTOR WHERE NOMBRE_ACTOR = 'JOHN'";
        List<MovieActor> list = new ArrayList<MovieActor>();

        try {
            Statement statement = connection.createStatement();
            ResultSet  resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                MovieActor movieActor = new MovieActor(Integer.parseInt(resultSet.getString("ID_ACTOR")),Integer.parseInt( resultSet.getString("ID_MOVIE")),
                        new Movie( Integer.parseInt(resultSet.getString("ID_PELICULAS")),resultSet.getString("NOMBRE_PELICULA"), resultSet.getString("GENERO")),
                        new Actor(Integer.parseInt(resultSet.getString("ID_ACTOR")),resultSet.getString("NOMBRE_ACTOR"), resultSet.getString("APELLIDO")));
                list.add(movieActor);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }

}
