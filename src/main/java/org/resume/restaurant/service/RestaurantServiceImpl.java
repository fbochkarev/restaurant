package org.resume.restaurant.service;

import org.resume.restaurant.model.Restaurant;
import org.resume.restaurant.repository.RestaurantRepository;
import org.resume.restaurant.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public Restaurant create(Restaurant restaurant) {
        return null;
    }

    @Override
    public Restaurant get(int id) throws NotFoundException {
        return null;
    }

    @Override
    public List<Restaurant> getAll() {
        List<Restaurant> restaurants = restaurantRepository.getAll();
        return restaurants;
    }

    @Override
    public int rSize() {
        return restaurantRepository.rSize();
    }
}
