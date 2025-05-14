package org.cospessardegna.Giornaliera.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "entityid",nullable = false)
    private Integer entityId;

    @Column(name = "entitytypeid", nullable = false)
    private Integer entityTypeId;

    @Column(name = "userId",nullable = false)
    private Integer userId;

    @Column(name = "description")
    private String description;

    @Column(name = "createdAt",nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "entityTypeid",insertable = false, updatable = false)
    private ApplicationEntity entityType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", insertable = false,updatable = false)
    private User user;


}


/*
CREATE TABLE `note` (
        `id` int NOT NULL AUTO_INCREMENT,
  `entity_id` int NOT NULL,
        `entity_type_id` int NOT NULL,
        `description` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `user_id` int NOT NULL,
        `created_at` datetime NOT NULL,
PRIMARY KEY (`id`),
KEY `tbl_note_tbl_entity_type_FK` (`entity_type_id`),
KEY `note_user_FK` (`user_id`),
CONSTRAINT `note_app_entity_FK` FOREIGN KEY (`entity_type_id`) REFERENCES `app_entity` (`app_id`),
CONSTRAINT `note_user_FK` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
*/