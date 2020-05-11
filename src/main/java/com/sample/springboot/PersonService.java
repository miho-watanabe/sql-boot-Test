package com.sample.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonService {
	@Autowired
	  PersonRepository repository;

	  public List<Person> findAll(){
	    return repository.findAll();
	  } 
}
