package org.resume.restaurant.service;

import org.resume.restaurant.model.Menu;
import org.resume.restaurant.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    private MenuRepository menuRepository;

    @Autowired
    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public Menu save(Menu menu, int userId) {
        return null;
    }

    @Override
    public boolean delete(int id, int userId) {
        return false;
    }

    @Override
    public Menu get(int id, int userId) {
        return null;
    }

    //    @Override
//    public List<Menu> getAll(int restaurantId) {
//        return menuRepository.getAll(restaurantId);
//    }
    @Cacheable("menus")
    @Override
    public List<Menu> getAll() {
        return menuRepository.getAll();
    }
}
