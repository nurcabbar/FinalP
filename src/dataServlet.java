import java.io.IOException;
import javax.servlet.ServletException;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Class.Urun;
import Class.dataConnection;
/**
 * Servlet implementation class dataServlet
 */
@WebServlet("/dataServlet")
public class dataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public dataServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Urun urn = new Urun(request);
		dataConnection kayit = new dataConnection();
		int kayitSayisi= 0;
		try {
			kayitSayisi = kayit.Connection(urn));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(kayitSayisi);
	}

}
