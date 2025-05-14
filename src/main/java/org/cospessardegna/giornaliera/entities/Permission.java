package org.cospessardegna.Giornaliera.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "permission")
public class Permission {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "code", length = 11, nullable = false)
    private Integer code;
}


/*
CREATE TABLE `permission` (
  `id` int NOT NULL,
  `description` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `code` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 */
