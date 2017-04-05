package com.emp.domain;

public class Nurse extends Employee {
	public Nurse(long id, String name, String department, boolean working) {
		super(id, department, department, working);		
	}
	
	private void checkVitals() {
		System.out.println("Checking vitals ...");
	}

	@Override
	public void performDuties() {
		checkVitals();
	}
}
