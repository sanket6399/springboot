package com.springrest.srpingrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.srpingrest.entities.Courses;
import com.springrest.springrest.services.CourseService;
import java.util.List;

@ComponentScan("com")
@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {
		
		return "Welcome to courses application";
	}
	
	// get the courses
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		
		return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseID}")
	public Courses getCourse(@PathVariable String courseID) {
		
		return this.courseService.getCourse(Long.parseLong(courseID));
	}
	
	@PostMapping("/courses")
	public Courses addCourses(@RequestBody Courses course) {
		
		return this.courseService.addcourses(course);
	}
}
