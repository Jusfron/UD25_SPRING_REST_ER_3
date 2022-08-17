
DROP table IF EXISTS cajas;
DROP table IF EXISTS almacenes;

create table almacenes(
    id int auto_increment,
    lugar varchar(100),
    capacidad int,
	PRIMARY KEY (id)
);

create table cajas(
    id int auto_increment,
    contenido varchar(100),
    valor int,
    almacen int,
	PRIMARY KEY (id),
	CONSTRAINT almacen_fk FOREIGN KEY (almacen) REFERENCES almacenes (id)
);

insert into almacenes (lugar,capacidad)values('Teruel',76200);
insert into almacenes (lugar,capacidad)values('Pamplona',24500);
insert into cajas (contenido,valor,almacen)values('Borradores',150,1);
insert into cajas (contenido,valor,almacen)values('Lapices',50,1);
insert into cajas (contenido,valor,almacen)values('Boligrafos',250,2);
insert into cajas (contenido,valor,almacen)values('Papeles',70,2);