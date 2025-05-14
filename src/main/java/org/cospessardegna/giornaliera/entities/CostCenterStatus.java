package org.cospessardegna.Giornaliera.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "costCenterStatus")
public class CostCenterStatus {

    @Id
    @Column(name = "statusccId")
    private Integer id;

    @Column(name = "description", length = 100)
    private String description;
}


/*
CREATE TABLE `cost_center_status` (
  `statuscc_id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`statuscc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 */
