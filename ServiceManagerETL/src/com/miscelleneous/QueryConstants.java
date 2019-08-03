package com.miscelleneous;

public class QueryConstants {
	
	public static String selectfromIncidentInfo = "select inc_id,summary,description,status,location from inc_info";
	public static String selectFromStatus = "select status_id,status_value from status";
	public static String selectFromlocation = "select location_id,location_value from location";
	public static String insertIntoIncInfoDimention = "insert into inc_info_dimension(inc_id,summary,description,status,status_value,location,location_value) values(?,?,?,?,?,?,?)";
}
