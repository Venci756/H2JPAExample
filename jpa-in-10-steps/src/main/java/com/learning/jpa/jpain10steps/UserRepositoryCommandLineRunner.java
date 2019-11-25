package com.learning.jpa.jpain10steps;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.jpa.jpain10steps.entity.User;
import com.learning.jpa.jpain10steps.service.IUserRepository;
import com.learning.jpa.jpain10steps.service.UserDAOService;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	private static final Logger log = 
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	IUserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("Jill","Admin");
		repository.save(user);
		log.info("New user is created: " + user);
		
		Optional<User> userWithIdOne = repository.findById((long) 1);
		log.info("User with ID:1 is : " + userWithIdOne);
		
		List<User> users = repository.findAll();
		log.info(users.toString());
		
	}
	
}
