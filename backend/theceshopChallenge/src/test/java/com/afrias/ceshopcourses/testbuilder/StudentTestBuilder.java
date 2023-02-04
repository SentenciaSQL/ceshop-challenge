package com.afrias.ceshopcourses.testbuilder;

import com.afrias.ceshopcourses.models.Student;

import lombok.Builder;

public class StudentTestBuilder {
	@Builder
	public static Student student(Long id, String firstName, String lastName) {
		Student student = new Student();
		student.setId(id);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		
		return student;
	}
	
	public static class StudentBuilder {
		private long id = 1L;
		private String firstName = "Andres";
		private String lastName = "Frias";
	}

}
