package org.cospessardegna.giornaliera.entities;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "clocking")
public class Clocking {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "direction", nullable = false)
    private Character direction;

    @Column(name = "clockingTime",nullable = false)
    private LocalDateTime clockingTime;

    @Column(name = "userId")
    private Integer userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", insertable = false, updatable = false)
    private User user;
}

/*
CREATE TABLE `clocking` (
  `id` int NOT NULL AUTO_INCREMENT,
  `direction` char(1) COLLATE utf8mb4_general_ci NOT NULL,
  `clocking_time` datetime NOT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `clocking_users_FK` (`user_id`),
  CONSTRAINT `clocking_users_FK` FOREIGN KEY (`user_id`) REFERENCES `user` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 */
