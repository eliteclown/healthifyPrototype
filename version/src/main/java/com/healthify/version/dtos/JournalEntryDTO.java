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
public class JournalEntryDTO {
    private Long id;
    private Long userId;
    private LocalDateTime entryDate;
    private String content;

}
