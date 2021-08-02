package com.trasportManagement.transportservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Package {

    private int id;
    private String name;
    private String transportMode;
    private String subscriptionType;
    private int counts;
    private int validity;
    private int balance;
    private int price;
}
