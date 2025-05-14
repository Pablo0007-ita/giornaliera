package org.cospessardegna.Giornaliera.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "description", length = 100, nullable = false)
    private String description;
}

/*
CREATE TABLE `role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 */
