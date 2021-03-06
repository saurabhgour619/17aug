CREATE TABLE `guest_profile` (
  `guest_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `email` varchar(50) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `password` varchar(50) NOT NULL,
  `created_date` datetime NOT NULL,
  `updated_date` datetime NOT NULL,
  PRIMARY KEY (`guest_id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ;
CREATE TABLE `resort_reservation` (
  `r_reservation_number` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `guest_id_fk` bigint(20) unsigned NOT NULL,
  `room_type` varchar(50) NOT NULL,
  `arrival_date` datetime NOT NULL,
  `departure_date` datetime NOT NULL,
  `no_of_people` int(11) NOT NULL,
  `status` varchar(10) NOT NULL,
  `created_date` datetime NOT NULL,
  `updated_date` datetime NOT NULL,
  PRIMARY KEY (`r_reservation_number`),
  KEY `guest_id_fk_idx` (`guest_id_fk`),
  CONSTRAINT `guest_id` FOREIGN KEY (`guest_id_fk`) REFERENCES `guest_profile` (`guest_id`) ON DELETE CASCADE ON UPDATE CASCADE
);
CREATE TABLE `dining_reservation` (
  `d_reservation_number` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `guest_id_fk` bigint(20) unsigned NOT NULL,
  `dining_type` varchar(50) NOT NULL,
  `arrival_date` datetime NOT NULL,
  `no_of_people` int(11) unsigned NOT NULL,
  `status` varchar(10) NOT NULL,
  `created_date` datetime NOT NULL,
  `updated_date` datetime NOT NULL,
  PRIMARY KEY (`d_reservation_number`),
  KEY `guest_id_fk_d_idx` (`guest_id_fk`),
  CONSTRAINT `guest_id_fk_d` FOREIGN KEY (`guest_id_fk`) REFERENCES `guest_profile` (`guest_id`) ON DELETE CASCADE ON UPDATE CASCADE
);