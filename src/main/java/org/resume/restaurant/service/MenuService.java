package org.resume.restaurant.service;

import org.resume.restaurant.model.Menu;

import java.util.List;

public interface MenuService {
    // null if updated meal do not belong to userId
    Menu save(Menu menu, int userId);

    // false if meal do not belong to userId
    boolean delete(int id, int userId);

    // null if meal do not belong to userId
    Menu get(int id, int userId);

    // ORDERED dateTime desc
//    List<Menu> getAll(int restaurantId);
    List<Menu> getAll();
}
