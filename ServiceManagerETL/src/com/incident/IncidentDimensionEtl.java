package com.incident;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.miscelleneous.DbConnection;
import com.miscelleneous.LocationPojo;
import com.miscelleneous.PublishLocationMap;
import com.miscelleneous.PublishStatusMap;
import com.miscelleneous.QueryConstants;
import com.miscelleneous.StatusPojo;

public class IncidentDimensionEtl {
	public static HashMap<Integer,IncidentPojo> createDimensionObject() {
		
		HashMap<Integer,IncidentPojo> incidentMap = new HashMap<Integer,IncidentPojo>();
		try {
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement(QueryConstants.selectfromIncidentInfo);
			ResultSet Rs = pstmt.executeQuery();
			while(Rs.next()) {
				IncidentPojo incidentPojo = new IncidentPojo();
				int incId= Rs.getInt(1);
				String summary = Rs.getString(2);
				String description = Rs.getString(3);
				int statusId = Rs.getInt(4);
				int locationId = Rs.getInt(5);
				incidentPojo.setIncId(incId);
				incidentPojo.setSummary(summary);
				incidentPojo.setDecsription(description);
				incidentPojo.setStatusId(statusId);
				incidentPojo.setLocationId(locationId);
				
				incidentMap.put(incId,incidentPojo);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return incidentMap;
	}
	public static void insertIntoDimentionTable(HashMap<Integer,IncidentPojo> incidentMap) {
		
		HashMap<Integer, StatusPojo> statusMap = PublishStatusMap.getStatusMap();
		HashMap<Integer, LocationPojo> locationMap = PublishLocationMap.getLocationMap();
		Set<Integer> incIds = incidentMap.keySet();
		ArrayList<Integer> incIdsList = new ArrayList<Integer>(incIds);
			try {
				Connection con = DbConnection.getDbConnection();
				PreparedStatement pstmt = con.prepareStatement(QueryConstants.insertIntoIncInfoDimention);
				for(int inc_id : incIdsList) {
				
				    pstmt.setInt(1,incidentMap.get(inc_id).getIncId());
				    pstmt.setString(2,incidentMap.get(inc_id).getSummary());
				    pstmt.setString(3,incidentMap.get(inc_id).getDecsription());
				    int statusId = incidentMap.get(inc_id).getStatusId();
				    pstmt.setInt(4,incidentMap.get(inc_id).getStatusId());
				    pstmt.setString(5,statusMap.get(statusId).getStatusValue());
				    int locationId = incidentMap.get(inc_id).getLocationId();
				    pstmt.setInt(6,incidentMap.get(inc_id).getStatusId());
				    pstmt.setString(7,locationMap.get(locationId).getLocationValue());
				    pstmt.executeUpdate();
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
	}

}
