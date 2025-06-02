package com.healthify.version.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    private LocalDate dateOfBirth;
    private String gender;
    private LocalDateTime createdAt;


    @OneToMany(mappedBy = "userEntity")
    private List<ChatMessageEntity> chatMessageEntities;

    @OneToMany(mappedBy = "userEntity")
    private List<JournalEntryEntity> journalEntryEntities;

    @OneToMany(mappedBy = "userEntity")
    private List<MealLogEntity> mealLogEntities;


    public void setId(Long userId) {
        this.id=userId;
    }
}
