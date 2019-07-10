package com.studentmanagement;

public class StudentDetail {
	private int id;
	private String name;
	private float marks1[] = new float[2];
	private int totalMarks;
	private boolean status;
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float[] getMarks1() {
		return marks1;
	}
	public void setMarks1(float[] marks1) {
		this.marks1 = marks1;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getArraySize() {
		return marks1.length;
	}
	
}
