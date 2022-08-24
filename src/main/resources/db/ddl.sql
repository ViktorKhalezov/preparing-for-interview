CREATE TABLE STUDENTS
(
    ID                 BIGSERIAL      NOT NULL PRIMARY KEY,
    NAME              VARCHAR(255)   NOT NULL,
    MARK               DECIMAL(10, 2) NOT NULL);