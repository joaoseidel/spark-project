package me.spark.user;

import org.omg.CORBA.UserException;

import java.util.Collection;

public interface UserService {
    public void addUser(User user);

    public Collection<User> getUsers();

    public User getUser(String id);

    public User editUser(User user) throws UserException, me.spark.user.exceptions.UserException;

    public void deleteUser(String id);

    public boolean userExist(String id);
}
