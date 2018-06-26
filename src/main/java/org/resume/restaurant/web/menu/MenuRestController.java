package org.resume.restaurant.web.menu;

import org.resume.restaurant.model.Menu;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = MenuRestController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class MenuRestController extends AbstractMenuController {
    static final String REST_URL = "/rest/profile/menus";

    @Override
    @GetMapping("/{id}")
    public Menu get(@PathVariable("id") int id) {
        return super.get(id);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) {
        super.delete(id);
    }

    @Override
    @GetMapping
    public List<Menu> getAll() {
        return super.getAll();
    }

//    @Override
//    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public void update(@RequestBody Menu menu, @PathVariable("id") int id) {
//        super.update(menu, id);
//    }
//
//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Menu> createWithLocation(@RequestBody Menu menu) {
//        Menu created = super.create(menu);
//
//        URI uriOfNewResource = ServletUriComponentsBuilder.fromCurrentContextPath()
//                .path(REST_URL + "/{id}")
//                .buildAndExpand(created.getId()).toUri();
//
//        return ResponseEntity.created(uriOfNewResource).body(created);
//    }

//    @Override
//    @GetMapping(value = "/filter")
//    public List<MealWithExceed> getBetween(
//            @RequestParam(value = "startDate", required = false) LocalDate startDate, @RequestParam(value = "startTime", required = false) LocalTime startTime,
//            @RequestParam(value = "endDate", required = false) LocalDate endDate, @RequestParam(value = "endTime", required = false) LocalTime endTime) {
//        return super.getBetween(startDate, startTime, endDate, endTime);
//    }
}