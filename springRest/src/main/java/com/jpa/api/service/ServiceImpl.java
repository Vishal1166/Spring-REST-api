package com.jpa.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.api.dao.UserRepository;
import com.jpa.api.model.Course;

@Service
public class ServiceImpl  implements ServiceInterface{

	@Autowired
	 private UserRepository userRepository;
	
	
	public ServiceImpl() {	
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return (List<Course>) userRepository.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		Course course=null;
	
		Optional<Course> optional=userRepository.findById(courseId);
		course=optional.get();	
		
		return course;
	}

	@Override
	public Course addCourse(Course course) {
		
		return userRepository.save(course);
	}
	
	@Override
	public Course updateCourse(Course course) {
	
		return userRepository.save(course);
	}

	@Override
	public String deleteCourse(long courseId) {
		
  
		userRepository.deleteById(courseId);
				
		return "data delete succesfull...";
	}
	
	

}
