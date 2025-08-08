import java.sql.*;      /* Imported the package named 'java.sql' contains all drivers,classes,interfaces
                        that we'll use to work with JDBC need */

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/mydatabases";
        String username = "root";
        String password = "#Apek1712";
        String query = "DELETE from employees where id = 5" ;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers Loaded Successfully!!");
        } catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established Successfully!!");
            System.out.println();
            Statement stmt = con.createStatement();
            /* ResultSet rs = stmt.executeQuery(query);
            while (rs.next())    // rs.next() means jb tk is rs instance me data rahega tb tk ye value true rahegi and loop chalta rahega.
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                double salary = rs.getDouble("salary");

                System.out.println("===============================");
                System.out.println("ID : "+ id);
                System.out.println("Name : "+ name);
                System.out.println("Job Title : "+ job_title);
                System.out.println("Salary : "+ salary);
                System.out.println();

            }
            rs.close(); */
            // It was for select * from employees query ^_^


            int rowsAffected = stmt.executeUpdate(query);
            if (rowsAffected > 0){
                System.out.println("Deletion Successful. "+ rowsAffected + " row(s) affected.");
            }else {
                System.out.println("Deletion Failed!!");
            }

            stmt.close();
            con.close();
            System.out.println("---Connection closed successfully!!---");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}