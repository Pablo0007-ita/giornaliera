package org.cospessardegna.Giornaliera.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "team")
public class Team {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "description",length = 100)
    private String description;
}



/*
CREATE TABLE `team` (
  `id` int NOT NULL AUTO_INCREMENT,
  `desc` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 */