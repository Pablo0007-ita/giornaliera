package org.cospessardegna.Giornaliera.entities;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "activity")
public class Activity {


    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "descriptiom", nullable = false, length = 500)
    private String description;

    @Column(name = "dateTimeStart", nullable = false)
    private LocalDateTime dateTimeStart;

    @Column(name = "dateTimeEnd", nullable = false)
    private LocalDateTime dateTimeEnd;

    @Column(name = "typeId")
    private Integer typeId;

    @Column(name = "costCenterId")
    private Integer costCenterId;



    @Column(name = "readOnly")
    private Boolean readOnly;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "costCenterId", nullable = false)
    private CostCenter costCenter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "typeId", nullable = false)
    private ActivityType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statusId", nullable = false)
    private ActivityStatus status;
}


/*
CREATE TABLE `activity` (
        `id` int NOT NULL AUTO_INCREMENT,
  `desc` varchar(500) COLLATE utf8mb4_general_ci NOT NULL,
  `type_id` int NOT NULL,
        `date_time_start` datetime NOT NULL,
        `date_time_end` datetime NOT NULL,
        `status_id` int NOT NULL,
        `read_only` binary(1) DEFAULT '0',
        `cost_center_id` int DEFAULT NULL,
PRIMARY KEY (`id`),
KEY `activity_activity_status_fk` (`status_id`),
KEY `activity_activity_type_fk` (`type_id`),
KEY `activity_cost_center_fk` (`cost_center_id`),
CONSTRAINT `activity_activity_status_fk` FOREIGN KEY (`status_id`) REFERENCES `activity_status` (`statid`),
CONSTRAINT `activity_activity_type_fk` FOREIGN KEY (`type_id`) REFERENCES `activity_type` (`act_id`),
CONSTRAINT `activity_cost_center_fk` FOREIGN KEY (`cost_center_id`) REFERENCES `cost_center` (`cost_id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

 */