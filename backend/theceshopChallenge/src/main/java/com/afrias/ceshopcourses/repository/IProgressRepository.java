package com.afrias.ceshopcourses.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.afrias.ceshopcourses.models.Course;
import com.afrias.ceshopcourses.models.Progress;
import com.afrias.ceshopcourses.models.Student;

public interface IProgressRepository extends JpaRepository<Progress, Long>{
	
	public List<Progress> findByStudentId(Long studentId);
	
	public Progress findByStudentIdAndCourseId(Long studentId, Long courseId);
	
	@Query("select s from Student s")
	public List<Student> findAllStudents();
	
	@Query("select c from Course c")
	public List<Course> findAllCourses();
	
}
