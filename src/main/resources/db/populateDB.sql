DELETE FROM user_roles;
DELETE FROM menus;
DELETE FROM users;
DELETE FROM USER_ROLES;
ALTER SEQUENCE global_seq
RESTART WITH 100000;

INSERT INTO users (name, email, password) VALUES
  ('User', 'user@yandex.ru', '{noop}password'),
  ('Admin', 'admin@gmail.com', '{noop}admin');

INSERT INTO user_roles (role, user_id) VALUES
  ('ROLE_USER', 100000),
  ('ROLE_ADMIN', 100001);

INSERT INTO restaurants (ID, NAME) VALUES
  (1, 'Северная луна'),
  (2, 'Чайка'),
  (3, 'Андромеда');

INSERT INTO menus (date_time, description, price, restaurant_id) VALUES
  ('2015-05-30 10:00:00', 'Гренки', 150, 1),
  ('2015-05-30 13:00:00', 'Cельдь под шубой', 250, 1),
  ('2015-05-30 20:00:00', 'Грибочки маринованные', 200, 1),
  ('2015-05-31 10:00:00', 'Сырная тарелка', 400, 2),
  ('2015-05-31 13:00:00', 'Оливье с говядиной', 250, 2),
  ('2015-05-31 20:00:00', 'Говядина с соусом горгонзолла и драниками', 350, 2),
  ('2015-06-01 14:00:00', 'Рыбное плато', 500, 3),
  ('2015-06-01 21:00:00', 'Долма с киндзминдзюком', 250, 3),
  ('2015-06-01 15:00:00', 'Кекс Пандора со сгущенкой', 250, 3),
  ('2015-06-01 22:00:00', 'Коньяк Арарат', 150, 3);
