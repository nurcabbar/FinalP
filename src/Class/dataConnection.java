package Class;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;
import java.lang.reflect.Field;
import java.sql.PreparedStatement;
import javax.naming.Context;
import javax.naming.InitialContext;



import Class.Urun;

public class dataConnection {

		
	public int Connection(Urun urn) throws SQLException
	{
		int retVal = 1;
		Connection baglan = GetConnection();
		 
		try {
			String insertQuery = PrepareQueryString(urn);

		 
		    if (baglan != null) {
		        System.out.println("Connected");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

String sql = "INSERT INTO vt_urunler (u_barkodNo, u_adi, u_modeli, u_fiyat)VALUES (urun_barkodNo, urun_adi, urun_modeli, urun_fiyat)";

PreparedStatement dr = baglan.prepareStatement(sql);
dr.setString(1, urn.getUrun_barkodNo());
dr.setString(2, urn.getUrun_adi());
dr.setString(3, urn.getUrun_modeli());
dr.setString(4, urn.getUrun_modeli());
 
int rowsInserted = dr.executeUpdate();
if (rowsInserted > 0) {
    System.out.println("Ekleme Başarılı!");
}


String sql = "UPDATE vt_urunler SET urun_barkodNo, urun_adi, urun_modeli, urun_fiyat";
PreparedStatement dr = baglan.prepareStatement(sql);
dr.setString(1, urn.getUrun_barkodNo());
dr.setString(2, urn.getUrun_adi());
dr.setString(3, urn.getUrun_modeli());
dr.setString(4, urn.getUrun_modeli());
 
int rowsUpdated = dr.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("Güncelleme Başarılı!");
}
String sql = "DELETE FROM vt_urunler WHERE urun_barkodNo, urun_adi, urun_modeli, urun_fiyat";

PreparedStatement dr = baglan.prepareStatement(sql);
dr.setString(1, urn.getUrun_barkodNo());
dr.setString(2, urn.getUrun_adi());
dr.setString(3, urn.getUrun_modeli());
dr.setString(4, urn.getUrun_modeli());
 
int rowsDeleted = dr.executeUpdate();
if (rowsDeleted > 0) {
    System.out.println("Silme Başarılı!");
}
}

}

