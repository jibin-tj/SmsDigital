CREATE TABLE hotel(
   id         INTEGER  NOT NULL PRIMARY KEY 
  ,city       VARCHAR(40) NOT NULL
  ,start_date DATE  NOT NULL
  ,end_date   DATE  NOT NULL
  ,price      NUMERIC(5,2) NOT NULL
  ,status     VARCHAR(7) NOT NULL
  ,color      VARCHAR(7) NOT NULL
);