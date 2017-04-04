package com.emp;

import com.emp.domain.Employee;
import com.emp.persistence.DatabaseConnectionManager;
import com.emp.persistence.EmployeeDAO;
import com.emp.report.EmployeeReportFormatter;
import com.emp.report.FormatType;
import com.emp.report.ReportFormatter;

public class ClientModule {

	public static void main(String[] args) {
		// create employee
		Employee employee = new Employee(1, "James", "Administration", true);

		ClientModule.hireNewEmployee(employee);

		ClientModule.printEmployeeReport(employee, FormatType.XML);

	}

	public static void hireNewEmployee(Employee employee) {
		EmployeeDAO dao = new EmployeeDAO();
		dao.saveEmployee(employee);
	}

	public static void printEmployeeReport(Employee employee, FormatType formatType) {
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
		System.out.println(formatter.getFormattedEmployee());
	}

}
