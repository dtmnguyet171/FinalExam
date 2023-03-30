drop database if exists finalexam2;
create database finalexam2;
use finalexam2;
create table user
(
    id int auto_increment
        primary key,
    fullname varchar(50) charset utf8mb3 not null,
    email varchar(50) not null,
    password varchar(20) not null,
    projectid int null
);

create table employee
(
    id int not null,
    proskill varchar(10) null,
    constraint employee_user__fk
        foreign key (id) references user (id)
            on update cascade on delete cascade
);

create table manager
(
    id int not null,
    expinyear float null,
    constraint `manager _user__fk`
        foreign key (id) references user (id)
            on update cascade on delete cascade
);

