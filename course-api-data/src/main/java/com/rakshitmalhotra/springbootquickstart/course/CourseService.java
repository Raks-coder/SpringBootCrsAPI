package com.rakshitmalhotra.springbootquickstart.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	
	public List<Course> getAllCourses(String topicId)
	{
		//return topics;
		List<Course>courseList=new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courseList::add);
		return courseList;
	}
	
	public Course getCourse(String id)
	{

		//Lambda way
		
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
		return courseRepository.findById(id).orElse(null);
	}
	
	public void addCourse(Course course)
	{
		courseRepository.save(course);
	}
	
	public void updateCourse(Course course)
	{
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(id);
	}
	
}
