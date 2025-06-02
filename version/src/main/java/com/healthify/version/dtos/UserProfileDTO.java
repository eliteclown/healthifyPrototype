package com.healthify.version.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserProfileDTO {
    private Long userId;
    private String gender;
    private LocalDate dateOfBirth;
    private BigDecimal height;
    private BigDecimal weight;

}
