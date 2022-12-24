package com.cg.pm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	//Retrieve
	public List<User> listAll() {
		return userRepo.findAll();
	}
	
	//Retrieve By Id
	public User get(Integer Id) {
		return userRepo.findById(Id).get();
	}
	
	//create and update
	public void save(User user) {
		userRepo.save(user);
	}
	
	//delete
	public void delete(Integer id) {
		userRepo.deleteById(id);
	}
}
