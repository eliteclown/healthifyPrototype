package com.healthify.version.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "meals")
public class MealLogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "userId")
    @ManyToOne
    private UserEntity userEntity;

    private LocalDateTime dateTime;
    private String mealType;
    private String notes;

    @OneToMany(mappedBy = "mealLogEntity")
    private List<MealLogItemEntity> mealLogItemEntities;
}
