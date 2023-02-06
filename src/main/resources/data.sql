CREATE TABLE `user_detail` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(15) NOT NULL,
  `email` varchar(100) NOT NULL,
  `dob` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
);

insert  into `user_detail`(`id`,`first_name`,`last_name`,`email`,`dob`) values (1,'Soumitra','Roy','contact@roytuts.com','30-08-1986'),
(2,'Souvik','Sanyal','souvik.sanyal@email.com','30-09-1991'),(3,'Akshay','Kumar','akshay.kumar@email.com','25-02-1991'),
(4,'Bijoy','Kr','bijoy.kr@email.com','17-11-1989'),(5,'Charanjiv','Singh','charanjiv.singh@email.com','26-09-1989'),
(6,'Danish','Khan','danish.khan@email.com','17-05-1851'),(7,'Emmy','Jakson','emmy.jakson@email.com','05-02-1991');