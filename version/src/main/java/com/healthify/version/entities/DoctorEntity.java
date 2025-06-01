package com.healthify.version.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "doctors")
public class DoctorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String specialization;
    private String email;
    private String availiableStatus;

    @OneToMany(mappedBy = "doctorEntity")
    private List<ChatMessageEntity> chatMessageEntities;
}
