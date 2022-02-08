package com.bridegblaz.addressbook_spring_boot.service;

import com.bridegblaz.addressbook_spring_boot.dto.AddressBookDTO;
import com.bridegblaz.addressbook_spring_boot.entity.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookServiceImpl implements IAddressBookService{

    /**
     * @return -> it returns the al the data from database
     */
    @Override
    public List<Person> getAdoreeBookData() {
        List<Person> personArrayList  = new ArrayList<>();
        personArrayList.add(new Person(1,new AddressBookDTO("Ashwath Naidu","ashwath.bly@gmail.com","91008622627","Rt Nagar","Bengaluru","Karnataka","560037")));
        return personArrayList;
    }

    /**
     * @param personID
     * @return -> It returns the person data that matches to given person ID
     */
    @Override
    public Person getPersonDataById(int personID) {
        Person personArrayList  = null;
        personArrayList = new Person(2,new AddressBookDTO("Ashwath Naidu","ashwath.bly@gmail.com","91008622627","Rt Nagar","Bengaluru","Karnataka","560037"));
        if (personID==personArrayList.getPersonId()){
            return personArrayList;
        }
        return null;
    }
    /**
     * @param addressBookDTO
     * @return -> It returns creates new person data into the database
     */
    @Override
    public Person createPersonData(AddressBookDTO addressBookDTO) {
        Person person = null;
        person = new Person(1,addressBookDTO);
        return person;
    }
    /**
     * @param addressBookDTO
     * @return -> It returns the updated employee data
     */
    @Override
    public Person updatePersonData(AddressBookDTO addressBookDTO) {
        Person person = null;
        person = new Person(1,addressBookDTO);
        return person;
    }

    /**
     * @pupose -> This method is made to delete person data if person ID is matching, or it returns No data found !!!
     * @param personID
     */
    @Override
    public void deletePersonData(int personID) {
        System.out.println( personID+" No data found !!!");
    }

}
