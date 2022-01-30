package com.springmvc.web.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.springmvc.web.excelhelper.ExcelHelper;
import com.springmvc.web.modelrepository.StudentRepo;
import com.springmvc.web.models.Student;

@Service
public class ExcelServices {

	@Autowired
	  StudentRepo repository;

	  public void save(MultipartFile file) {
	    try {
	      List<Student> students = ExcelHelper.excelToStudents(file.getInputStream());
	      repository.saveAll(students);
	    } catch (IOException e) {
	      throw new RuntimeException("fail to store excel data: " + e.getMessage());
	    }
	  }

	  public List<Student> getAllTutorials() {
	    return repository.findAll();
	  }
	  
	  
}
