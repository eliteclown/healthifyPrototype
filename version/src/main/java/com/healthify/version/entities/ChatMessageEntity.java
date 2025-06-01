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
@Table(name = "chats")
public class ChatMessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "senderId")
    @ManyToOne
    private UserEntity userEntity;

    @JoinColumn(name = "recieverId")
    @ManyToOne
    private DoctorEntity doctorEntity;

    private LocalDateTime timestamp;
    private String message;
}
