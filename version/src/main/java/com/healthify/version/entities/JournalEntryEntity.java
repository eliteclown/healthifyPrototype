package com.healthify.version.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "journals")
public class JournalEntryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JoinColumn(name = "userId")
    @ManyToOne
    private UserEntity userEntity;
    private LocalDateTime entryDate;
    private String content;
}
