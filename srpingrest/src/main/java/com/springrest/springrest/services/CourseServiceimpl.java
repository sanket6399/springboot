package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.srpingrest.entities.Courses;

@Service
public class CourseServiceimpl implements CourseService {
	
	List<Courses> list;
	public CourseServiceimpl() {
		
		list = new ArrayList<>();
		list.add(new Courses(145, "Java Core Course", "Java course from basics"));
		list.add(new Courses(4345, "Spring boot Course", "Spring course from basics"));
	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	
	@Override
	public Courses getCourse(long courseID) {
		
		Courses c = null;
		for(Courses co: list) {
			
			if (co.getId() == courseID) {
				c = co;
				break;
			}
		}
		return c;
	}

	@Override
	public Courses addcourses(Courses course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

}
