package org.resume.restaurant.repository;

import org.resume.restaurant.model.Menu;

import java.time.LocalDateTime;
import java.util.List;

public interface MenuRepository {
    // null if updated meal do not belong to userId
    Menu save(Menu menu, int userId);

    // false if meal do not belong to userId
    boolean delete(int id, int userId);

    // null if meal do not belong to userId
    Menu get(int id, int userId);

    // ORDERED dateTime desc
//    List<Menu> getAll(int restaurantId);
    List<Menu> getAll();

    // ORDERED dateTime desc
    List<Menu> getBetweenByRestaurant(LocalDateTime startDate, int restaurantId);

    default Menu getWithRestaurant(int id, int restaurantId) {
        throw new UnsupportedOperationException();
    }
}
