package com.studentcruudapi.Codes.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentcruudapi.Codes.Entity.student;

public interface Dao extends JpaRepository<student, Integer> {

}
