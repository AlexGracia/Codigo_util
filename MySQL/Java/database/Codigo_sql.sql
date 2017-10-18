-- 0. Crear base de datos
create database nombre_BD;

-- 1. Usar dicha base de datos
use nombre_BD;

-- 2. Crear tabla
create table nombre_Tabla
(
id int unsigned primary key auto_increment,
nombre_Columna varchar(100)
)ENGINE = InnoDB;

/*
-- 3. Insertar datos para las probatinas
insert into nombre_Tabla (nombre_Columna) values ('documento.txt');

-- 4. Hacer primera consulta
select nombre_Columna from nombre_Tabla;

-- 5. Hacer consulta sin extensiones
select substring_index(nombre_Columna, ".", 1)
nombre_Columna -- Esto es opcional
from nombre_Tabla;
*/
