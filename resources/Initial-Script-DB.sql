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
	product_id serial primary key,
	product_name varchar(100) not null,
	store_id varchar(100) not null,
	price numeric,
	category varchar(50),
	foreign key (store_id)
		references store_front (store_name)
)
create table line_item (
	product_id int not null,
	order_id int not null,
	quantity int,
	primary key(order_id, product_id),
	foreign key (order_id)
		references orders (order_id),
	foreign key (product_id)
		references products (product_name)
)

insert
	into
	store_front (store_name,
	address)
values ('Captain Branch',
'Fleur Marie: 44° 42` 59.22` N -75° 28` 34.68` W'),
('First Mate Branch',
'Dawn: 42° 25` 15.06` N -81° 21` 30.1212` W'),
('Quartermaster Branch',
'Valentine: 41° 55` 7.32` N -81° 54` 47.16` W'),
('Sailing Master Branch',
'Two Fannies: 41° 33` 51.0012` N -81° 55` 16.7988` W'),
			('Gunner Branch',
'Trade Wind: 42° 25` 8.4` N -80° 12` 3.6` W'),
('Powder Monkey Branch',
'Elk: 44° 14` 37.7988` N -76° 4` 50.9988` W'),
('Boatswain Branch',
'Kinghorn: 44° 22` 36.3612` N -75° 55` 50.2788` W'),
('Surgeon Branch',
'Land Tortoise: 43° 26` 24.72` -73° 41` 33.72` W'),
('Cook Branch',
'Milan: 43° 22` 19.8084` N -78° 11` 28.86` W')

select * from store_front
select * from products;

insert into products (store_id, product_name, price, category)
values(
'Captain Branch','Eye Patch',10.00,'clothingAndAccessories'

),
('Captain Branch','Marlinspike',8.00,'navigation'),
('Captain Branch','Pillage and Plunder: The Definitive Guide', 15.00,'howToGuides'),
('Captain Branch','Housewife',20.00,'miscellaneous'),
('Captain Branch','Jar of Dirt',100.00, 'magicTokensAndPotions'),
('Captain Branch','Pair of Dice',3.00,'entertainment'),
('Captain Branch','Pipe',5.00,'entertainment'),
('Captain Branch','Tobacco',10.00,'entertainment'),
('Captain Branch','Sailor Palm',10.00,'navigation'),
('Captain Branch', 'Length of Rope',50.00,'navigation'),
('Captain Branch', '	Deck of Cards', 25.00, 'entertainment'),
('Captain Branch', 'Pistol',75.00,'weaponry'),
('Captain Branch', 'Sword',65.00,'weaponry'),
('Captain Branch','The Pirate Code for Dummies', 30.00,'howToGuides'),
('Captain Branch', 'Blackbeard: His Life and Times',35.00,'howToGuides')

insert into products (store_id, product_name, price, category)
values(
'First Mate Branch','Eye Patch',10.00,'clothingAndAccessories'

),
('First Mate Branch','Marlinspike',8.00,'navigation'),
('First Mate Branch','Pillage and Plunder: The Definitive Guide', 15.00,'howToGuides'),
('First Mate Branch','Housewife',20.00,'miscellaneous'),
('First Mate Branch','Jar of Dirt',100.00, 'magicTokensAndPotions'),
('First Mate Branch','Pair of Dice',3.00,'entertainment'),
('First Mate Branch','Pipe',5.00,'entertainment'),
('First Mate Branch','Tobacco',10.00,'entertainment'),
('First Mate Branch','Sailor Palm',10.00,'navigation'),
('First Mate Branch', 'Length of Rope',50.00,'navigation'),
('First Mate Branch', '	Deck of Cards', 25.00, 'entertainment'),
('First Mate Branch', 'Pistol',75.00,'weaponry'),
('First Mate Branch', 'Sword',65.00,'weaponry'),
('First Mate Branch','The Pirate Code for Dummies', 30.00,'howToGuides'),
('First Mate Branch', 'Blackbeard: His Life and Times',35.00,'howToGuides')






