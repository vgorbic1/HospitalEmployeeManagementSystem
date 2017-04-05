package com.emp;

import com.emp.domain.Doctor;
import com.emp.domain.Employee;
import com.emp.domain.Nurse;

public class ClientModule {

	public static void main(String[] args) {
		// create employee
		Employee james = new Doctor(1, "James", "Administration", true);

		ClientModule.callUpon(james);
		
		Employee mary = new Nurse(1, "Mary", "Administration", true);
		
		ClientModule.callUpon(mary);

	}

	public static void callUpon(Employee employee) {
		employee.performDuties();
	}

}
