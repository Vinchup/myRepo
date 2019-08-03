package com.miscelleneous;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class PublishLocationMap {
	public static HashMap<Integer,LocationPojo> getLocationMap(){
		
		HashMap<Integer,LocationPojo> locationMap =  new HashMap<Integer,LocationPojo>();
		try {
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement(QueryConstants.selectFromlocation);
			ResultSet Rs = pstmt.executeQuery();
			while(Rs.next()) {
				LocationPojo locationPojo = new LocationPojo();
				int locationId= Rs.getInt(1);
				String locationValue = Rs.getString(2);
				locationPojo.setLocationId(locationId);
				locationPojo.setLocationValue(locationValue);
				locationMap.put(locationId, locationPojo);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return locationMap;
		}
}
