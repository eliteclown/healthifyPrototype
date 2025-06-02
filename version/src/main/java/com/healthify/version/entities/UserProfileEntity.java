package com.healthify.version.entities;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "profiles")
public class UserProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "userId")
    @OneToOne
    private UserEntity userEntity;
    private String gender;
    private LocalDate dateOfBirth;
    private Long age;

    private BigDecimal height;
    private BigDecimal weight;

    private BigDecimal bmi;

    public void setId(Long userId) {
        this.id= userId;
    }
}
