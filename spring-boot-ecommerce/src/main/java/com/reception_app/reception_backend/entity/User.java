package com.reception_app.reception_backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String arrival_time;
    private String departure_time;
    private String name;
    private String guest_company;
    private String phone_number;
    private String host_employee;
    private String area;

}
