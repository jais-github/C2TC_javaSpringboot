package com.cgg.pm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CollegeController {
	@Autowired
	private CollegeService CollegeService;
	
	//Retrieve
	@GetMapping("/Colleges")
	public List<College> list(){
		return CollegeService.listAll();
	}
	
	//Retrieve By Id
	@GetMapping("/Colleges/{id}")
	public ResponseEntity get(@PathVariable Integer id) {
		try {
			College College=CollegeService.get(id);
			return new ResponseEntity<College>(College,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
	
	//create 
	@PostMapping("/Colleges")
	public void add(@RequestBody College College) {
		CollegeService.save(College);
	}
	
	//update 
	@PutMapping("/Colleges/{id}")
	public ResponseEntity<?> update(@RequestBody College College,@PathVariable Integer id){
		try {
			College updateCollege=CollegeService.get(id);
			CollegeService.save(College);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//delete
	@DeleteMapping("/Colleges/{id}")
	public void delete(@PathVariable Integer id) {
		CollegeService.delete(id);
	}
}
