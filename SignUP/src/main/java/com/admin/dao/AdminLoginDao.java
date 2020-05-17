package com.admin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginDao {

	String sql = "select * from adminlogin where uname2=? and password3=?";

	public boolean check(String uname2, String password3) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname2);
			st.setString(2, password3);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				return true;
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return false;

	}

}
