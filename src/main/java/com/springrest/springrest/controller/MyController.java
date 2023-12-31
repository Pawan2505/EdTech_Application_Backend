package com.springrest.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.entities.Login;
import com.springrest.springrest.services.CourseService;
import com.springrest.springrest.services.LoginService;

@CrossOrigin
@RestController
public class MyController {
	
	@Autowired
	private CourseService courseSerivice;
	@Autowired
	private LoginService loginSerivice;

	@GetMapping("/home")
	public String home() {
		return "Welcome to course application";
	}
	
	//get the courses
	
	@GetMapping("/courses")
	public List<Course> getCourse(){
		
		return this.courseSerivice.getCourses();		
	}
	
	
	//Single course get
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseSerivice.getCourse(Long.parseLong(courseId));
	}
	
	//Course add
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseSerivice.addCourse(course);
	}
	
	//Update course using PUT request
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseSerivice.updateCourse(course);
	}
	
	//Delete the Course
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
		try {
			this.courseSerivice.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@PostMapping("/login")
	public Login addLogin(@RequestBody Login login) {
		return this.loginSerivice.addLogin(login);
	}
	
	 @GetMapping("/login/{name}")
	    public Login getLogin(@PathVariable String name) {
	        return loginSerivice.getLogin(name);
	    }
	 
	 
	

	

	
	
	
	
	
	
	
	
	
	
}
