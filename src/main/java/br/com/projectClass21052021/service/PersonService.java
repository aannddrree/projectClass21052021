package br.com.projectClass21052021.service;

import br.com.projectClass21052021.model.Person;
import br.com.projectClass21052021.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public void save(Person person){
        personRepository.save(person);
    }

    public Person findById(String id){
        return personRepository.findById(id).get();
    }
}
