package com.booking.bookingrestaurantapi.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="restaurants")
@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String image;
}
