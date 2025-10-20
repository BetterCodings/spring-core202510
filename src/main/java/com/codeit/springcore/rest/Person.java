package com.codeit.springcore.rest;

import lombok.*;

import java.util.List;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Person {

    private String name;
    private int age;
    private List<String> hobbies;
}
