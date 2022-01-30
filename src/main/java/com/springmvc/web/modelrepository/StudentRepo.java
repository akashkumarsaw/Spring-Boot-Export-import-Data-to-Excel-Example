package com.springmvc.web.modelrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmvc.web.models.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
