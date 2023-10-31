package com.jpa.api.service;

import java.util.List;

import com.jpa.api.model.Course;

public interface ServiceInterface {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public String deleteCourse(long courseId);

}
