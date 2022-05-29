package beersPackage.repositories;

import beersPackage.data.Brewers;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BrewersRepository {

    private Connection connection =
            ConnectionFactory.getConnection();

    public BrewersRepository() throws SQLException{

    }
    public void createOne(Brewers brewers) throws SQLException{

        PreparedStatement preparedStatement =
                connection.prepareStatement(
                        "INSERT INTO Brewers(id, name) VALUES(?,?,?,?);");
        preparedStatement.setInt(1,brewers.getId());
        preparedStatement.setString(2, brewers.getName());
        preparedStatement.executeUpdate();
    }

    public Brewers findOneById(int id) throws SQLException{
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM Brewers WHERE Id ="+id;
        ResultSet resultSet = statement.executeQuery(query);
        Brewers brewers = null;
        while (resultSet.next()){
            brewers = new Brewers(resultSet.getInt("Id"),
                    resultSet.getString("name"));
        }
        return brewers;

    }
    public List<Brewers> findAll() throws SQLException {
        Statement statement = connection.createStatement();
        String query = "SELECT*FROM Brewers";
        ResultSet resultSet = statement.executeQuery(query);
        List<Brewers>brewersList = new ArrayList<>();
        while (resultSet.next()){
            brewersList.add(new Brewers(resultSet.getInt("Id"),
                    resultSet.getString("name")));

        }
        return brewersList;
    }
    public void updateOne(Brewers brewers, int id) throws SQLException{
        PreparedStatement preparedStatement =
                connection. prepareStatement("UPDATE Brewers SET Id=?, Name=?;");
        preparedStatement.setInt(1, brewers.getId());
        preparedStatement.setString(2, brewers.getName());
        preparedStatement.executeUpdate();
    }

}
