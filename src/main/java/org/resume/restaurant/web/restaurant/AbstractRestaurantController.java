package org.resume.restaurant.web.restaurant;

import org.resume.restaurant.model.Restaurant;
import org.resume.restaurant.service.RestaurantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractRestaurantController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private RestaurantService service;

    public List<Restaurant>getAll(){
        log.info("getAll for restaurant");
        return service.getAll();
    }

//    public Menu create(Menu menu) {
//        int userId = AuthorizedUser.id();
//        checkNew(menu);
//        log.info("create {} for user {}", menu, userId);
//        return service.create(menu, userId);
//    }

    public Restaurant get(int id) {
        log.info("get {}", id);
        return service.get(id);
    }

    public Restaurant create(Restaurant restaurant) {
        log.info("create {}", restaurant);
        return service.create(restaurant);
    }
//
//    public void delete(int id) {
//        log.info("delete restaurant {}", id);
//        service.delete(id);
//    }
}
