package org.resume.restaurant.web.restaurant;

import org.resume.restaurant.model.Restaurant;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = RestaurantRestController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class RestaurantRestController extends AbstractRestaurantController {
    static final String REST_URL = "/rest/profile/restaurants";

    @Override
    @GetMapping
    public List<Restaurant> getAll() {
        return super.getAll();
    }


}
