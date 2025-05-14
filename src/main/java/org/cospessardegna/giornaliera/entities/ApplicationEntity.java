package org.cospessardegna.giornaliera.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "appEntity")
public class ApplicationEntity {
    @Id
    @Column(name = "appId")
    private Integer id;

    @Column(name = "description", length = 100)
    private String description;
}


/*
CREATE TABLE `app_entity` (
  `app_id` int NOT NULL,
  `desc` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`app_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 */
