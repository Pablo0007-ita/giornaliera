package org.cospessardegna.giornaliera.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "shift")
public class Shift {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "start_date_time",nullable = false)
    private LocalDateTime startDateTime;

    @Column(name = "end_date_time",nullable = false)
    private LocalDateTime endDateTime;
}


/*
CREATE TABLE `shift` (
  `id` int NOT NULL AUTO_INCREMENT,
  `start_date_time` datetime NOT NULL,
  `end_date_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 */