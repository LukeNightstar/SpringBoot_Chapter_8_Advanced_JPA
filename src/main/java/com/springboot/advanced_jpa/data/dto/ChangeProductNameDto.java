package com.springboot.advanced_jpa.data.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChangeProductNameDto {
    private Long number;
    private String name;
}
