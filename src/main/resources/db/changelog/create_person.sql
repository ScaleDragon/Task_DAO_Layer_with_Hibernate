CREATE TABLE PERSONS
(
    id             SERIAL PRIMARY KEY,
    name           VARCHAR(20) NOT NULL,
    surname        VARCHAR(20) NOT NULL,
    age            INT,
    phone_number   VARCHAR(20) NOT NULL,
    city_of_living VARCHAR(30) NOT NULL
);