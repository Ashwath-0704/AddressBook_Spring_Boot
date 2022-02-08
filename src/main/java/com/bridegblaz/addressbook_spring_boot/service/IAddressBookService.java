package com.bridegblaz.addressbook_spring_boot.service;

import com.bridegblaz.addressbook_spring_boot.dto.AddressBookDTO;
import com.bridegblaz.addressbook_spring_boot.entity.Person;
import java.util.List;
/**
 * @author -> Ashwath Naidu <ashwath.bly@gmail.com>
 * openjdk version "11.0.12" 2021-07-20
 * OpenJDK Runtime Environment 18.9 (build 11.0.12+7)
 * OpenJDK 64-Bit Server VM 18.9 (build 11.0.12+7, mixed mode)
 */
public interface IAddressBookService {
    List<Person> getAdoreeBookData();
    Person getPersonDataById(int personID);
    Person createPersonData(AddressBookDTO addressBookDTO);
    Person updatePersonData(AddressBookDTO addressBookDTO);
    void deletePersonData(int personID);
}