package com.csv.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Data
@Setter
@Getter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String firstName;
    private String lastName;
    private String fathersName;
    private String mothersName;
    private String dob;
    private String nid;
    private String mobileNo;
    private String address;

}
