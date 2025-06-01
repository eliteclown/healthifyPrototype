package com.healthify.version.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MealLogItemDTO {
    private Long id;
    private Long mealLogId;
    private Long foodItem;
    private Long quantity;
}
