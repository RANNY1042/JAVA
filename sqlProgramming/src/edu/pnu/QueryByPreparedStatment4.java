package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

public class QueryByPreparedStatment4 {

	String user ="";
	String pass="";
	Integer year 11;

	String str = "";
	if(user !=null) {
		str ="username='" + user + "' ";
	}
	if (pass !=null) {
		if(!str.isEmpty()) str += ",";
		str = "password='" + pass +"' ";
	}

	if (year !=null) {
		if(!str.isEmpty()) str +=",";
		str = str+"birthyear="+year;
	}
	String sql = "Update membr set " + str + "where id=" + id;
	Statement st = con.createStatement();
	st.excuteUpdate(sql);
}













