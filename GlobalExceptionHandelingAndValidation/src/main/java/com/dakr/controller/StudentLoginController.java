package com.dakr.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.model.StudentLogin;
import com.dakr.service.StudentLoginService;

@RestController
@RequestMapping("/students")
public class StudentLoginController {

	@Autowired
	private StudentLoginService service;

	// Inserting Data::
	@PostMapping("/login")
	public ResponseEntity<StudentLogin> saveStudentDetails(@Valid @RequestBody StudentLogin stu) {

		return new ResponseEntity<>(service.insertStuDetails(stu), HttpStatus.OK);

	}

	// Fetch Data BY ID One By By One::
	@GetMapping("/fetch/{sid}")
	public ResponseEntity<StudentLogin> fetchById(@PathVariable Integer sid) {
		return ResponseEntity.ok(service.getStuData(sid));

	}

	// Fetch All Data::
	@GetMapping("/fetchall")
	public ResponseEntity<List<StudentLogin>> fetchAll() {
		return ResponseEntity.ok(service.getAllStudents());

	}

	// Update Data::
	@PutMapping("/update")
	public ResponseEntity<StudentLogin> updateIntern(@Valid @RequestBody StudentLogin sid2) {
		return ResponseEntity.ok(service.updateStuDetails(sid2));
	}

	// Update Data::
	@PutMapping("/updateStud")
	public StudentLogin updateInterns(@RequestBody StudentLogin sid1) {
		return service.updateStudents(sid1);
	}

	// Delete Data By Id One By One::
	@DeleteMapping("/deleteOne/{sid3}")
	public void deleteOne(@PathVariable Integer sid3) {
		service.deleteOneStudents(sid3);
	}

	// Delete All::
	@DeleteMapping("/deleteAll")
	public void deleteall() {
		service.deleteAllStudents();
	}
}
