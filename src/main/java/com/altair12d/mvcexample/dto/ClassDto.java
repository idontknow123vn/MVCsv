package com.altair12d.mvcexample.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClassDto {
    private Long id;
    private String name;

    public ClassDto() {
    }

    public ClassDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
