package com.dakr.service;

import java.util.List;
import java.util.Optional;

import com.dakr.model.StudentLogin;

public interface StudentLoginService {

	public StudentLogin insertStuDetails(StudentLogin stuLogin);

	public StudentLogin getStuData(Integer sid);

	public List<StudentLogin> getAllStudents();

	public StudentLogin updateStuDetails(StudentLogin sid2);

	public StudentLogin updateStudents(StudentLogin sid1);

	public String deleteOneStudents(Integer sid3);

	public void deleteAllStudents();

}
