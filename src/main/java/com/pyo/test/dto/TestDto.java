package com.pyo.test.dto;

public class TestDto {
	
	private String testName;
	private String testTime;
	private String studentName;
	private int score;
	
	public TestDto() {}

	public TestDto(String testName, String testTime, String studentName, int score) {
		super();
		this.testName = testName;
		this.testTime = testTime;
		this.studentName = studentName;
		this.score = score;
	}
	
	

	public TestDto(String studentName, int score) {
		super();
		this.studentName = studentName;
		this.score = score;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getTestTime() {
		return testTime;
	}

	public void setTestTime(String testTime) {
		this.testTime = testTime;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
