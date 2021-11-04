package tempUser;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteTUserController
 */
@WebServlet("/DeleteTUserController")
public class DeleteTUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		boolean isTrue;
		
		
		isTrue = UpdateTUserDBUtil.DeleteTUser();
		
		if(isTrue == true) {
			System.out.println("Successfully Deleted!");
		}else {
			System.out.println("Not Deleted");  
		}
		
		response.sendRedirect("index.jsp");
	}

}
