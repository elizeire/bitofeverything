package com.senorics.senodata.usermanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senorics.senodata.usermanagement.domain.Person;
import io.swagger.annotations.Api;

@Api
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
