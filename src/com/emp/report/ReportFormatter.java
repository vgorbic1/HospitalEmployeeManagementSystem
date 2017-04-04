package com.emp.report;

public class ReportFormatter {

	String formattedOutput;
	
	public ReportFormatter(Object object, FormatType formatType) {
		switch (formatType) {
		case XML :
			formattedOutput = converObjectToXML(object);
			break;
		case CSV :
			formattedOutput = converObjectToCSV(object);
			break;
		}
	}
	
	private String converObjectToXML(Object object) {
		return "XML : <title>" + object.toString() + "</title>";
	}
	
	private String converObjectToCSV(Object object) {
		return "CSV : , " + object.toString() + ",";
	}
	
	protected String getFormattedValue() {
		return formattedOutput;
	}
}
