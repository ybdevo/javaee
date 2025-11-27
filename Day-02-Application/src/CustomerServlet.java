import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    private final List<Customer> customerList = new ArrayList<Customer>();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String address = req.getParameter("address");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaeeapp", "root", "root");
            String query = "INSERT INTO customer (id, name, address) VALUES(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, address);
            if (preparedStatement.executeUpdate() > 0) {
                resp.getWriter().println("Customer Added Successfully");
            } else {
                resp.getWriter().println("Customer Not Added");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        customerList.add(new Customer(id, name, address));
        customerList.forEach((customer) -> {
            System.out.println(customer.toString());
        });
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaeeapp", "root", "root");
            String query = "SELECT * FROM customer";
            ResultSet resultSet = connection.createStatement().executeQuery(query);
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String addr = resultSet.getString("address");

                out.println(new Customer(id, name, addr));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String address = req.getParameter("address");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaeeapp", "root", "root");
            String query = "UPDATE customer SET name=?, address=? WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, address);
            preparedStatement.setString(3, id);
            if (preparedStatement.executeUpdate() > 0) {
                resp.getWriter().println("Customer Update Successfully");
            } else {
                resp.getWriter().println("Customer Not Updates");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaeeapp", "root", "root");
            String query = "DELETE FROM customer WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, id);
            if (preparedStatement.executeUpdate() > 0) {
                resp.getWriter().println("Customer Deleted Successfully");
            } else {
                resp.getWriter().println("Customer Not Deleted");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

