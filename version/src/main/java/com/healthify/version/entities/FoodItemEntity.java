package com.healthify.version.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "foodItems")
public class FoodItemEntity {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private BigDecimal calories;
    private BigDecimal protein;
    private BigDecimal carbs ;
    private BigDecimal fats;
    private String category;

    @OneToMany(mappedBy = "foodItemEntity")
    private List<MealLogItemEntity> mealLogItemEntities;
}
