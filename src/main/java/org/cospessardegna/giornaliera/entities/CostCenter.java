package org.cospessardegna.Giornaliera.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "costCenter")
public class CostCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "costId")
    private Integer costId;

    @Column(name = "costCenterName",length = 100, nullable = false)
    private String costCenterName;

    @Column(name = "description",length = 100)
    private String description;

    @Column(name = "statusId", nullable = false)
    private Integer statusId;

    @Column(name = "maxHours")
    private Integer maxHours;

    @Column(name = "maxBudg")
    private Float maxBudg;

    @Column(name = "expirationDate")
    private Date expirationDate;

    @Column(name = "creationDate")
    private Date creationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statusId",nullable = false)
    private CostCenterStatus status;


}

/*
CREATE TABLE `cost_center` (
  `cost_id` int NOT NULL AUTO_INCREMENT,
  `cost_center_name` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `desc` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `status_id` int NOT NULL,
  `max_hours` int DEFAULT NULL,
  `max_budg` float DEFAULT NULL,
  `expiration_date` date DEFAULT NULL,
  `creation_date` date DEFAULT NULL,
  PRIMARY KEY (`cost_id`),
  KEY `cost_center_cost_center_status_fk` (`status_id`),
  CONSTRAINT `cost_center_cost_center_status_fk` FOREIGN KEY (`status_id`) REFERENCES `cost_center_status` (`statuscc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 */
