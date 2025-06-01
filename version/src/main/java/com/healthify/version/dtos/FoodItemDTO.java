package com.healthify.version.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FoodItemDTO {
    private Long id;
    private String name;
    private BigDecimal calories;
    private BigDecimal protein;
    private BigDecimal carbs ;
    private BigDecimal fats;
    private String category;

}
