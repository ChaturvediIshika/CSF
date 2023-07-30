package com.demo.springboot.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Flight {
    private String name;
    private String src;
    private String des;
    private String arrival;
    private String departure;
}
