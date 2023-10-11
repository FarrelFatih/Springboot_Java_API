package com.kyc.multipolar.kyc.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

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
    @NotEmpty(message = "NIK is required")
    // @Min(value = 16, message = "NIK must be 16 characters")
    private String nik;
    @NotEmpty(message = "First name is required")
    private String firstName;
    @NotEmpty(message = "Last name is required")
    private String lastName;
    @Email(message = "Email is not valid")
    private String email;
    private String phoneNumber;
    private MembershipStatus membershipStatus;
    private Address address;
    private LocalDate datOfBirth = LocalDate.now();
}
