package org.cospessardegna.giornaliera.entities;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "activity")
public class Activity {


    @Id
    @Column(name= "id")
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "date_time_start", nullable = false)
    private LocalDateTime dateTimeStart;

    @Column(name = "date_time_end", nullable = false)
    private LocalDateTime dateTimeEnd;

    @Column(name = "type_id")
    private Integer typeId;

    @Column(name = "cost_center_id")
    private Integer costCenterId;



    @Column(name = "read_only")
    private Boolean readOnly;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cost_center_id", insertable=false, updatable=false)
    private CostCenter costCenter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id",  insertable=false, updatable=false)
    private ActivityType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id",  insertable=false, updatable=false)
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