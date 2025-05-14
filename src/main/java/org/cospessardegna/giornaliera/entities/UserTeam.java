package org.cospessardegna.Giornaliera.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "userTeam")
@IdClass(UserTeamId.class)
public class UserTeam {

    @Id
    @Column(name = "userId")
    private Integer userId;

    @Id
    @Column(name = "teamId")
    private Integer teamId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teamId",insertable = false,updatable = false)
    private Team team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId",insertable = false,updatable = false)
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