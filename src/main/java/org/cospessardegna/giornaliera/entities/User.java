package org.cospessardegna.giornaliera.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "firstName",length = 100)
    private String fisrtname;

    @Column(name = "lastName",length = 100)
    private String lastname;

    @Column(name = "fiscalCode",length = 100)
    private String fiscalCode;

    @Column(name = "emailAddress",length = 100, nullable = false)
    private String emailAddress;

    @Column(name = "phoneNumber",length = 20)
    private String phoneNumber;

    @Column(name = "roleId")
    private Integer role_id;

    @Column(name = "status", nullable = false)
    private boolean status;

    @Column(name = "privacyConsent")
    private boolean privacyConsent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleId",insertable = false, updatable = false)
    private Role role;



}



/*
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `last_name` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `fiscal_code` varchar(16) COLLATE utf8mb4_general_ci NOT NULL,
  `email_address` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `phone_number` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `role_id` int DEFAULT NULL,
  `status` binary(1) NOT NULL DEFAULT '0',
  `privacy_consent` binary(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `users_roles_FK` (`role_id`),
  CONSTRAINT `users_roles_FK` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
 */