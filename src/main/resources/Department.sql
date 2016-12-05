
CREATE TABLE Department (
  id int(10) NOT NULL,
  name varchar(20) NOT NULL DEFAULT '',
  min_sal_range int(20) DEFAULT NULL,
  max_sal_range int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

ALTER TABLE Department
 ADD FOREIGN KEY (name)); 
