package com.afrias.ceshopcourses.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "progress")
public class Progress implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "completed_questions")
	private Integer completedQuestions;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;
	
	
	public Progress() {}
	
	public Progress(Integer completedQuestions, Course course) {
		this.completedQuestions = completedQuestions;
		this.course = course;
	}

	
	public double getPercentageCompleted() {
		return 100.0 * this.completedQuestions / this.getCourse().getTotalQuestions();
	}

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
