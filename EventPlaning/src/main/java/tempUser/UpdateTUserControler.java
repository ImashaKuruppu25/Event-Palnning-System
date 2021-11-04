package tempUser;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateTUserControler
 */
@WebServlet("/UpdateTUserControler")
public class UpdateTUserControler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String type = request.getParameter("type");
		String date = request.getParameter("date");
		String Hallid = request.getParameter("hid");
		String Menuid = request.getParameter("mid");
		String Decoid = request.getParameter("did");
		String Bandid = request.getParameter("bid");
		String Participation = request.getParameter("parti");
		
		boolean isTrue;
		
		
		isTrue = UpdateTUserDBUtil.updateTUser(type, date, Hallid, Menuid, Decoid, Bandid, Participation);
		
		if(isTrue == true) {
			System.out.println("Successfully Update!");
		}else {
			System.out.println("Not Updated");  
		}
		
		response.sendRedirect("UpdateList.jsp");
	}

}
