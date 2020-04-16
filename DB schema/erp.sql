-- Database generated with pgModeler (PostgreSQL Database Modeler).
-- pgModeler  version: 0.7.0-alpha
-- PostgreSQL version: 9.3
-- Project Site: pgmodeler.com.br
-- Model Author: ---

SET check_function_bodies = false;
-- ddl-end --


-- Database creation must be done outside an multicommand file.
-- These commands were put in this file only for convenience.
-- -- object: new_database | type: DATABASE --
-- -- DROP DATABASE new_database;
-- CREATE DATABASE new_database
-- ;
-- -- ddl-end --
-- 

-- object: public.producto | type: TABLE --
-- DROP TABLE public.producto;
CREATE TABLE public.producto(
	referencia varchar(20) NOT NULL,
	descripcion varchar(20) NOT NULL,
	precio numeric(15,2) NOT NULL DEFAULT 0,
	ultimo_costo numeric(15,2) NOT NULL DEFAULT 0,
	cantidad numeric(15,2) NOT NULL DEFAULT 0,
	impuesto numeric(9,4) NOT NULL DEFAULT 0,
	servicio boolean,
	id_categoria integer NOT NULL,
	CONSTRAINT pk_producto PRIMARY KEY (referencia)

);
-- ddl-end --
COMMENT ON COLUMN public.producto.referencia IS 'Referencia del producto';
COMMENT ON COLUMN public.producto.descripcion IS 'Descripcion del producto';
COMMENT ON COLUMN public.producto.precio IS 'Precio del producto';
COMMENT ON COLUMN public.producto.ultimo_costo IS 'Ultimo costo de compra';
COMMENT ON COLUMN public.producto.cantidad IS 'Existencia del producto';
COMMENT ON COLUMN public.producto.impuesto IS '% impuesto o ITBIS del producto';
COMMENT ON COLUMN public.producto.servicio IS 'Indica si es un producto o un servicio. Si es un servicio no tiene cantidades existencia';
COMMENT ON COLUMN public.producto.id_categoria IS 'ID de la categoria';
-- ddl-end --

