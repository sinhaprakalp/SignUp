package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

	String sql = "select * from detail where uname=? and password=?";


	public boolean check(String uname, String password) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, password);
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
