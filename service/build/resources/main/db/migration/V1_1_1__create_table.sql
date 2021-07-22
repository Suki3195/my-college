DROP TABLE IF EXISTS my_college.parent;
CREATE TABLE my_college.parent(
    id varchar(36) NOT NULL,
    father_name VARCHAR(50)  NOT NULL,
    mother_name VARCHAR(50) NOT NULL,
    father_occupation VARCHAR(50) NOT NULL,
    mother_occupation VARCHAR(50) NOT NULL,
    family_income VARCHAR(10) NOT NULL,
    contact_number VARCHAR(10) NOT NULL,

CONSTRAINT PK_parent_id PRIMARY KEY NONCLUSTERED (id)
);