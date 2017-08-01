package com.ssh.service.impl;

import com.ssh.entity.Person;
import com.ssh.repository.PersonRepository;
import com.ssh.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ykue on 2017/6/28.
 */
@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    public Long savePerson() {
        Person person = new Person();
        person.setUsername("gengyue");
        person.setAddr("adde");
        person.setPhone("15645634168");
        person.setRemark("this is Xdog");
        return personRepository.save(person);
    }
}
