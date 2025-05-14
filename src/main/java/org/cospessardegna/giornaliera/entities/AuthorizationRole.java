package org.cospessardegna.giornaliera.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "authorizationRole")
@IdClass(AuthorizationRoleid.class)
public class AuthorizationRole {

    @Id
    @Column(name = "roleId")
    private Integer id;

    @Id
    @Column(name = "app_entityId", nullable = false)
    private int appEntityId;

    @Id
    @Column(name = "app_entityId", nullable = false)
    private Integer permissionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleId", insertable=false, updatable=false)
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "permissionId", insertable=false, updatable=false)
    private Permission permission;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_entityId", insertable=false, updatable=false)
    private ApplicationEntity appEntity;
}

/*
CREATE TABLE `authorization_role` (
  `role_id` int NOT NULL,
  `app_entity_id` int NOT NULL,
  `permission_id` int NOT NULL,
  PRIMARY KEY (`role_id`,`app_entity_id`,`permission_id`),
  KEY `authorization_role_permission_FK` (`permission_id`),
  KEY `authorization_role_app_entity_FK` (`app_entity_id`),
  CONSTRAINT `authorization_role_app_entity_FK` FOREIGN KEY (`app_entity_id`) REFERENCES `app_entity` (`app_id`),
  CONSTRAINT `authorization_role_permission_FK` FOREIGN KEY (`permission_id`) REFERENCES `permission` (`id`),
  CONSTRAINT `authorization_role_roles_FK` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 */
