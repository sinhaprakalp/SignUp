package com.hrlogin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HrLoginDao {

	String sql = "select * from hrlogin where uname1=? and password2=?";

	public boolean check(String uname1, String password2) throws IllegalAccessException, ClassNotFoundException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname1);
			st.setString(2, password2);
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
