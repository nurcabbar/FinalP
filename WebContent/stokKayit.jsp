<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title>Stok Kayit</title>
<script>


function formKontrol()
{
   u_barkodNo= document.getElementById("u_barkodNo").value;
   u_adi= document.getElementById("u_adi").value;
   u_modeli= document.getElementById("u_modeli").value;
   u_fiyat= document.getElementById("u_fiyat").value;
   
   if (u_barkodNo=="")
        alert("Lutfen urun barkod no alanini doldurunuz.");
   if (u_adi=="")
       alert("Lutfen urun adi alanini doldurunuz.");
   if (u_modeli=="")
       alert("Lutfen urun modeli alanini doldurunuz.");
   if (u_fiyat=="")
       alert("Lutfen urun fiyat alanini doldurunuz.");
   else
   {
          alert("Basarili");
   }

 

}
</script>

</head>
<body>
<p><center><h2><b>STOK GIRIS-GORUNTULEME UYGULAMASI</b></h2></center></p>
<br/>
<p><b>STOK KAYIT:</b></p>

 <table id="tablo" border="1" bordercolor="white" cellspacing="0" cellpadding="0" width="500">
<tr>
<td>Urun Barkod No: </td>
<td><input type = "text" id = "u_barkodNo" name = "u_barkodNo"></td>
</tr>
<tr>
<td>Urun Adi:</td>
 <td><input type = "text" id = "u_adi" name = "u_adi" /></td>
</tr>
<tr>
<td>Urun Modeli:</td>
 <td><input type = "text" id = "u_modeli" name = "u_modeli" /></td>
</tr>
<tr>
<td>Urun Fiyat:</td>
 <td><input type = "text" id = "u_fiyat" name = "u_fiyat" /></td>
</tr>
<tr>
<td><input type="button" id="btnEkle" name="btnEkle" value="EKLE" onclick="formKontrol()">
<input type="button" id="btnSil" name="btnSil" value="SIL" onclick="formKontrol()">
<input type="button" id="btnGuncelle" name="btnGuncelle" value="GUNCELLE" onclick="formKontrol()"></td>
     
 
</tr>
</table>

</body>
</html>