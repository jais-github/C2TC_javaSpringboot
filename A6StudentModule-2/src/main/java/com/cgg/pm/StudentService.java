package com.cgg.pm;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentService 
{
	@Autowired
	private StudentReopsitory repository;
	
	//Retrieve
	public List<Student> listAll()
	{
		return repository.findAll();
	}
	
	//Retrieve By Id
	public Student get(Integer id) 
	{
		return repository.findById(id).get();
	}
	
	//Create and Update
	public void save(Student student)
	{
		repository.save(student);
	}
	
	//Delete
	public void delete(Integer id)
	{
		repository.deleteById(id);
	}	
	
}
