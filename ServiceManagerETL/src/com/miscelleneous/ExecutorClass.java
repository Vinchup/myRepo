package com.miscelleneous;

import com.incident.IncidentExecutorClass;

public class ExecutorClass {
	
	public static void execute() {
		try {
		Constants.setEtlIds();
		for(Short etl_ids : Constants.etl_Ids) {
			switch(etl_ids) {
				case 101 : IncidentExecutorClass.executeAllSubEtls();break;
				case 102 : break;
				case 103 : break;
				case 104 : break;
				case 105 : break;
			}
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		execute();
	}

}
