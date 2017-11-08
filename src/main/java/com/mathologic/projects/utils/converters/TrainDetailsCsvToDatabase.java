package com.mathologic.projects.utils.converters;


import org.springframework.stereotype.Service;



@Service("TrainDetails")
public class TrainDetailsCsvToDatabase implements CsvToDatabase {

	
	
	private String seperator = ",";
	private String stringMarker = "'";

	public String getSeperator() {
		return seperator;
	}

	public void setSeperator(String seperator) {
		this.seperator = seperator;
	}

	public String getStringMarker() {
		return stringMarker;
	}

	public void setStringMarker(String stringMarker) {
		this.stringMarker = stringMarker;
	}
	
	/**
	 * This method accept all columns of a line and sends to the save train method
	 */
	public boolean processRecord(String[] columns) {
		Integer trainNo = null;
		String startDays=new String();
		Integer day=new Integer(0);
		// format the days in comma separated string format. eg. '1,2,3' by the below logic.
		// column 6 to 12 contains the days columns. 
		// reads each day column and checks whether it contains 'y' or not. If it does means convert that
		// to enum value of that day.
		try {
			trainNo = Integer.parseInt(columns[0]);
			for (int i = 4; i <= 10; i++) {
				if (!columns[i].isEmpty()) {
					day = i-4;
					startDays=startDays.concat(","+day.toString());
				}
				
			}
			startDays = startDays.substring(1, startDays.length());
			
			
	
		} catch (Exception exe) {
			System.out
					.println("Error : in sourceStation : " + exe.getMessage());
		}
		return false;
	}


	
}
