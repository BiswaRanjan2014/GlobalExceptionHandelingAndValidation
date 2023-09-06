package com.dakr.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dakr.model.StudentLogin;

public interface StudentDao extends JpaRepository<StudentLogin, Integer> {

}
