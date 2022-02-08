package com.bridegblaz.addressbook_spring_boot.entity;

import com.bridegblaz.addressbook_spring_boot.dto.AddressBookDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * @author -> Ashwath Naidu <ashwath.bly@gmail.com>
 * openjdk version "11.0.12" 2021-07-20
 * OpenJDK Runtime Environment 18.9 (build 11.0.12+7)
 * OpenJDK 64-Bit Server VM 18.9 (build 11.0.12+7, mixed mode)
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private long personId;
    private String fullName;
    private String emailId;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zipCode;

    public Person(long personId, AddressBookDTO addressBookDTO){
        this.personId=personId;
        this.fullName=addressBookDTO.getFullName();
        this.emailId=addressBookDTO.getEmailId();
        this.phoneNumber=addressBookDTO.getPhoneNumber();
        this.address=addressBookDTO.getAddress();
        this.city=addressBookDTO.getCity();
        this.state=addressBookDTO.getState();
        this.zipCode=addressBookDTO.getZipCode();
    }
}
