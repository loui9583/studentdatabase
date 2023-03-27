package com.example.studentdatabase.service;

import com.example.studentdatabase.model.Person;
import com.example.studentdatabase.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {
    @Autowired
    PersonRepo personRepo;
    @Autowired
    JdbcTemplate template;

        public List<Person> fetchAll() {
            //Her skal vores sql kode stå
            return personRepo.fetchAll();
        }
        public void addPerson(Person person) {
            personRepo.addPerson(person);
        }
        public Boolean deletePerson(int id) {
            return null;
        }
        public Person findPersonById(int id) {
            return null;
        }
        public void updatePerson(int id, Person person) {

        }
    }

