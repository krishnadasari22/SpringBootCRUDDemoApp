package com.example.SpringCrudDemo.serviceImpl;

import com.example.SpringCrudDemo.model.Person;
import com.example.SpringCrudDemo.repo.PersonRepository;
import com.example.SpringCrudDemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Override
    public Person insertData(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person getPerson(Integer id) {
        return personRepository.findById(id).get();
    }

    @Override
    public List<Person> getAllData() {
        return personRepository.findAll();
    }

    @Override
    public String deletePerson(Integer id) {
         personRepository.deleteById(id);
        return "Person Deleted";
    }

    @Override
    public Person UpdatePersonData(Person person) {
        return personRepository.save(person);
    }
}
