package mx.com.movies.db;

import mx.com.movies.beans.Movie;

import java.sql.PreparedStatement;
import java.util.List;

public class MovieDB extends DBConnection{
    public int insertMovie(Movie movie){
        int status;
        openConnection();
        String query = "INSERT INTO PELICULAS VALUES(?,?)";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, movie.getNameMovie());
            statement.setString(2, movie.getGenre());
            status = statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            status = 0;
            e.printStackTrace();
        }finally {
            closeConnection();
        }
        return status;
    }

    public void deleteMovie(int id){
        openConnection();
        String query = "delete from peliculas WHERE ID_PELICULAS= ?";

        try{
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, Integer.toString(id));
            System.out.println(!statement.execute()?"Se elimino correctamente":"No se ha eliminado");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            closeConnection();
        }

    }

    public List<Movie> readMovies(){

        return null;
    }

    public int updateMovie(Movie movie){
        int status;
        openConnection();
        String query = "UPDATE PELICULAS SET NOMBRE_PELICULA = ?, GENERO =? WHERE ID_PELICULAS= ?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, movie.getNameMovie());
            statement.setString(2, movie.getGenre());
            statement.setString(3, Integer.toString(movie.getIdMovie()));
            status = statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            status = 0;
            e.printStackTrace();
        }finally {
            closeConnection();
        }
        return status;
    }
}
