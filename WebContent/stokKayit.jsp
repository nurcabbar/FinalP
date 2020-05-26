<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title>Stok Kayıt</title>
</head>
<body>
 <form action = "servlet.java" method = "GET">
         Urun Barkod No: <input type = "text" id = "u_barkodNo" name = "u_barkodNo">
         <br />
         Urun Adi: <input type = "text" id = "u_adi" name = "u_adi" />
         <br />
         Urun Modeli: <input type = "text" id = "u_modeli" name = "u_modeli" />
         <br />
         Urun Fiyat: <input type = "text" id = "u_fiyat" name = "u_fiyat" />
         <br /><br />
      
         <input type="submit" id="btnEkle" name="btnEkle" value="EKLE">
         <input type="submit" id="btnSil" name="btnSil" value="SIL">
         <input type="submit" id="btnGuncelle" name="btnGuncelle" value="GUNCELLE">
         <br /><br />
         <input type="submit" id="btnStokGor" name="btnStokGor" value="STOK GORUNTULE">
      </form>
</body>
</html>