package org.resume.restaurant.repository;

import org.resume.restaurant.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional(readOnly = true)
public interface CrudRestaurantRepository extends JpaRepository<Restaurant, Integer> {

    @Transactional
    @Override
    Optional<Restaurant> findById(Integer integer);

    @Override
    List<Restaurant> findAll();
}
