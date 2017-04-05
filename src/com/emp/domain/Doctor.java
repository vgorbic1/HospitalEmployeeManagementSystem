package com.emp.domain;

public class Doctor extends Employee {

		public Doctor(long id, String name, String department, boolean working) {
			super(id, department, department, working);		
		}
		
		private void prescribeMed() {
			System.out.println("Prescribing medicine ...");
		}

		@Override
		public void performDuties() {
			prescribeMed();
		}
}
