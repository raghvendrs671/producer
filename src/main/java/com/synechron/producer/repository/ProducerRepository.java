package com.synechron.producer.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.synechron.producer.entity.User;

public interface ProducerRepository extends JpaRepository<User, Integer>  {
	
	
	

}
