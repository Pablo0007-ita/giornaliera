package org.cospessardegna.giornaliera.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "cost_center")
public class CostCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name",length = 100,nullable = false)
    private String costCenterName;

    @Column(name = "description",length = 100)
    private String description;

    @Column(name = "status_id", nullable = false)
    private Integer statusId;

    @Column(name = "max_hours")
    private Integer maxHours;

    @Column(name = "max_budget")
    private Float maxBudget;

    @Column(name = "expiration_date")
    private Date expirationDate;

    @Column(name = "creation_date")
    private Date creationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id",insertable=false, updatable=false)
    private CostCenterStatus status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCostCenterName() {
        return costCenterName;
    }

    public void setCostCenterName(String costCenterName) {
        this.costCenterName = costCenterName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getMaxHours() {
        return maxHours;
    }

    public void setMaxHours(Integer maxHours) {
        this.maxHours = maxHours;
    }

    public Float getMaxBudget() {
        return maxBudget;
    }

    public void setMaxBudget(Float maxBudget) {
        this.maxBudget = maxBudget;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public CostCenterStatus getStatus() {
        return status;
    }

    public void setStatus(CostCenterStatus status) {
        this.status = status;
    }
}

/*
-- giornaliera.cost_center definition

CREATE TABLE `cost_center` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cost_center_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `description` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `status_id` int NOT NULL,
  `max_hours` int DEFAULT NULL,
  `max_budg` float DEFAULT NULL,
  `expiration_date` date DEFAULT NULL,
  `creation_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cost_center_cost_center_status_fk` (`status_id`),
  CONSTRAINT `cost_center_cost_center_status_fk` FOREIGN KEY (`status_id`) REFERENCES `cost_center_status` (`statuscc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 */
