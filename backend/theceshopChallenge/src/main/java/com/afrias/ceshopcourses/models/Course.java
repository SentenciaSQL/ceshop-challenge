package com.afrias.ceshopcourses.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "course")
public class Course implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 255)
	private String name;
	
	@Column(name = "total_questions")
	private Integer totalQuestions; 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
