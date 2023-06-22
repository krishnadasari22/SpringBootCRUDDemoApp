package com.example.SpringCrudDemo.service;

import com.example.SpringCrudDemo.model.Person;

import java.util.List;

public interface PersonService {
    public Person insertData(Person person);
    public Person getPerson(Integer id);
    public List<Person> getAllData();
    public String deletePerson(Integer id);
    public Person UpdatePersonData(Person person);
}
