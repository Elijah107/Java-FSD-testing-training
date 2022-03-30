/*1) created a database
used it
2)added and deleted primary keys
3) added and deleted foreign keys
4)added unique constraint
5) changed the column_name of a particular table
6) changed the data_type of a column.*/




create database example;

use example;

create table addresses(
id int,
house_no int,
city varchar(20),
postalcode varchar(6),
primary key (id) -- CAN ADD PRIMARY KEY LIKE THIS ALSO
);
describe addresses;

-- FOR REMOVING THE DATA INSIDE THE TABLE
truncate addresses;

-- FOR REMOVING THE TABLE
drop table addresses;


/*FOR ADDING PRIMARY KEY*/

alter table addresses
add primary key (id);

/*For removing primary KEY*/

alter table addresses
drop primary key;

/*ADDING FOREIGN KEY*/


create table people(
id int,
first_name varchar(20),
last_name varchar(20),
address_id int
);

/*ADDING FOREIGN KEY*/

alter table people
add constraint elijah
foreign key(address_id) references addresses(id);


/*REMOVING FOREIGN KEY*/


alter  table people
drop foreign key elijah;

describe people;

/*Can see if anything present in the table*/
       select * FROM people; 


create table pets(
id int,
name varchar(20),
species varchar(20),
owner_id int
);


/*alter table <tablename>
add constraint <constraintname> unique <columnname>;*/
 

 alter table pets
 add constraint u_species unique(species);
 
  describe pets;


	/*TO SEE THE PROPERTIES*/
	show create table people;

	/*CHANGING COLUMN NAME OF PARTICULAR TABLE*/
alter table pets change species speciess varchar(20);


		/*CHANGING DATATYPE OF COLUMN*/
	alter table pets modify name varchar(30);
