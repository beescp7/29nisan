package com.IsteMysql;

import java.sql.*;

public class VeritabaniUtil {

	static Connection conn = null;

	public static Connection Baglan() {
		// TODO Auto-generated method stub
		try {
			// conn=DriverManager.getConnection("jdbc:mysql://ServerIP/db_ismi",
			// "kullanici", "sifre");
			conn=DriverManager.getConnection("jdbc:mysql://localhost/projemdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"
					, "root", "mysql");
			return conn;
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			return null;
		}
	}
}
