package com.afrias.ceshopcourses.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.afrias.ceshopcourses.models.Course;
import com.afrias.ceshopcourses.models.Progress;
import com.afrias.ceshopcourses.models.Student;
import com.afrias.ceshopcourses.repository.IProgressRepository;
import com.afrias.ceshopcourses.services.IProgressService;

@Service
public class ProgressService implements IProgressService{
	
	@Autowired
	private IProgressRepository progressRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Progress> findByStudentId(Long studentId) {
		return progressRepository.findByStudentId(studentId);
	}

	@Override
	@Transactional(readOnly = true)
	public Progress findByStudentIdAndCourseId(Long studentId, Long courseId) {	
		return progressRepository.findByStudentIdAndCourseId(studentId, courseId);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Student> findAllStudents() {
		return progressRepository.findAllStudents();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Course> findAllCourses() {
		return progressRepository.findAllCourses();
	}


}
