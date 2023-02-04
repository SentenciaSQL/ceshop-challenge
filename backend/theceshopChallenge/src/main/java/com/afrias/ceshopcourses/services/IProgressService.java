package com.afrias.ceshopcourses.services;

import java.util.List;

import com.afrias.ceshopcourses.models.Course;
import com.afrias.ceshopcourses.models.Progress;
import com.afrias.ceshopcourses.models.Student;

public interface IProgressService {
	
	public List<Progress> findByStudentId(Long studentId);
	
	public Progress findByStudentIdAndCourseId(Long studentId, Long courseId);
	
	public List<Student> findAllStudents();
	
	public List<Course> findAllCourses();
	
}
