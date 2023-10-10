package com.kyc.multipolar.kyc.domain;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Customer implements Serializable {
    @Id
    private String id;

    private String nik;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    private LocalDate datOfBirth = LocalDate.now();
}
