package Class;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;

import Urun;

public class urunEkle {
	
	public int vt_Urunler(Urun urn) throws SQLException {
		int retVal = 1;
		Connection conn = GetConnection();
		try {
			String insertQuery = PrepareQueryString(urn);
			
			PreparedStatement pst = conn.prepareStatement(insertQuery);
			pst.setString(1, urn.getTCKN());
			pst.setString(2, mstr.getAd());
			pst.setString(3, mstr.getSoyad());
			pst.setString(4, mstr.getTelNo());
			pst.setString(5, mstr.getAdres());
			pst.setString(6, mstr.getYas());
			pst.setString(7, mstr.getGirisTarihi());
			pst.setString(8, mstr.getCikisTarihi());
			pst.setString(9, mstr.getOdaNo());
			
			pst.execute();
			
			}
			
			conn.commit();
			
	


	



	private Connection GetConnection() {
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			String connURL = (String) ctx.lookup("java:comp/env/connURL");
			conn = DriverManager.getConnection(connURL);
			conn.setAutoCommit(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}