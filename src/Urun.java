import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public class Urun {
    private String urun_barkodNo;
    private String urun_adi;
    private String urun_modeli;
    private String urun_fiyat;

public Urun(String urun_barkodNo, String urun_adi, String urun_modeli, String urun_fiyat)
{
	this.setUrun_barkodNo(urun_barkodNo);
	this.setUrun_adi(urun_adi);
	this.setUrun_modeli(urun_modeli);
	this.setUrun_fiyat(urun_fiyat);
}
public Urun(HttpServletRequest request) {
    this.setUrun_barkodNo(request.getParameter("u_barkodNo"));
    this.setUrun_adi(request.getParameter("u_adi"));
    this.setUrun_modeli(request.getParameter("u_modeli"));
    this.setUrun_fiyat(request.getParameter("u_fiyat"));
}
public String getUrun_barkodNo() {
	return urun_barkodNo;
}
public void setUrun_barkodNo(String urun_barkodNo) {
	this.urun_barkodNo = urun_barkodNo;
}
public String getUrun_adi() {
	return urun_adi;
}
public void setUrun_adi(String urun_adi) {
	this.urun_adi = urun_adi;
}
public String getUrun_modeli() {
	return urun_modeli;
}
public void setUrun_modeli(String urun_modeli) {
	this.urun_modeli = urun_modeli;
}
public String getUrun_fiyat() {
	return urun_fiyat;
}
public void setUrun_fiyat(String urun_fiyat) {
	this.urun_fiyat = urun_fiyat;
}
}
