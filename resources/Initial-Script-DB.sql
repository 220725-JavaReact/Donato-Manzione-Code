database pirate_supply_store;
create table pirates (
	pirate_id serial  primary key,
	pirate_name varchar(100),
	address varchar(150),
	email varchar(100)
)

create table store_front (
	store_name varchar(100) primary key,
	address varchar(150)
)

create table orders (
	order_id serial primary key,
	store_id varchar(100) not null,
	pirate_id int not null,
	total_price decimal,  
	foreign key (store_id)
      references store_front (store_name),
    foreign key (pirate_id)
      references pirates (pirate_id)
   
     

);

create table products (
	product_name varchar(100) primary key,
	store_id varchar(100) not null,
	price numeric,
	category varchar(50),
	foreign key (store_id)
		references store_front (store_name)
)
create table line_item (
	product_id varchar(100) not null,
	order_id int not null,
	quantity int,
	primary key(order_id, product_id),
	foreign key (order_id)
		references orders (order_id),
	foreign key (product_id)
		references products (product_name)
)



