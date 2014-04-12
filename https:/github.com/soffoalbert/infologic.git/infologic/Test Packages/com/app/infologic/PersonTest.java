package com.app.infologic;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.testng.annotations.Test;

import conf.AppTest;
import static org.junit.Assert.*;
import domain.Person;
import repositories.PersonRepository;


/**
 *
 * @author soffo
 */
public class PersonTest extends AppTest {

    PersonRepository personRepository = null ;
    Person person = new Person();
    static Long id;
    

    @Test
    public void add() {
        personRepository = ctx.getBean(PersonRepository.class);
        person = new Person();
        person.setName("Lungi");
        person.setAge(25);
        person.setAddress("Brackenfell");
        person.setTel("92929292");
        personRepository.save(person);
        id = person.getId();
        assertNotNull(id);
    }
    
    @Test
    public void find() {
        personRepository = ctx.getBean(PersonRepository.class);
        Person personobj = personRepository.findOne(id);
        assertEquals("Lungi", personobj.getName());
    }
    
    @Test
    public void merge() {
        personRepository = ctx.getBean(PersonRepository.class);
        Person personobj = personRepository.findOne(id);
        personobj.setName("soffo");
        personRepository.save(personobj);
        assertEquals("soffo", personobj.getName());
    }

    

    //@Test
    public void delete() {
        personRepository = ctx.getBean(PersonRepository.class);
        Person people = personRepository.findOne(id);
        personRepository.delete(people);
        assertNull(personRepository.findOne(id));
    }

    
}
