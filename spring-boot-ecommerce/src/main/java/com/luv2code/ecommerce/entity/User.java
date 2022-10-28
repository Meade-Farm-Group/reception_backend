package com.luv2code.ecommerce.entity;



import lombok.Data;


import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Data
@Table(name="reception_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "arrival_time")
    private Timestamp arrival_time;

    @Column(name = "departure_time")
    private Timestamp departure_time;

    @Column(name = "guest_name")
    private String guest_name;

    @Column(name = "guest_company")
    private String guest_company;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "host_employee")
    private String host_employee;

    @Column(name = "area")
    private String area;


}
