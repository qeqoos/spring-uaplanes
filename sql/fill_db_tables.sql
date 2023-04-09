INSERT INTO city (display_name) VALUES('Alabama');
INSERT INTO city (display_name) VALUES('Odesa');
INSERT INTO city (display_name) VALUES('Alabama');

INSERT INTO user_profile (first_name, last_name, username, password, created_at)
VALUES('Pavlo','Qeqoos','Gigachad','secret','2023-04-23 22:23:54+02');

INSERT INTO user_profile (first_name, last_name, username, password, created_at)
VALUES('Sergei','Batechko','Nickslice','gm7d55','2022-05-12 10:56:54+02');

INSERT INTO flight (departure_city_id, arrival_city_id, departure_time, arrival_time, flight_number, price, created_at)
VALUES(1,2,'2023-04-23 22:23:54+02','2023-04-23 22:23:54+02',1235,55.23,'2023-04-23 22:23:54+02');

INSERT INTO ticket (flight_id, user_profile_id, pnr, created_at)
VALUES(1,1,'idk wht is this','2023-04-23 22:23:54+02')