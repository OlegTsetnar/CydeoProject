package com.sprint.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import com.sprint.enums.Gender;

@Data
@AllArgsConstructor

    public class Mentor {
        private String firstName;
        private String lastName;
        private int age;
        private Gender gender;
    }

