package com.bridegblaz.addressbook_spring_boot.dto;

import com.bridegblaz.addressbook_spring_boot.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @author -> Ashwath Naidu <ashwath.bly@gmail.com>
 * openjdk version "11.0.12" 2021-07-20
 * OpenJDK Runtime Environment 18.9 (build 11.0.12+7)
 * OpenJDK 64-Bit Server VM 18.9 (build 11.0.12+7, mixed mode)
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AddressBookDTO {
    private String fullName;
    private String emailId;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zipCode;

}
