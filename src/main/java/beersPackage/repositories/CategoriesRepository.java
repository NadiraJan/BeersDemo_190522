package beersPackage.repositories;

import beersPackage.data.Categories;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriesRepository {

    private Connection connection =
            ConnectionFactory.getConnection();

    public CategoriesRepository() throws SQLException{
    }

    public void createOne(Categories categories) throws SQLException{

        PreparedStatement preparedStatement =
                connection.prepareStatement("INSERT INTO Categories(Id, Category)" +
                        "VALUES(?,?,?,?);");
        preparedStatement.setInt(1, categories.getId());
        preparedStatement.setNString(2,categories.getCategory());
        preparedStatement.executeUpdate();

    }
    public Categories findOneById(int Id) throws SQLException{
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM Categories WHERE Id ="+ Id;
        ResultSet resultSet = statement.executeQuery(query);
        Categories categories = null;
        while (resultSet.next()){
            categories = new Categories(resultSet.getInt("Id"),
                    resultSet.getString("Category"));
        }
        return categories;
    }
    public List<Categories>findAll()throws SQLException{
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM Categories";
        ResultSet resultSet = statement.executeQuery(query);
        List<Categories>categoriesList = new ArrayList<>();
        while(resultSet.next()){
            categoriesList.add(new Categories(resultSet.getInt("Id"),
                    resultSet.getString("Category")));
        }
        return categoriesList;
    }
    public void deleteOne(int Id) throws SQLException{
        Statement statement = connection.createStatement();
        String query = "DELETE FROM Categories WHERE Id=" +Id+";";
        statement.executeUpdate(query);
    }


}
