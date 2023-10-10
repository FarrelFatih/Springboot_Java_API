package com.kyc.multipolar.kyc.domain;

import java.io.Serializable;
import java.util.List;

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
public class Address implements Serializable {
    private String street;
    private String city;
    private String postalCode;
    private String country;
    private MembershipStatus membershipStatus;
    private List<String> tags;
}
