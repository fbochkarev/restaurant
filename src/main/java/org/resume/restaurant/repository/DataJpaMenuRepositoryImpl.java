package org.resume.restaurant.repository;

import org.hibernate.SessionFactory;
import org.resume.restaurant.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class DataJpaMenuRepositoryImpl implements MenuRepository {
    private static final Sort SORT_NAME_RESTAURANT = new Sort(Sort.Direction.ASC, "name", "restaurant_id");

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Autowired
    private CrudMenuRepository crudMenuRepository;

    @Autowired
    private CrudRestaurantRepository crudRestaurantRepository;

    @Override
    @Transactional
    public Menu save(Menu menu, int restaurantId) {
        if (!menu.isNew() && get(menu.getId(), restaurantId) == null) {
            return null;
        }
        menu.setRestaurant(crudRestaurantRepository.getOne(restaurantId));
        return crudMenuRepository.save(menu);
    }


    @Override
    public boolean delete(int id, int userId) {
        return false;
    }

    @Override
    public Menu get(int id, int restaurantId) {
        return crudMenuRepository.findById(id).filter(menu -> menu.getRestaurant().getId() == restaurantId).orElse(null);
    }

    @Override
    public List<Menu> getAll() {
        List<Menu> menus = crudMenuRepository.findAll();
        return menus;
    }

//    @Override
//    @SuppressWarnings("unchecked")
//    public List<Menu> getAll() {
//        Session session = this.sessionFactory.getCurrentSession();
//        List<Menu> menuList = session.createQuery("from Menus").list();
//        return menuList;
//    }


    @Override
    public List<Menu> getBetweenByRestaurant(LocalDateTime startDate, int restaurantId) {
        return null;
    }

    @Override
    public Menu getWithRestaurant(int id, int restaurantId) {
        return null;
    }

//    @Override
//    public List<Menu> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId) {
//        return crudMenuRepository.getBetween(startDate, endDate, userId);
//    }
//
//    @Override
//    public Menu getWithUser(int id, int userId) {
//        return crudMenuRepository.getWithUser(id, userId);
//    }

}
