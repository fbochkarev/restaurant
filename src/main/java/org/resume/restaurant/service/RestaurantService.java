package org.resume.restaurant.service;

import org.resume.restaurant.model.Restaurant;
import org.resume.restaurant.util.exception.NotFoundException;

import java.util.List;

public interface RestaurantService {
    Restaurant create(Restaurant restaurant);

    Restaurant get(int id) throws NotFoundException;

    List<Restaurant> getAll();

    int rSize();
}
