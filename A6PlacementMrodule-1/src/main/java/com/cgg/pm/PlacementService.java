package com.cgg.pm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PlacementService {
	@Autowired
private PlacementRepository repository;

	
	//Retrieve All
	public List<Placement> listAll() {
		return repository.findAll();
		
	}
	
	//Retrieve By ID
	public Placement get(Integer id) {
		return repository.findById(id).get();
	}
	
	//Create and Update
	public void save(Placement placement) {
		repository.save(placement);
	}
	
	//Delete
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
