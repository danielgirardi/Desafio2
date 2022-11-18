//criei igual dos guris (nao usar). OBS/: posso utilizar no pgAdmin

CREATE TABLE tbl_products(
    product_id serial primary key,
    product_name varchar(100) not null,
    product_price numeric not null,
    product_quantity int DEFAULT(0),
    product_category varchar(100)
);