CREATE SCHEMA IF NOT EXISTS myschema;

DROP TABLE IF EXISTS myschema.users, myschema.orders, myschema.tours;

CREATE TABLE IF NOT EXISTS myschema.users (
   user_id integer PRIMARY KEY,
   first_name varchar(100),
   last_name varchar(100),
   email varchar(100),
   password varchar(100),
   active boolean,
   birthday date
);

CREATE TABLE IF NOT EXISTS myschema.tours (
   tour_id integer PRIMARY KEY,
   name varchar(100),
   description varchar(100),
   location varchar(100),
   start_date date,
   end_date date,
   count_limit integer
);

CREATE TABLE IF NOT EXISTS myschema.orders (
   order_id integer PRIMARY KEY,
   user_id integer REFERENCES myschema.users (user_id),
   tour_id integer REFERENCES myschema.tours (tour_id),
   confirmed boolean,
   time_key date
);



INSERT INTO myschema.users VALUES
    (14, 'Mark', 'Zuckerberg', 'mark@gmail.com', 'qwertl', true, '1998-02-05');

INSERT INTO myschema.tours VALUES
    (12, 'Bali', 'Nice trip', 'Bali again', '2018-09-09', '2018-09-18', 12);
