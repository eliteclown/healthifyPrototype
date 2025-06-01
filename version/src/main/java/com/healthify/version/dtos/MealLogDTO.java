package com.healthify.version.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MealLogDTO {
    private Long id;
    private Long userId;
    private LocalDateTime dateTime;
    private String mealType;
    private String notes;
}
