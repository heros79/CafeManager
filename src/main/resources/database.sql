CREATE TABLE users (

vid INT NOT NULL AUTO_INCREMENT PRIMARY KEY,

 firstname VARCHAR (50) NOT NULL,

 lastname VARCHAR (50) NOT NULL,

 login VARCHAR (50) NOT NULL,

 password VARCHAR (50) NOT NULL,

 role BIT NOT NULL

)
  ENGINE = InnoDB;

CREATE TABLE tables (

 id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,

 table_number INT NOT NULL AUTO_INCREMENT,

 assigned BIT NOT NULL

)
  ENGINE = InnoDB;

CREATE TABLE products (

  id INT NOT NULL  AUTO_INCREMENT PRIMARY KEY,

  product_name VARCHAR(100) NOT NULL,

  product_description TEXT,

  product_price DOUBLE NOT NULL
)
  ENGINE = InnoDB;

CREATE TABLE orders (

  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,

  order_number INT NOT NULL AUTO_INCREMENT,

  order_status BIT NOT NULL
)
 ENGINE = InnoDB;

CREATE TABLE waiter_tables (
  user_id INT NOT NULL,
  table_id INT NOT NULL,

  FOREIGN KEY (user_id) REFERENCES users (id),
  FOREIGN KEY (table_id) REFERENCES tables (id),

  UNIQUE (user_id, table_id)
)
  ENGINE = InnoDB;
