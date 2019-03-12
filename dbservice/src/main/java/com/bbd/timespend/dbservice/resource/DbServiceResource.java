package com.bbd.timespend.dbservice.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbd.timespend.dbservice.modle.Emp;
import com.bbd.timespend.dbservice.repository.DbRepository;


@RestController
@RequestMapping("/time/dbservice/")
public class DbServiceResource {
	
	@Autowired
	private com.bbd.timespend.dbservice.repository.DbRepository dbRepository;
	
	public DbServiceResource(DbRepository dbRepository) {
		this.dbRepository = dbRepository;
	}
	
	@GetMapping("/start")
	public String sayHello() {
		return "Hello to dbservice";
	}
	
	@PostMapping("/add")
	public List<Emp> addEmp(@RequestBody Emp emp){
		dbRepository.save(emp);
		System.out.println("Emp : "+emp);
		List<Emp> empU = dbRepository.findByUsername(emp.getUsername());
		return empU;
	}
	
	@GetMapping("/{username}")
	public List<Emp> getQuotes(@PathVariable String username){
		List<Emp> emp = dbRepository.findByUsername(username);
		System.out.println("City Name : "+emp);
		return emp;
//				.stream()
//				.map(City::getName)
//				.collect(Collectors.toList());
		
	}

}
