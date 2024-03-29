package com.leonidbog.IceCreamCafe.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
@Data
@AllArgsConstructor
public class IceCream {
    private Long id;
    private String flavour;
    private LocalDate productionDate;
    private String type;
    private String brand;

}
