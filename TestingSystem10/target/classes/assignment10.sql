DROP DATABASE IF EXISTS assignment10;
create database assignment10;
use assignment10;

drop table if exists Department;
create table `Department` (
                              department_id			int auto_increment primary key,
                              department_name			varchar(50) not null unique
);

create table `User`
(
    id            int primary key auto_increment,
    `role`          enum ('ADMIN', 'USER') not null,
    user_name     nvarchar(20)           not null unique,
    `password`      nvarchar(20)         not null,
    email         varchar(30)            not null unique,
    date_of_birth date,
    department_id int,
    foreign key (department_id) REFERENCES Department(department_id) on delete set null on update cascade
);

INSERT INTO `assignment10`.`Department` (`department_name`) VALUES ('java');
INSERT INTO `assignment10`.`Department` (`department_name`) VALUES ('php');
INSERT INTO `assignment10`.`Department` (`department_name`) VALUES ('scrum master');

INSERT INTO `assignment10`.`User` (`role`, `user_name`, `password`, `email`, `date_of_birth`, department_id)
VALUES ('ADMIN', 'ADMIN', '123456', 'admin@gmail.com', '2000-03-22', 1);
INSERT INTO `assignment10`.`User` (`role`, `user_name`, `password`, `email`, `date_of_birth`, department_id)
VALUES ('USER', 'USER', '123456', 'user@gmail.com', '2001-03-22', 3);
