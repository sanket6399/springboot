package com.springrest.springrest.services;

import java.util.List;

import com.springrest.srpingrest.entities.Courses;

public interface CourseService {

	public List<Courses> getCourses();
	public Courses getCourse(long courseID);
	public Courses addcourses(Courses course);
	
}
