
CREATE TABLE Employee (
   id int(10) DEFAULT NULL,
   name varchar(20) DEFAULT NULL,
   manager_name varchar(20) DEFAULT NULL,
   dept varchar(20) NOT NULL DEFAULT '',
   salary int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


ALTER TABLE Employee
ADD PRIMARY KEY (dept), ADD  INDEX KEY id (id) ;
