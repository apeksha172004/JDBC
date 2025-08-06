import java.sql.*;      /* Imported the package named 'java.sql' contains all drivers,classes,interfaces
                        that we'll use to work with JDBC need */

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://127.0.0.1:3306/mydatabases";
        String username = "root";
        String password = "#Apek1712";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers Loaded Successfully!!");
        } catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established Successfully!!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}