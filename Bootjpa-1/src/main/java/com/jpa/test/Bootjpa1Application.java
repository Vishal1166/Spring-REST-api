package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.model.User;

@SpringBootApplication
public class Bootjpa1Application {

	public static void main(String[] args) {
		
		
		ApplicationContext context=	SpringApplication.run(Bootjpa1Application.class, args);
			
		   UserRepository userRepository= context.getBean(UserRepository.class);
		
		
//Insert operation 	
   /*		User user=new User();
		user.setId(12);
		user.setName("hotel taj");
		user.setCity("mumbai");
		user.setStatus("service");
		
		User user1=new User();
		user1.setId(13);
		user1.setName("fff");
		user1.setCity("dddddd");
		user1.setStatus("ggggggg");
		
		// for Insert single user
		    /*
		    * User user1= userRepository.save(user);
		    *  System.out.println(user1);
		    */
		
		// for Insert Multiple User
		/*
		 * List<User> users=List.of(user,user1); Iterable<User>
		 * result=userRepository.saveAll(users);
		 * 
		 * result.forEach(user2->{ System.out.println(user2); });
		 */
		

		   
		   
// Update & Select  operation 
		
		/*  // select single user
		 * Optional<User> optional=userRepository.findById(13);
		 * 
		 * User user=optional.get(); System.out.println("user found : - "+user);
		 * 
		 * user.setName("Radhe pg");
		 * 
		 // update Single user
		 * User result= userRepository.save(user);
		 * System.out.println("updated user is : -"+result);
		 */
	

		   
// Display All List from Table	
		
		/*
		 * Iterable<User> result=userRepository.findAll(); // using Labmda Expretions
		 * result.forEach(user->{ System.out.println(user); });
		 * 
		 * // using for each for(User u: result) { System.out.println(u); }
		 */
		

		
// Delete Operation
	
		//delete single user
		  // userRepository.deleteById(13);
		
		
		// delete all from List/table
		   
	     	Iterable<User> list=userRepository.findAll();
		        userRepository.deleteAll(list);
		        System.out.println("All data is deleted...");
	}
}
