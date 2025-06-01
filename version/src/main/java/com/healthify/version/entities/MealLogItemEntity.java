package com.healthify.version.entities;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "mealLogs")
public class MealLogItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "mealLogId")
    @ManyToOne
    private MealLogEntity mealLogEntity;

    @JoinColumn(name = "foodItemId")
    @ManyToOne
    private FoodItemEntity foodItemEntity;

    private Long quantity;
}
