package com.cg.pm;

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
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//Retrieve
	@GetMapping("/users")
	public List<User> list(){
		return userService.listAll();
	}
	
	//Retrieve By Id
	@GetMapping("/users/{id}")
	public ResponseEntity get(@PathVariable Integer id) {
		try {
			User user=userService.get(id);
			return new ResponseEntity<User>(user,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
	
	//create 
	@PostMapping("/users")
	public void add(@RequestBody User user) {
		userService.save(user);
	}
	
	//update 
	@PutMapping("/users/{id}")
	public ResponseEntity<?> update(@RequestBody User user,@PathVariable Integer id){
		try {
			User updateUser=userService.get(id);
			userService.save(user);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//delete
	@DeleteMapping("/users/{id}")
	public void delete(@PathVariable Integer id) {
		userService.delete(id);
	}
}
