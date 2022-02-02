package mx.com.movies.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    protected Connection connection;

    public void openConnection(){
        String jdbcUrl = "jdbc:sqlserver://localhost;databaseName=CRUD_EJEMPLO;";
        String user = "sa";
        String pass = "sa";
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";


        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(jdbcUrl, user,pass);
            boolean con = connection.isValid(50000);
            System.out.println(con? "Connection successfully":"ERROR");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void closeConnection(){
        try{
            connection.close();
            System.out.println("Connection closed");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
