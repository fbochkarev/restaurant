package org.resume.restaurant.repository;

import org.resume.restaurant.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantRepositoryImpl implements RestaurantRepository {

    @Autowired
    private CrudRestaurantRepository crudRestaurantRepository;

    @Override
    public Restaurant save(Restaurant restaurant) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Restaurant get(int id) {
        return null;
    }

    @Override
    public List<Restaurant> getAll() {
        List<Restaurant> restaurants = crudRestaurantRepository.findAll();
        return restaurants;
    }

    @Override
    public int rSize() {
        return getAll().size();
    }


}
