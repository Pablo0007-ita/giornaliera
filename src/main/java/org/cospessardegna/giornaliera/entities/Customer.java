package org.cospessardegna.Giornaliera.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "categoryId")
    private Integer categoryId;

    @Column(name = "businessName",length = 100)
    private String businessName;

    @Column(name = "fiscalCode", length = 16)
    private String fiscalCode;

    @Column(name = "vatCode", length = 20)
    private String vatCode;

    @Column(name = "status")
    private boolean status; //TODO controllare se va bene gestire uno stato in booleano

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId", insertable = false, updatable = false)
    private CustomerCategory category;
}



/*
CREATE TABLE `customer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `category_id` int DEFAULT NULL,
  `business_name` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `fiscal_code` varchar(16) COLLATE utf8mb4_general_ci NOT NULL,
  `vat_code` varchar(20) COLLATE utf8mb4_general_ci,
  `status` binary(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `customer_customer_category_fk` (`category_id`),
  CONSTRAINT `customer_customer_category_fk` FOREIGN KEY (`category_id`) REFERENCES `customer_category` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 */