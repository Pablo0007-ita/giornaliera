package org.cospessardegna.Giornaliera.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "customerCostCenter")
@IdClass(CustomerCostCenterId.class)
public class CustomerCostCenter {

    @Id
    @Column(name = "cost_center_id")
    private Integer costCenterId;

    @Id
    @Column(name = "customer_id")
    private Integer customerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "costCenterId",insertable = false, updatable = false)
    private CostCenter costCenter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId", insertable = false,updatable = false)
    private Customer customer;

}

/*
CREATE TABLE `customer_cost_center` (
  `cost_center_id` int NOT NULL,
  `customer_id` int NOT NULL,
  PRIMARY KEY (`cost_center_id`,`customer_id`),
  KEY `customer_cost_center_cost_center_fk` (`cost_center_id`),
  KEY `customer_cost_center_customer_fk` (`customer_id`),
  CONSTRAINT `customer_cost_center_cost_center_fk` FOREIGN KEY (`cost_center_id`) REFERENCES `cost_center` (`cost_id`),
  CONSTRAINT `customer_cost_center_customer_fk` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 */
