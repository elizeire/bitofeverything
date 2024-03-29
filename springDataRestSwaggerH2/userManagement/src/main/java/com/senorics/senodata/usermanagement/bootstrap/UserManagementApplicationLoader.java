package com.senorics.senodata.usermanagement.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import com.senorics.senodata.usermanagement.domain.Person;
import com.senorics.senodata.usermanagement.repositories.PersonRepository;

@Component
public class UserManagementApplicationLoader implements ApplicationListener<ContextRefreshedEvent> {

    private PersonRepository personRepository;


    @Autowired
    public void setApplicationRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Person person1 = new Person("Jane Doe", "Business Owner");
        Person person2 = new Person("Mary Doe", "Scrum Master");
        Person person3 = new Person("Kate Doe", "Developer");
        Person person4 = new Person("John Doe", "QA Tester");
        Person person5 = new Person("Mark Doe", "Business Analyst");
        personRepository.save(person1);
        personRepository.save(person2);
        personRepository.save(person3);
        personRepository.save(person4);
        personRepository.save(person5);
    }
}
