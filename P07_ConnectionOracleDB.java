import java.sql.*;

class P07_ConnectionOracleDB {
    public static void main(String[] args){

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1821");

            // Create a statement object
            Statement st1 = con.createStatement();
            
            // Inserting Values
            // st1.executeUpdate("insert into std values ('Krishnakant Kumar', 'Java')");

            // Execute the query
            ResultSet rs = st1.executeQuery("select * from std");

            while (rs.next()) {
                System.out.println(rs.getString("stdName") + " | " + rs.getString("branch"));
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}