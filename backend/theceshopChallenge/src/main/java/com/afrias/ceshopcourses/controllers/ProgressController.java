package com.afrias.ceshopcourses.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afrias.ceshopcourses.models.Progress;
import com.afrias.ceshopcourses.repository.IProgressRepository;

@CrossOrigin(origins = {"http://localhost:4200", "*", "http://localhost:8080"})
@RestController
@RequestMapping("/api")
public class ProgressController {
	
	@Autowired
	private IProgressRepository repository;
	
	@GetMapping("/progress/{studentId}")
	public ResponseEntity<?> getStudentProgress(@PathVariable Long studentId) {
		List<Progress> progress = repository.findByStudentId(studentId);
		
		Map<String, Object> response = new HashMap<>();
		
		if(progress.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		response.put("data", progress);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	@GetMapping("/progress/{studentId}/{couserId}")
	public ResponseEntity<?> getStudentProgress(@PathVariable Long studentId, @PathVariable Long couserId) {
		
		Progress progress = repository.findByStudentIdAndCourseId(studentId, couserId);
		
		Map<String, Object> response = new HashMap<>();
		
		if(progress == null) {
			return ResponseEntity.notFound().build();
		}
		
		response.put("data", progress);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	@GetMapping("/students")
	public ResponseEntity<?> getAllStudents() {
		return ResponseEntity.ok().body(repository.findAllStudents());
	}
	
	@GetMapping("/courses")
	public ResponseEntity<?> getAllCourses() {
		return ResponseEntity.ok().body(repository.findAllCourses());
	}

}
