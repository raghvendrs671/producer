package com.synechron.producer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.synechron.producer.entity.User;
import com.synechron.producer.repository.ProducerRepository;

@RestController
@RequestMapping("/api")
public class ProducerController {
	
	
	
	@Autowired
	private ProducerRepository repository;
	
	@PostMapping("/add")
	public User add(@RequestBody User user) {
		
		return repository.save(user);
	}
	
	@PutMapping("/update")
	public User update(@RequestBody User user) {
		
		return repository.save(user);
		
	}
	
	@GetMapping("/get")
	public List<User> getProducer() {
		
		return repository.findAll();
		
	}
	
	@DeleteMapping("/remove")
	public void remove(@RequestParam("id") Integer id) {
		
		repository.deleteById(id);
		
	}

}
