package com.cgg.pm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
@Transactional

public class CollegeService {
	@Autowired
	private CollegeRepository collegeRepo;
	
	//Retrieve
	public List<College> listAll() {
		return collegeRepo.findAll();
	}
	
	//Retrieve By Id
	public College get(Integer Id) {
		return collegeRepo.findById(Id).get();
	}
	
	//create and update
	public void save(College college) {
		collegeRepo.save(college);
	}
	
	//delete
	public void delete(Integer id) {
		collegeRepo.deleteById(id);
	}
}
