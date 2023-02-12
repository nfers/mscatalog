create schema if not exists catalog;

create table catalog.brand(
    id uuid primary key,
    name varchar(100) not null,
    active boolean default true
);

create table catalog.product (
    id uuid primary key,
    name varchar(100) not null,
    description varchar(200),
    active boolean default true
);