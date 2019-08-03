package com.miscelleneous;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class PublishStatusMap {
	
	public static HashMap<Integer,StatusPojo> getStatusMap(){
	HashMap<Integer,StatusPojo> statusMap =  new HashMap<Integer,StatusPojo>();
	try {
		Connection con = DbConnection.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement(QueryConstants.selectFromStatus);
		ResultSet Rs = pstmt.executeQuery();
		while(Rs.next()) {
			StatusPojo statusPojo = new StatusPojo();
			int statusId= Rs.getInt(1);
			String statusValue = Rs.getString(2);
			statusPojo.setStatusId(statusId);
			statusPojo.setStatusValue(statusValue);
			statusMap.put(statusId, statusPojo);
		}
		
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return statusMap;
	}
}

