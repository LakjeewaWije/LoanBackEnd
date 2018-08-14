# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table loan (
  name                          varchar(255) not null,
  amount                        varchar(255) not null,
  date                          varchar(255) not null,
  status                        varchar(255) not null,
  remarks                       varchar(255) not null
);


# --- !Downs

drop table if exists loan;

