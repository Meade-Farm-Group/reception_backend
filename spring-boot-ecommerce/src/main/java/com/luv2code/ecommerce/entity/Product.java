package com.luv2code.ecommerce.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;



@Entity
@Data
@Table(name="reception_table")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "arrival_time")
    private String arrival_time;

    @Column(name = "departure_time")
    private String departure_time;

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

    @Column(name = "signed_out")
    private Boolean signed_out;

}
