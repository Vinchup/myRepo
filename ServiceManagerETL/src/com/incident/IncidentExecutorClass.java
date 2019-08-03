package com.incident;

public class IncidentExecutorClass {
	
	public static void executeAllSubEtls() {
		try {
		IncidentDimension.execute();//dimension ETL
		// Fact ETL
		// App Data ETL
		// Health Check ETL
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
