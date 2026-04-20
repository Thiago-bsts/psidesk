create database crud_java;
use crud_java;

create table usuarios(
    id int primary key auto_increment,
    nome varchar(100),
    email varchar(100),
    idade int
);