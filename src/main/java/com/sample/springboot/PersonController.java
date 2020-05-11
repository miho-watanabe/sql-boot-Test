package com.sample.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	  PersonService service;
	  @RequestMapping(value="/",method=RequestMethod.GET)
	  public List<Person> index(){
			 return service.findAll();
	  }
}