-- object: public.cliente | type: TABLE --
-- DROP TABLE public.cliente;
CREATE TABLE public.cliente(
	id serial,
	nombre character varying(20) NOT NULL,
	apellido character varying(20) NOT NULL,
	direcccion character varying(40) NOT NULL,
	provincia varchar(20),
	email varchar(100),
	telefono varchar(12),
	celular varchar(12),
	balance numeric(15,2) DEFAULT 0,
	CONSTRAINT pk_cliente PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.cliente IS 'Clientes';
COMMENT ON COLUMN public.cliente.id IS 'ID del cliente';
COMMENT ON COLUMN public.cliente.nombre IS 'Nombre del cliente';
COMMENT ON COLUMN public.cliente.apellido IS 'Apellido del cliente';
COMMENT ON COLUMN public.cliente.direcccion IS 'Direccion del cliente';
COMMENT ON COLUMN public.cliente.provincia IS 'Provincia del cliente';
COMMENT ON COLUMN public.cliente.email IS 'Email del clinete';
COMMENT ON COLUMN public.cliente.telefono IS 'telefono cliente';
COMMENT ON COLUMN public.cliente.celular IS 'Celuar cliente';
COMMENT ON COLUMN public.cliente.balance IS 'Balance cliente';
-- ddl-end --

-- object: public.categoria | type: TABLE --
-- DROP TABLE public.categoria;
CREATE TABLE public.categoria(
	id serial NOT NULL,
	descripcion varchar(20) NOT NULL,
	CONSTRAINT pk_categoria PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.categoria IS 'Categoria de los productos';
COMMENT ON COLUMN public.categoria.id IS 'ID de la categoria';
COMMENT ON COLUMN public.categoria.descripcion IS 'Descripcion de las categorias';
-- ddl-end --

-- object: public.factura | type: TABLE --
-- DROP TABLE public.factura;
CREATE TABLE public.factura(
	id serial NOT NULL,
	tipo_factura varchar(3) NOT NULL,
	no_factura integer NOT NULL DEFAULT 0,
	fecha timestamp NOT NULL DEFAULT now(),
	id_cliente integer NOT NULL,
	id_departamento integer NOT NULL,
	id_usuario integer NOT NULL,
	CONSTRAINT pk_factura PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.factura IS 'facturas del sistema';
COMMENT ON COLUMN public.factura.id IS 'ID para mantener esto como clave primaria';
COMMENT ON COLUMN public.factura.tipo_factura IS 'Tipo de la factura ';
COMMENT ON COLUMN public.factura.no_factura IS 'No Factura';
COMMENT ON COLUMN public.factura.fecha IS 'fecha de la factura';
COMMENT ON COLUMN public.factura.id_cliente IS 'ID del cliente';
COMMENT ON COLUMN public.factura.id_departamento IS 'ID pk';
COMMENT ON COLUMN public.factura.id_usuario IS 'ID user';
-- ddl-end --

-- object: public.factura_detalle | type: TABLE --
-- DROP TABLE public.factura_detalle;
CREATE TABLE public.factura_detalle(
	id serial NOT NULL,
	precio_venta numeric(15,2) NOT NULL DEFAULT 0,
	costo numeric(15,2) DEFAULT 0,
	cantidad numeric(9,2) NOT NULL,
	itbis numeric(15,2) NOT NULL DEFAULT 0,
	referencia_producto varchar(20) NOT NULL,
	id_factura integer NOT NULL,
	CONSTRAINT pk_factura_detalle PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.factura_detalle IS 'Detalle de los productos que se hacen en una factura';
COMMENT ON COLUMN public.factura_detalle.id IS 'ID de la tabla para PK';
COMMENT ON COLUMN public.factura_detalle.precio_venta IS 'Precio de venta del producto';
COMMENT ON COLUMN public.factura_detalle.costo IS 'Costo';
COMMENT ON COLUMN public.factura_detalle.cantidad IS 'Cantidad del producto';
COMMENT ON COLUMN public.factura_detalle.itbis IS 'ITBIS del producto';
COMMENT ON COLUMN public.factura_detalle.referencia_producto IS 'Referencia del producto';
COMMENT ON COLUMN public.factura_detalle.id_factura IS 'ID para mantener esto como clave primaria';
-- ddl-end --

-- object: public.departamento | type: TABLE --
-- DROP TABLE public.departamento;
CREATE TABLE public.departamento(
	id serial,
	descripcion varchar(20),
	CONSTRAINT pk_depto PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.departamento IS 'Tabla de los departamentos de la empresa';
COMMENT ON COLUMN public.departamento.id IS 'ID pk';
COMMENT ON COLUMN public.departamento.descripcion IS 'Descrpcion';
-- ddl-end --

-- object: public.suplidores | type: TABLE --
-- DROP TABLE public.suplidores;
CREATE TABLE public.suplidores(
	id serial,
	nombre varchar(20) NOT NULL,
	contacto varchar(20) NOT NULL,
	direccion varchar(20) NOT NULL,
	telefono varchar(12),
	telefono_contacto varchar(12),
	email varchar(100),
	web varchar(100),
	email_contacto varchar(100),
	CONSTRAINT pk_suplidor PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.suplidores IS 'Suplidores que suplen los productos';
COMMENT ON COLUMN public.suplidores.id IS 'ID del suplidor';
COMMENT ON COLUMN public.suplidores.nombre IS 'Nombre Suplidor';
COMMENT ON COLUMN public.suplidores.contacto IS 'COntacto de la cuenta';
COMMENT ON COLUMN public.suplidores.direccion IS 'Direcccion suplidor';
COMMENT ON COLUMN public.suplidores.telefono IS 'Telefono suplior';
COMMENT ON COLUMN public.suplidores.telefono_contacto IS 'Celular del contacto con el suplidro';
COMMENT ON COLUMN public.suplidores.email IS 'Email del suplidor';
COMMENT ON COLUMN public.suplidores.web IS 'WebSite del suplidor';
COMMENT ON COLUMN public.suplidores.email_contacto IS 'Email de la persona de contacto';
-- ddl-end --

-- object: public.entrada_inventario | type: TABLE --
-- DROP TABLE public.entrada_inventario;
CREATE TABLE public.entrada_inventario(
	id serial,
	fecha_entrada timestamp NOT NULL DEFAULT now(),
	comentario text,
	id_suplidores integer,
	CONSTRAINT pk_entrada PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.entrada_inventario IS 'Entradas de los productos de inventario';
COMMENT ON COLUMN public.entrada_inventario.id IS 'No de la entrada ';
COMMENT ON COLUMN public.entrada_inventario.fecha_entrada IS 'fecha de la entrada al sistema';
COMMENT ON COLUMN public.entrada_inventario.comentario IS 'comentario de la entrada';
COMMENT ON COLUMN public.entrada_inventario.id_suplidores IS 'ID del suplidor';
-- ddl-end --

-- object: public.entrada_inventario_detalle | type: TABLE --
-- DROP TABLE public.entrada_inventario_detalle;
CREATE TABLE public.entrada_inventario_detalle(
	id serial,
	costo numeric(15,2),
	cantidad numeric(9,2),
	id_entrada_inventario integer NOT NULL,
	referencia_producto varchar(20) NOT NULL,
	CONSTRAINT pk_entrada_inv_detalle PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.entrada_inventario_detalle IS 'Productos que se le dieron entrdada';
COMMENT ON COLUMN public.entrada_inventario_detalle.id IS 'ID de cada producto';
COMMENT ON COLUMN public.entrada_inventario_detalle.costo IS 'Costo del producto';
COMMENT ON COLUMN public.entrada_inventario_detalle.cantidad IS 'Cantidad de poductos entrada al inventario';
COMMENT ON COLUMN public.entrada_inventario_detalle.id_entrada_inventario IS 'No de la entrada ';
COMMENT ON COLUMN public.entrada_inventario_detalle.referencia_producto IS 'Referencia del producto';
-- ddl-end --

-- object: public.salida_inventario | type: TABLE --
-- DROP TABLE public.salida_inventario;
CREATE TABLE public.salida_inventario(
	id serial,
	fecha_entrada timestamp NOT NULL DEFAULT now(),
	comentario text,
	id_usuario integer NOT NULL,
	CONSTRAINT pk_entrada_1 PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.salida_inventario IS 'Salida de los productos de inventario';
COMMENT ON COLUMN public.salida_inventario.id IS 'No de la entrada ';
COMMENT ON COLUMN public.salida_inventario.fecha_entrada IS 'fecha de la entrada al sistema';
COMMENT ON COLUMN public.salida_inventario.comentario IS 'comentario de la entrada';
COMMENT ON COLUMN public.salida_inventario.id_usuario IS 'ID user';
-- ddl-end --

-- object: public.salida_inventario_detalle | type: TABLE --
-- DROP TABLE public.salida_inventario_detalle;
CREATE TABLE public.salida_inventario_detalle(
	id serial,
	costo numeric(15,2),
	cantidad numeric(9,2),
	id_salida_inventario integer NOT NULL,
	referencia_producto varchar(20) NOT NULL,
	CONSTRAINT pk_salida PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.salida_inventario_detalle IS 'Productos que se le dieron salida';
COMMENT ON COLUMN public.salida_inventario_detalle.id IS 'ID de cada producto';
COMMENT ON COLUMN public.salida_inventario_detalle.costo IS 'Costo del producto';
COMMENT ON COLUMN public.salida_inventario_detalle.cantidad IS 'Cantidad de poductos entrada al inventario';
COMMENT ON COLUMN public.salida_inventario_detalle.id_salida_inventario IS 'No de la entrada ';
COMMENT ON COLUMN public.salida_inventario_detalle.referencia_producto IS 'Referencia del producto';
-- ddl-end --

-- object: public.usuario | type: TABLE --
-- DROP TABLE public.usuario;
CREATE TABLE public.usuario(
	id serial,
	username varchar(20),
	password varchar(32),
	nombre_usuario varchar(40),
	email varchar(100),
	activo boolean,
	CONSTRAINT pk_user PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.usuario IS 'Usaurios que usan el sistema ';
COMMENT ON COLUMN public.usuario.id IS 'ID user';
COMMENT ON COLUMN public.usuario.username IS 'nombre usaurio';
COMMENT ON COLUMN public.usuario.password IS 'Clave para entrar al sistema';
COMMENT ON COLUMN public.usuario.nombre_usuario IS 'Nombre correcto del usaurio';
COMMENT ON COLUMN public.usuario.email IS 'Email del usaurio';
COMMENT ON COLUMN public.usuario.activo IS 'Indica si esta o no activo en la empresa para poder entrar al sistema';
-- ddl-end --

-- object: public.recibos | type: TABLE --
-- DROP TABLE public.recibos;
CREATE TABLE public.recibos(
	id serial,
	no_recibo integer DEFAULT 0,
	fecha timestamp,
	monto numeric(15,2) DEFAULT 0,
	comentario text,
	CONSTRAINT pk_recibo PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.recibos IS 'Recibios de las facturas a credito que se hacen en el sistema';
COMMENT ON COLUMN public.recibos.id IS 'ID de recibo';
COMMENT ON COLUMN public.recibos.no_recibo IS 'Numero del recibo';
COMMENT ON COLUMN public.recibos.fecha IS 'fecha del recibo';
COMMENT ON COLUMN public.recibos.monto IS 'Monto del recibo';
COMMENT ON COLUMN public.recibos.comentario IS 'cometario al recibo';
-- ddl-end --

-- object: public.recibos_facturas | type: TABLE --
-- DROP TABLE public.recibos_facturas;
CREATE TABLE public.recibos_facturas(
	id serial,
	monto_aplicado numeric(15,2) DEFAULT 0,
	id_recibos integer NOT NULL,
	id_factura integer NOT NULL,
	CONSTRAINT pk_reci_factura PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.recibos_facturas IS 'DEtalle de las facturas que pago o aplico un recibo';
COMMENT ON COLUMN public.recibos_facturas.id IS 'ID de la tabla solo para PK';
COMMENT ON COLUMN public.recibos_facturas.monto_aplicado IS 'Monto que se aplico';
COMMENT ON COLUMN public.recibos_facturas.id_recibos IS 'ID de recibo';
COMMENT ON COLUMN public.recibos_facturas.id_factura IS 'ID para mantener esto como clave primaria';
-- ddl-end --

-- object: public.permisos | type: TABLE --
-- DROP TABLE public.permisos;
CREATE TABLE public.permisos(
	id serial,
	tiene_permiso boolean,
	id_usuario integer NOT NULL,
	id_opciones_sistema integer NOT NULL,
	CONSTRAINT pk_permiso PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.permisos IS 'Permisos de las opciones que tiene un usaurio  en el sistema';
COMMENT ON COLUMN public.permisos.id IS 'ID pK';
COMMENT ON COLUMN public.permisos.tiene_permiso IS 'Indica si tiene o no permiso en la opcion';
COMMENT ON COLUMN public.permisos.id_usuario IS 'ID user';
COMMENT ON COLUMN public.permisos.id_opciones_sistema IS 'Id de la opcion';
-- ddl-end --

-- object: public.opciones_sistema | type: TABLE --
-- DROP TABLE public.opciones_sistema;
CREATE TABLE public.opciones_sistema(
	id serial,
	nombre varchar(20) NOT NULL,
	descripcion text,
	menu smallint DEFAULT 0,
	opcion smallint,
	CONSTRAINT pk_opciones PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.opciones_sistema IS 'Almacena todas las opciones del sistema para manejar sus permisos. Estas opciones son las que se muestran en el menu';
COMMENT ON COLUMN public.opciones_sistema.id IS 'Id de la opcion';
COMMENT ON COLUMN public.opciones_sistema.nombre IS 'Nombre de la opcion que saldra en el menu';
COMMENT ON COLUMN public.opciones_sistema.descripcion IS 'Indica para que es esta opcion y que hace';
COMMENT ON COLUMN public.opciones_sistema.menu IS 'Indca en cual menu se encuentra esta opcion';
COMMENT ON COLUMN public.opciones_sistema.opcion IS 'Indica cual opcion es en el menu donde se encuentra';
-- ddl-end --

-- object: public.devolucion | type: TABLE --
-- DROP TABLE public.devolucion;
CREATE TABLE public.devolucion(
	id serial,
	fecha timestamp,
	id_usuario integer NOT NULL,
	id_factura integer NOT NULL,
	CONSTRAINT pk_devolucoin PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.devolucion IS 'Devoluciones hechas a las facturas';
COMMENT ON COLUMN public.devolucion.id IS 'PK';
COMMENT ON COLUMN public.devolucion.fecha IS 'Fecha de la devolucion';
COMMENT ON COLUMN public.devolucion.id_usuario IS 'ID user';
COMMENT ON COLUMN public.devolucion.id_factura IS 'ID para mantener esto como clave primaria';
-- ddl-end --

-- object: public.devolucion_detalle | type: TABLE --
-- DROP TABLE public.devolucion_detalle;
CREATE TABLE public.devolucion_detalle(
	id serial,
	cantidad_devuelta numeric(9,2) DEFAULT 0,
	precio numeric(15,2) DEFAULT 0,
	id_devolucion integer NOT NULL,
	referencia_producto varchar(20)
);
-- ddl-end --
COMMENT ON TABLE public.devolucion_detalle IS 'Productos que fueron devueltos';
COMMENT ON COLUMN public.devolucion_detalle.id IS 'ID para el detalle y hacer el PK';
COMMENT ON COLUMN public.devolucion_detalle.cantidad_devuelta IS 'que cantidad de un producto fue devuelta';
COMMENT ON COLUMN public.devolucion_detalle.precio IS 'Precio del producto devuelto';
COMMENT ON COLUMN public.devolucion_detalle.id_devolucion IS 'PK';
COMMENT ON COLUMN public.devolucion_detalle.referencia_producto IS 'Referencia del producto';
-- ddl-end --

-- object: categoria_fk | type: CONSTRAINT --
-- ALTER TABLE public.producto DROP CONSTRAINT categoria_fk;
ALTER TABLE public.producto ADD CONSTRAINT categoria_fk FOREIGN KEY (id_categoria)
REFERENCES public.categoria (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: cliente_fk | type: CONSTRAINT --
-- ALTER TABLE public.factura DROP CONSTRAINT cliente_fk;
ALTER TABLE public.factura ADD CONSTRAINT cliente_fk FOREIGN KEY (id_cliente)
REFERENCES public.cliente (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: departamento_fk | type: CONSTRAINT --
-- ALTER TABLE public.factura DROP CONSTRAINT departamento_fk;
ALTER TABLE public.factura ADD CONSTRAINT departamento_fk FOREIGN KEY (id_departamento)
REFERENCES public.departamento (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: usuario_fk | type: CONSTRAINT --
-- ALTER TABLE public.factura DROP CONSTRAINT usuario_fk;
ALTER TABLE public.factura ADD CONSTRAINT usuario_fk FOREIGN KEY (id_usuario)
REFERENCES public.usuario (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: producto_fk | type: CONSTRAINT --
-- ALTER TABLE public.factura_detalle DROP CONSTRAINT producto_fk;
ALTER TABLE public.factura_detalle ADD CONSTRAINT producto_fk FOREIGN KEY (referencia_producto)
REFERENCES public.producto (referencia) MATCH FULL
ON DELETE SET DEFAULT ON UPDATE RESTRICT;
-- ddl-end --


-- object: suplidores_fk | type: CONSTRAINT --
-- ALTER TABLE public.entrada_inventario DROP CONSTRAINT suplidores_fk;
ALTER TABLE public.entrada_inventario ADD CONSTRAINT suplidores_fk FOREIGN KEY (id_suplidores)
REFERENCES public.suplidores (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: entrada_inventario_fk | type: CONSTRAINT --
-- ALTER TABLE public.entrada_inventario_detalle DROP CONSTRAINT entrada_inventario_fk;
ALTER TABLE public.entrada_inventario_detalle ADD CONSTRAINT entrada_inventario_fk FOREIGN KEY (id_entrada_inventario)
REFERENCES public.entrada_inventario (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: producto_fk | type: CONSTRAINT --
-- ALTER TABLE public.entrada_inventario_detalle DROP CONSTRAINT producto_fk;
ALTER TABLE public.entrada_inventario_detalle ADD CONSTRAINT producto_fk FOREIGN KEY (referencia_producto)
REFERENCES public.producto (referencia) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: factura_fk | type: CONSTRAINT --
-- ALTER TABLE public.factura_detalle DROP CONSTRAINT factura_fk;
ALTER TABLE public.factura_detalle ADD CONSTRAINT factura_fk FOREIGN KEY (id_factura)
REFERENCES public.factura (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: salida_inventario_fk | type: CONSTRAINT --
-- ALTER TABLE public.salida_inventario_detalle DROP CONSTRAINT salida_inventario_fk;
ALTER TABLE public.salida_inventario_detalle ADD CONSTRAINT salida_inventario_fk FOREIGN KEY (id_salida_inventario)
REFERENCES public.salida_inventario (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: recibos_fk | type: CONSTRAINT --
-- ALTER TABLE public.recibos_facturas DROP CONSTRAINT recibos_fk;
ALTER TABLE public.recibos_facturas ADD CONSTRAINT recibos_fk FOREIGN KEY (id_recibos)
REFERENCES public.recibos (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: factura_fk | type: CONSTRAINT --
-- ALTER TABLE public.recibos_facturas DROP CONSTRAINT factura_fk;
ALTER TABLE public.recibos_facturas ADD CONSTRAINT factura_fk FOREIGN KEY (id_factura)
REFERENCES public.factura (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: devolucion_fk | type: CONSTRAINT --
-- ALTER TABLE public.devolucion_detalle DROP CONSTRAINT devolucion_fk;
ALTER TABLE public.devolucion_detalle ADD CONSTRAINT devolucion_fk FOREIGN KEY (id_devolucion)
REFERENCES public.devolucion (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: producto_fk | type: CONSTRAINT --
-- ALTER TABLE public.devolucion_detalle DROP CONSTRAINT producto_fk;
ALTER TABLE public.devolucion_detalle ADD CONSTRAINT producto_fk FOREIGN KEY (referencia_producto)
REFERENCES public.producto (referencia) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: usuario_fk | type: CONSTRAINT --
-- ALTER TABLE public.devolucion DROP CONSTRAINT usuario_fk;
ALTER TABLE public.devolucion ADD CONSTRAINT usuario_fk FOREIGN KEY (id_usuario)
REFERENCES public.usuario (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: factura_fk | type: CONSTRAINT --
-- ALTER TABLE public.devolucion DROP CONSTRAINT factura_fk;
ALTER TABLE public.devolucion ADD CONSTRAINT factura_fk FOREIGN KEY (id_factura)
REFERENCES public.factura (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: usuario_fk | type: CONSTRAINT --
-- ALTER TABLE public.permisos DROP CONSTRAINT usuario_fk;
ALTER TABLE public.permisos ADD CONSTRAINT usuario_fk FOREIGN KEY (id_usuario)
REFERENCES public.usuario (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: opciones_sistema_fk | type: CONSTRAINT --
-- ALTER TABLE public.permisos DROP CONSTRAINT opciones_sistema_fk;
ALTER TABLE public.permisos ADD CONSTRAINT opciones_sistema_fk FOREIGN KEY (id_opciones_sistema)
REFERENCES public.opciones_sistema (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: usuario_fk | type: CONSTRAINT --
-- ALTER TABLE public.salida_inventario DROP CONSTRAINT usuario_fk;
ALTER TABLE public.salida_inventario ADD CONSTRAINT usuario_fk FOREIGN KEY (id_usuario)
REFERENCES public.usuario (id) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: producto_fk | type: CONSTRAINT --
-- ALTER TABLE public.salida_inventario_detalle DROP CONSTRAINT producto_fk;
ALTER TABLE public.salida_inventario_detalle ADD CONSTRAINT producto_fk FOREIGN KEY (referencia_producto)
REFERENCES public.producto (referencia) MATCH FULL
ON DELETE RESTRICT ON UPDATE RESTRICT;
-- ddl-end --


-- object: public.login | type: TABLE --
-- DROP TABLE public.login;
CREATE TABLE public.login(
	id serial,
	fecha timestamp DEFAULT now(),
	tipo varchar(3) NOT NULL,
	id_usuario integer NOT NULL,
	CONSTRAINT pk_login PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.login IS 'Almacena las entradas y salidas de los usaurios al sistema';
COMMENT ON COLUMN public.login.id IS 'PK';
COMMENT ON COLUMN public.login.fecha IS 'Fecha de movimiento';
COMMENT ON COLUMN public.login.tipo IS 'Define si es una entrada o si es una salida del usaurio(IN/OUT)';
COMMENT ON COLUMN public.login.id_usuario IS 'ID user';
-- ddl-end --

-- object: usuario_fk | type: CONSTRAINT --
-- ALTER TABLE public.login DROP CONSTRAINT usuario_fk;
ALTER TABLE public.login ADD CONSTRAINT usuario_fk FOREIGN KEY (id_usuario)
REFERENCES public.usuario (id) MATCH FULL
ON DELETE CASCADE ON UPDATE CASCADE;
-- ddl-end --



