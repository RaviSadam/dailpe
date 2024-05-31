package com.dailpe.application.Models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "user")
public class User {
    @SequenceGenerator(
        name="user_id_generator",
        sequenceName = "user_id_generator",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "user_id_generator"
    )
    @Id
    @Column(name = "user_id",unique = true)
    private long userId;

    @Column(name="full_name",nullable = false,length = 50)
    private String fullName;

    @Column(name="mob_num",nullable = false,unique = true,length = 13)
    private String mobileNumber;

    @Column(name="pan_num",nullable = false,unique = true,length = 11)
    private String panNumber;

    @Column(name="manager_id",nullable = true)
    private String managetId;

    @Column(name="created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @Column(name="updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Column(name="is_active")
    private boolean isActive;

}
