package model.dao.impl;

import model.dao.UserDao;
import model.dao.mapper.UserMapper;
import model.entity.User;
import model.entity.types.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JDBCUserDao implements UserDao {
    private Connection connection;

    //public JDBCUserDao(Connection connection) {
       // this.connection = connection;
   // }

    public JDBCUserDao(){}


    @Override
    public boolean create(User entity) throws SQLException {
        try(Connection connection = ConnectionPoolHolder.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO user(login, password, user_email, role_ID_role) VALUES (?,?,?,?)")){

            System.out.println(entity);

            statement.setString(1, entity.getLogin());
            statement.setString(2, entity.getPassword());
            statement.setString(3, entity.getEmail());
            statement.setInt(4, 2);//entity.getRole().getId());

            statement.execute();
            return true;

       //     statement.setInt(4, entity.getRole());


        }catch (SQLException | RuntimeException ex){
            System.out.println(ex);
            throw new RuntimeException();
        }

    }

    @Override
    public User findById(int id) {
        return null;
    }



    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close()  {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User findByName(String name) throws RuntimeException {

        try(Connection connection = ConnectionPoolHolder.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user WHERE login = ?")){
            preparedStatement.setString(1,name);
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();

            User user = new UserMapper().extractFromResultSet(rs);

            return user;

        }catch (SQLException ex){
            System.out.println(ex);
            throw new RuntimeException();
        }
    }
}
