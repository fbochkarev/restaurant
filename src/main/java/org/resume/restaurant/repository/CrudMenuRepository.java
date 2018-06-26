package org.resume.restaurant.repository;

import org.resume.restaurant.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional(readOnly = true)
public interface CrudMenuRepository extends JpaRepository<Menu, Integer> {

    @Transactional
    @Override
    Optional<Menu> findById(Integer restaurantId);

    @Transactional
    Menu save(Menu menu);

    @Override
    @Query("SELECT m FROM Menu m ORDER BY m.dateTime DESC")
    List<Menu> findAll();

//    @Query("SELECT m FROM Menus m ORDER BY m.dateTime DESC")
//    List<Menu> getAll();
}

