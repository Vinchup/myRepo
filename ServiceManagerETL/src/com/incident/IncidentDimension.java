package com.incident;

import java.util.HashMap;

public class IncidentDimension {
	public static void execute() {
		try {
		HashMap<Integer,IncidentPojo> incidentMap = IncidentDimensionEtl.createDimensionObject();
		IncidentDimensionEtl.insertIntoDimentionTable(incidentMap);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
