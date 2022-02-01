package com.spring.mongo.demo.model;


import com.spring.mongo.demo.component.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer implements Serializable {

    @Id
    private String id;

    private String firstName;
    private String surname;
    private String nationalId;
    private String email;
    private String title;
    private String phone;
    private String branch;
    private Boolean homeOwner;
    private String username;
    private String creationDate;
    private Gender gender;

}
