package org.cospessardegna.giornaliera.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "shift_user")
@IdClass(ShiftUserId.class)
public class ShiftUser {

    @Id
    @Column(name = "shift_id")
    private Integer shiftId;

    @Id
    @Column(name = "user_id")
    private Integer userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shift_id",insertable=false, updatable=false)
    private Shift shift;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",insertable=false, updatable=false)
    private User user;

}



/*
CREATE TABLE `shift_user` (
  `shift_id` int NOT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`shift_id`,`user_id`),
  KEY `shift_user_users_fk` (`user_id`),
  CONSTRAINT `shift_user_shift_fk` FOREIGN KEY (`shift_id`) REFERENCES `shift` (`id`),
  CONSTRAINT `shift_user_users_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 */