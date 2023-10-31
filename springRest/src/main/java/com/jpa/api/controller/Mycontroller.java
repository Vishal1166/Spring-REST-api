package com.jpa.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.api.model.Course;
import com.jpa.api.service.ServiceInterface;

@RestController
public class Mycontroller {
    
	@Autowired
	public ServiceInterface serviceInterface;
		
	
// Get All Course List 	
	@GetMapping("/Courses")
	public List<Course> getCourses() {
		
		return this.serviceInterface.getCourses();
	}

	
// get Single data
	@GetMapping("/Courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		
		return this.serviceInterface.getCourse(Long.parseLong(courseId));
	}	
	
// Insert data	
	@PostMapping("/Courses")
	public Course addCourse(@RequestBody Course course) {
		
		return this.serviceInterface.addCourse(course);
	}
	
// update data	
		@PutMapping("/Courses")
		public Course updateCourse(@RequestBody Course course) {
			
			return this.serviceInterface.updateCourse(course);
		}
		
		
// Delete data
		@DeleteMapping("/Courses/{courseId}")
		public String deleteCourse(@PathVariable String courseId) {
			
			String a=this.serviceInterface.deleteCourse(Long.parseLong(courseId));
			return a;
		}
	
}
