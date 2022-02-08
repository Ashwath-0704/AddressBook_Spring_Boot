package com.bridegblaz.addressbook_spring_boot.controller;

import com.bridegblaz.addressbook_spring_boot.dto.AddressBookDTO;
import com.bridegblaz.addressbook_spring_boot.dto.ResponseDTO;
import com.bridegblaz.addressbook_spring_boot.entity.Person;
import com.bridegblaz.addressbook_spring_boot.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author -> Ashwath Naidu <ashwath.bly@gmail.com>
 * openjdk version "11.0.12" 2021-07-20
 * OpenJDK Runtime Environment 18.9 (build 11.0.12+7)
 * OpenJDK 64-Bit Server VM 18.9 (build 11.0.12+7, mixed mode)
 *
 * -----------------------------------------------------------------------------------------------------------------------------
 *
 * @purpose -> UC2: Create a Rest Controller to demonstrate the various HTTP Methods
 *                  - Before starting set application.properties to set properties of MySQL Driver and MySQL Credentials
 *                  - Use ResponseEntity to return JSON Response
 *                  - Test the REST Calls using CURL.
 *                  - At this stage the interest is to establish the connectivity and ensure data is transmitted in REST Calls
 *                  - Make sure to test all CURL Calls – GET, GET by ID, POST, PUT to Update by ID, and DELETE
 */
@RestController
@RequestMapping("/person")
public class AddressBookController {

    @Autowired
    IAddressBookService iAddressBookService;

    /**
     * @return -> it returns the all the data from database
     */
    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<ResponseDTO> getAdoreeBookData(){
        List<Person> personList =null;
        personList = iAddressBookService.getAdoreeBookData();
        ResponseDTO getting_call_successfully = new ResponseDTO("Getting call successfully", personList);
        return new ResponseEntity<ResponseDTO>(getting_call_successfully, HttpStatus.OK);
    }

    /**
     * @param personId
     * @return -> It returns the person data that matches to given person ID
     */
    @GetMapping(value = {"/get/{personId}"})
    public ResponseEntity<ResponseDTO> getPersonDataByID(@PathVariable int personId){
        Person person =null;
        person = iAddressBookService.getPersonDataById(personId);
        ResponseDTO responseDTO = new ResponseDTO("Get call for ID successfully",person);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /**
     * @param addressBookDTO
     * @return -> It returns creates new person data into the database
     */
    @PostMapping(value = {"/create"})
    public ResponseEntity<ResponseDTO> createPersonData(@RequestParam AddressBookDTO addressBookDTO){
        Person person =null;
        person = iAddressBookService.createPersonData(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("created person data successfully",person);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /**
     * @param addressBookDTO
     * @return -> It returns the updated person data
     */
    @PutMapping(value = {"/update"})
    public ResponseEntity<ResponseDTO> updatePersonData(@RequestParam AddressBookDTO addressBookDTO){
        Person person =null;
        person = iAddressBookService.updatePersonData(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("update employee payroll data successfully",person);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /**
     * @param personId
     * @return -> It returns the deleted person ID number
     */
    @DeleteMapping(value = {"/delete/{personId}"})
    public ResponseEntity<ResponseDTO> deletePersonDataByID(@PathVariable int personId){
        iAddressBookService.deletePersonData(personId);
        ResponseDTO responseDTO = new ResponseDTO("update employee payroll data successfully", "Deleted ID is"+personId);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
