package jdbc_practice;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String dburl = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC";
        String user = "root";
        String password = "password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dburl, user, password);
            String SelectSQL = "Select * FROM employees WHERE employeeNumber = ?";
            //Statement stmt = connection.createStatement();

            PreparedStatement ps = connection.prepareStatement(SelectSQL);
            ps.setInt(1, 1002);
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                String firstName = result.getString("firstName");
                String lastName = result.getString("lastName");
                String email = result.getString("email");
                System.out.println(firstName + " | " + lastName + " | " + email);
            }


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
