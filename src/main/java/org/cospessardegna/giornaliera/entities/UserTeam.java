package org.cospessardegna.giornaliera.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "user_team")
@IdClass(UserTeamId.class)
public class UserTeam {

    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Id
    @Column(name = "team_id")
    private Integer teamId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id",insertable = false,updatable = false)
    private Team team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",insertable = false,updatable = false)
    private User user;
}



/*
CREATE TABLE `user_team` (
  `user_id` int NOT NULL,
  `team_id` int NOT NULL,
  PRIMARY KEY (`user_id`,`team_id`),
  KEY `user_team_team_fk` (`team_id`),
  KEY `user_team_users_fk` (`user_id`),
  CONSTRAINT `user_team_team_FK` FOREIGN KEY (`team_id`) REFERENCES `team` (`id`),
  CONSTRAINT `user_team_users_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 */