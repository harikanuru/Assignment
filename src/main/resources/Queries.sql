CREATE DATABASE `emp` /*!40100 DEFAULT CHARACTER SET latin1 */;


CREATE TABLE `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `titile` varchar(45) DEFAULT NULL,
  `fname` varchar(45) DEFAULT NULL,
  `sname` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `street` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `postcode` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `dob` varchar(45) DEFAULT NULL,
  `registeredAt` varchar(45) DEFAULT NULL,
  `cell` varchar(45) DEFAULT NULL,
  `image` varchar(100) DEFAULT NULL,
  `nat` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

INSERT INTO `emp`.`person`(`titile`,`fname`,`sname`,`email`,`gender`,`street`,`city`,`state`,`postcode`,`username`,`password`,`dob`,`registeredAt`,`phone`,`cell`,`image`,`nat`)
VALUES("mr","terrance","bell","terrance.bell@example.com","male","376 ash dr", "peoria" ,"north dakota","82976","biglion154","321654","1960-09-11 10:54:20","2013-03-19T22:33:43Z","(195)-690-7423","(401)-235-1290","https://randomuser.me/api/portraits/men/92.jpg","US");
INSERT INTO `emp`.`person`(`titile`,`fname`,`sname`,`email`,`gender`,`street`,`city`,`state`,`postcode`,`username`,`password`,`dob`,`registeredAt`,`phone`,`cell`,`image`,`nat`)
VALUES("mr","terrance","bell","terrance.bell@example.com","male","376 ash dr", "peoria" ,"north dakota","82976","biglion154","321654","1960-09-11 10:54:20","2013-03-19T22:33:43Z","(195)-690-7423","(401)-235-1290","https://randomuser.me/api/portraits/men/92.jpg","US");
INSERT INTO `emp`.`person`(`titile`,`fname`,`sname`,`email`,`gender`,`street`,`city`,`state`,`postcode`,`username`,`password`,`dob`,`registeredAt`,`phone`,`cell`,`image`,`nat`)
VALUES("mr","terrance","bell","terrance.bell@example.com","male","376 ash dr", "peoria" ,"north dakota","82976","biglion154","321654","1960-09-11 10:54:20","2013-03-19T22:33:43Z","(195)-690-7423","(401)-235-1290","https://randomuser.me/api/portraits/men/92.jpg","US");
INSERT INTO `emp`.`person`(`titile`,`fname`,`sname`,`email`,`gender`,`street`,`city`,`state`,`postcode`,`username`,`password`,`dob`,`registeredAt`,`phone`,`cell`,`image`,`nat`)
VALUES("mr","terrance","bell","terrance.bell@example.com","male","376 ash dr", "peoria" ,"north dakota","82976","biglion154","321654","1960-09-11 10:54:20","2013-03-19T22:33:43Z","(195)-690-7423","(401)-235-1290","https://randomuser.me/api/portraits/men/92.jpg","US");
INSERT INTO `emp`.`person`(`titile`,`fname`,`sname`,`email`,`gender`,`street`,`city`,`state`,`postcode`,`username`,`password`,`dob`,`registeredAt`,`phone`,`cell`,`image`,`nat`)
VALUES("mr","terrance","bell","terrance.bell@example.com","male","376 ash dr", "peoria" ,"north dakota","82976","biglion154","321654","1960-09-11 10:54:20","2013-03-19T22:33:43Z","(195)-690-7423","(401)-235-1290","https://randomuser.me/api/portraits/men/92.jpg","US");

