package com.cgg.pm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student
{
	 private int id;
	 private String name;
	 private String college;
	 private long roll;
	 private String course;
	 private int year;
	 private String certificate;
	 private long hallticketno;
	 private String qualification;
	
	 public Student() {
		super();
	}

	public Student(int id, String name, String college,  long roll, String qualification, String course,
			int year,String certificate,  long hallticketno) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.roll = roll;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.certificate = certificate;
		this.hallticketno = hallticketno;
	}
	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) 
	{
		this.name =name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public long getRoll() {
		return roll;
	}

	public void setRoll(long roll) {
		this.roll = roll;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public long getHallticketno() {
		return hallticketno;
	}

	public void setHallticketno(long hallticketno) {
		this.hallticketno = hallticketno;
	}

	@Override
	public String toString() {
		return "IStudentservice [id=" + id + ", name=" + name + ", roll=" + roll + ", qualification=" + qualification
				+ ", course=" + course + ", year=" + year + ", hallticketno=" + hallticketno + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getRoll()=" + getRoll() + ", getQualification()=" + getQualification()
				+ ", getCourse()=" + getCourse() + ", getYear()=" + getYear() + ", getHallticketno()="
				+ getHallticketno() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	 
	 
	 
}

