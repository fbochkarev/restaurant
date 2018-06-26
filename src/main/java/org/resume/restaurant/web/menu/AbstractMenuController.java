package org.resume.restaurant.web.menu;

import org.resume.restaurant.AuthorizedUser;
import org.resume.restaurant.model.Menu;
import org.resume.restaurant.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//import ru.javawebinar.topjava.AuthorizedUser;
//import ru.javawebinar.topjava.model.Meal;
//import ru.javawebinar.topjava.service.MealService;
//import ru.javawebinar.topjava.to.MealWithExceed;
//import ru.javawebinar.topjava.util.DateTimeUtil;
//import ru.javawebinar.topjava.util.MealsUtil;

//import static ru.javawebinar.topjava.util.ValidationUtil.assureIdConsistent;
//import static ru.javawebinar.topjava.util.ValidationUtil.checkNew;

public abstract class AbstractMenuController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private MenuService service;

    public Menu get(int id) {
        int userId = AuthorizedUser.id();
        log.info("get meal {} for user {}", id, userId);
        return service.get(id, userId);
    }

    public void delete(int id) {
        int userId = AuthorizedUser.id();
        log.info("delete meal {} for user {}", id, userId);
        service.delete(id, userId);
    }

    public List<Menu> getAll() {
        int userId = AuthorizedUser.id();
        log.info("getAll for user {}", userId);
        return service.getAll();
    }

//    public Menu create(Menu menu) {
//        int userId = AuthorizedUser.id();
//        checkNew(menu);
//        log.info("create {} for user {}", menu, userId);
//        return service.create(menu, userId);
//    }
//
//    public void update(Menu menu, int id) {
//        int userId = AuthorizedUser.id();
//        assureIdConsistent(menu, id);
//        log.info("update {} for user {}", menu, userId);
//        service.update(menu, userId);
//    }

    /**
     * <ol>Filter separately
     * <li>by date</li>
     * <li>by time for every date</li>
     * </ol>
     */
//    public List<MealWithExceed> getBetween(LocalDate startDate, LocalTime startTime, LocalDate endDate, LocalTime endTime) {
//        int userId = AuthorizedUser.id();
//        log.info("getBetween dates({} - {}) time({} - {}) for user {}", startDate, endDate, startTime, endTime, userId);
//
//        List<Menu> mealsDateFiltered = service.getBetweenDates(
//                startDate != null ? startDate : DateTimeUtil.MIN_DATE,
//                endDate != null ? endDate : DateTimeUtil.MAX_DATE, userId);
//
//        return MealsUtil.getFilteredWithExceeded(mealsDateFiltered,
//                startTime != null ? startTime : LocalTime.MIN,
//                endTime != null ? endTime : LocalTime.MAX,
//                AuthorizedUser.getCaloriesPerDay()
//        );
//    }
}