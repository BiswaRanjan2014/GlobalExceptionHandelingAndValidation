package com.dakr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.Dao.StudentDao;
import com.dakr.model.StudentLogin;

@Service
public class StudentLoginServiceImpl implements StudentLoginService {

	@Autowired
	private StudentDao dao;

	@Override
	public StudentLogin insertStuDetails(StudentLogin stuLogin) {

		return dao.save(stuLogin);
	}

	@Override
	public StudentLogin getStuData(Integer sid) {
		return dao.findById(sid).get();
	}

	@Override
	public List<StudentLogin> getAllStudents() {
		return dao.findAll();
	}

	@Override
	public StudentLogin updateStuDetails(StudentLogin sid2) {
		return dao.save(sid2);
	}

	@Override
	public StudentLogin updateStudents(StudentLogin sid1) {
		StudentLogin sid11 = null;
		Optional<StudentLogin> op = dao.findById(sid1.getStuId());
		if (op.isPresent()) {
			sid11 = dao.save(sid1);
		} else {
			sid11 = dao.save(sid1);
		}
		return sid11;

	}

	@Override
	public String deleteOneStudents(Integer sid3) {
		
		String stmt="";
		if(sid3==null)
		{
			stmt="Invalid id";
		}
		
		else
		{	
			dao.deleteById(sid3);
			stmt="deleted successfully...";	
		}
		return stmt;

	}

	@Override
	public void deleteAllStudents() {

		dao.deleteAll();

	}

}
