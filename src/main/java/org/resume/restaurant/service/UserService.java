package org.resume.restaurant.service;


import org.resume.restaurant.model.User;
import org.resume.restaurant.to.UserTo;
import org.resume.restaurant.util.exception.NotFoundException;

import java.util.List;

public interface UserService {

    User create(User user);

    void delete(int id) throws NotFoundException;

    User get(int id) throws NotFoundException;

    User getByEmail(String email) throws NotFoundException;

    void update(User user);

    void update(UserTo user);

    List<User> getAll();

    void enable(int id, boolean enable);

    User getWithMeals(int id);
}