package Tasks;

//STEP 1. Import required packages

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbCredentials {


    // DB driver name and database URL
    static final String DbCredentials_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/education";

    //  DB credentials
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName(DbCredentials_DRIVER);

            //STEP 3: Create connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to database successfully...");

            //STEP 4: Execute a query
            System.out.println("Creating table in database...");
            stmt = conn.createStatement();

            String sqlOne = "CREATE TABLE student " +
                    "(studentid INTEGER(11), " +
                    " name VARCHAR(255), " +
                    " course INTEGER(11) ";

            String sqlTwo = "CREATE TABLE course " +
                    "(courseid INTEGER(11), " +
                    " name VARCHAR(255), " +
                    " institution INTEGER(11) ";

            String sqlThree = "CREATE TABLE institution " +
                    "(institutionid INTEGER(11), " +
                    " name VARCHAR(255) ";

            stmt.executeUpdate(sqlOne);
            stmt.executeUpdate(sqlTwo);
            stmt.executeUpdate(sqlThree);
            System.out.println("Created tables in given database...");
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // block used to close resources
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
