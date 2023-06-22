package com.example.SpringCrudDemo.controller;

import com.example.SpringCrudDemo.model.Person;
import com.example.SpringCrudDemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PersonController {
    @Autowired
    private PersonService personService;
    @PostMapping("/insert")
    public ResponseEntity<?> insert(@RequestBody Person person){
        return new ResponseEntity<Person>(personService.insertData(person), HttpStatus.CREATED);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getPerson(@PathVariable Integer id){
        return new ResponseEntity<Person>(personService.getPerson(id),HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> deletePersonData(@PathVariable Integer id){
        return new ResponseEntity<String>(personService.deletePerson(id),HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<?> updateData(@RequestBody Person person){
        return  new ResponseEntity<Person>(personService.UpdatePersonData(person),HttpStatus.OK);
    }
    @GetMapping("/allData")
    public ResponseEntity<?> getAllData(){
        return new ResponseEntity<List<Person>>(personService.getAllData(),HttpStatus.OK);
    }
}
