create table if not exists Customers
(
    id         bigserial,
    first_name varchar(50)   not null,
    last_name  varchar(50)   not null,
    address    varchar(1000) not null,
    budget     decimal       not null
);