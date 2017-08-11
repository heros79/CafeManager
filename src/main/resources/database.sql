/*CREATE TABLE users (

 user_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,

 firstname VARCHAR (50) NOT NULL,

 lastname VARCHAR (50) NOT NULL,

 login VARCHAR (50) NOT NULL,

 password VARCHAR (200) NOT NULL,

 role BIT NOT NULL

)
  ENGINE = InnoDB;

CREATE TABLE tables (

 table_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,

 table_number INT NOT NULL,

 assigned BIT NOT NULL,

 user_id INT NOT NULL,

 FOREIGN KEY (user_id) REFERENCES users (user_id)

)
  ENGINE = InnoDB;

CREATE TABLE products (

  product_id INT NOT NULL  AUTO_INCREMENT PRIMARY KEY,

  product_name VARCHAR(100) NOT NULL,

  product_description TEXT,

  product_price DOUBLE NOT NULL
)
  ENGINE = InnoDB;

CREATE TABLE orders (

  order_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,

  order_number INT NOT NULL,

  order_status BIT NOT NULL,

  total_amount DOUBLE NOT NULL,

  table_id INT NOT NULL,

  FOREIGN KEY (table_id) REFERENCES tables (table_id)
)
 ENGINE = InnoDB;*/

INSERT INTO users VALUES (1, 'admin', 'admin', 'admin', '$2a$11$nc4MfyrBGqjyeIbmqhLTb.P5opIXp/MljuXH/mCz4hExzeF5xPbO2', 1);

/*INSERT INTO tables VALUE (1, 1, 0, 1);

INSERT INTO products VALUE (1, 'tea', 'with limon', 100);
INSERT INTO products VALUE (2, 'tea', 'with peach', 150);
INSERT INTO products VALUE (3, 'cofee', 'black armenian', 100);
INSERT INTO products VALUE (4, 'cofee', 'nescafe', 200);

INSERT INTO orders VALUE (1, 1, 1, 0, 1);*/


/*CREATE TABLE products_in_order (
  order_id INT,
  product_id INT,
  amount INT,

  FOREIGN KEY (order_id) REFERENCES orders (order_id),
  FOREIGN KEY (product_id) REFERENCES products (product_id),

  UNIQUE (order_id, product_id)
)
  ENGINE = InnoDB;*/
