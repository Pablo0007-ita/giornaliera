package org.cospessardegna.giornaliera.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "cost_center_team")
@IdClass(CostCenterTeamId.class)
public class CostCenterTeam {

    @Id
    @Column(name = "cost_center_id")
    private Integer costCenterId;

    @Id
    @Column(name = "team_id")
    private Integer teamId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", insertable = false, updatable = false)
    private Team team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cost_center_id", insertable = false, updatable = false)
    private  CostCenter costCenter;

}
/*
CREATE TABLE `cost_center_team` (
  `cost_center_id` int NOT NULL,
  `team_id` int NOT NULL,
  PRIMARY KEY (`cost_center_id`,`team_id`),
  KEY `cost_team_cost_center_fk` (`cost_center_id`),
  KEY `cost_team_team_fk` (`team_id`),
  CONSTRAINT `cost_center_team_team_FK` FOREIGN KEY (`team_id`) REFERENCES `team` (`id`),
  CONSTRAINT `cost_team_cost_center_fk` FOREIGN KEY (`cost_center_id`) REFERENCES `cost_center` (`cost_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 */
