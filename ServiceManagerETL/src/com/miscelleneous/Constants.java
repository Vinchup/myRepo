package com.miscelleneous;
import java.util.ArrayList;

public class Constants {
	// ETLs with their IDs
	static final short INCIDENT_ETL = 101;
	static final short SR_ETL = 102;
	static final short PR_ETL = 103;
	static final short CR_ETL = 104;
	static final short TASK_ETL = 105;
	static final short INCIDENT_DIMENSTION_ETL = 106 ;
	static final short SR_DIMENSTION_ETL = 107 ;
	static final short PR_DIMENSTION_ETL = 108 ;
	static final short CR_DIMENSTION_ETL = 109 ;
	static final short TASK_DIMENSTION_ETL = 110 ;
	
	static ArrayList<Short> etl_Ids = new ArrayList<Short>();
	
	//Needs to be called from somewhere
	public static void setEtlIds() {
		etl_Ids.add(INCIDENT_ETL);
		etl_Ids.add(SR_ETL);
		etl_Ids.add(PR_ETL);
		etl_Ids.add(CR_ETL);
		etl_Ids.add(TASK_ETL);
	}
	
    
}
