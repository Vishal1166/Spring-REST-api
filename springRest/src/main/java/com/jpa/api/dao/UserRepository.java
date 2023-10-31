package com.jpa.api.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jpa.api.model.Course;

public interface UserRepository extends JpaRepository<Course,Long> {

}
