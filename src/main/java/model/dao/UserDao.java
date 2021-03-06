package model.dao;

import model.entity.User;

import java.util.Optional;

public interface UserDao extends GenericDao<User> {

    User findByName(String name);
//    Optional<User> getUserByEmail(String email);
}
