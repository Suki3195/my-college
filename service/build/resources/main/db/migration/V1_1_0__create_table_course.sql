DROP TABLE IF EXISTS my_college.course_offered;
CREATE TABLE my_college.course_offered(
    id varchar(36) NOT NULL,
    course_name varchar(50)  NOT NULL UNIQUE,
    course_code varchar(10) NOT NULL UNIQUE,
    CONSTRAINT PK_course_id PRIMARY KEY NONCLUSTERED (id)
);


INSERT INTO my_college.course_offered(id,course_name,course_code)
VALUES
(uuid(),"AeroSpace Engineering","B-TECH.AE"),
(uuid(),"Chemical Engineering","B-TECH.CE"),
(uuid(),"Computer Science Engineering","B-TECH.CSE"),
(uuid(),"Electronics And Communication Engineering","B-TECH.ECE"),
(uuid(),"Mechanical Engineering","B-TECH.ME");



