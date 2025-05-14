package org.cospessardegna.Giornaliera.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "activityStatus")
public class ActivityStatus {

    @Id
    @Column(name = "statId")
    private Integer id;

    @Column(name = "description", length = 100)
    private String description;
}

/*

CREATE TABLE `activity_status` (
  `statid` int NOT NULL,
  `desc` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`statid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 */
