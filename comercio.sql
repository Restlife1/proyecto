drop database if exists comercio;
create database comercio;
use comercio;

create table clientes(

nif varchar(9) primary key,
nombre varchar(20),
direccion varchar(50),
telefono int,
credito_disponible float,
descuento_cliente float

)engine=innodb;

create table proveedores(

cif varchar(20) primary key,
nombre_de_la_empresa varchar(30),
direccion varchar(50),
telefonos int,
codigo_de_articulos_que_suministra int not null

)engine=innodb;

create table articulos(

codigo int primary key auto_increment not null,
descripcion varchar(150) default null,
precio float not null,
stock int not null,
stock_medio int not null,
stock_minimo int not null

)engine=innodb;

create table albaran_compras(

cif_proveedor varchar(20) not null,
numero_albaran_c int not null primary key,
fecha_compra date,
orden_pedidos int not null

)engine=innodb;

create table detalle_albaran_compras(

num_albaran_c int primary key not null auto_increment,
orden_pedido int not null,
codigo_articulo int not null,
cantidad int not null,
precio float not null,
descuento float

)engine=innodb;

create table albaran_ventas(

nif_cliente varchar(9) not null,
numero_albaran_v int primary key not null,
contado_credito enum ('contado', 'credito') default 'contado'

)engine=innodb;

create table detalle_albaran_venta(

num_albaran_v int primary key not null,
fecha_venta date,
codigo_articulo int not null,
cantidad int not null,
precio float not null,
descuento float

)engine=innodb;

create table suministra(

codigo int auto_increment not null,
cif varchar(20),
primary key (codigo, cif)

)engine=innodb;

create table venta_cliente(

nif varchar(9),
numero_albaran_v int not null,
fecha_venta date,
primary key (nif, numero_albaran_v)

)engine=innodb;

create table compra_proveedor(

numero_albaran_c int not null,
cif varchar(20),
fecha_compra date,
primary key (numero_albaran_c, cif)

)engine=innodb;

alter table albaran_ventas add foreign key (nif_cliente) references clientes(nif) on delete cascade on update cascade;
alter table detalle_albaran_venta add foreign key (num_albaran_v) references albaran_ventas(numero_albaran_v) on delete cascade on update cascade;
alter table detalle_albaran_venta add foreign key (codigo_articulo) references articulos(codigo) on delete cascade on update cascade;
alter table detalle_albaran_compras add foreign key (codigo_articulo) references articulos(codigo) on delete cascade on update cascade;
alter table detalle_albaran_compras add foreign key (num_albaran_c) references albaran_compras(numero_albaran_c) on delete cascade on update cascade;
alter table albaran_compras add foreign key (cif_proveedor) references proveedores(cif) on delete cascade on update cascade;
alter table proveedores add foreign key (codigo_de_articulos_que_suministra) references articulos(codigo) on delete cascade on update cascade;

alter table venta_cliente add foreign key (nif) references clientes(nif) on delete cascade on update cascade,
	add foreign key (numero_albaran_v) references albaran_ventas(numero_albaran_v) on delete cascade on update cascade;
    
alter table compra_proveedor add foreign key(cif) references proveedores(cif) on delete cascade on update cascade,
	add foreign key (numero_albaran_c) references albaran_compras(numero_albaran_c) on delete cascade on update cascade;
    
alter table suministra add foreign key(cif) references proveedores(cif) on delete cascade on update cascade,
	add foreign key (codigo) references articulos(codigo) on delete cascade on update cascade;
    
    select * from clientes;
    select * from proveedores;
    select * from articulos;
    select * from albaran_ventas;
    select * from albaran_compras;
    select * from detalle_albaran_compras;
    select * from detalle_albaran_venta;
    select * from compra_proveedor;
    select * from venta_cliente;
    select * from suministra;