package tempUser;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ArraangementSaveController
 */
@WebServlet("/ArraangementSaveController")
public class ArraangementSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArraangementSaveController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("type1");
		String Hall = request.getParameter("Hall");
		String Menu = request.getParameter("Menu");
		String Deco = request.getParameter("Deco");
		String Band = request.getParameter("Band");
		String Total = request.getParameter("Tot");
		String date = request.getParameter("date");
		String participation = request.getParameter("participation");
//		System.out.println(Hall);
//		System.out.println(Menu);
//		System.out.println(Deco);
//		System.out.println(Band);
//		System.out.println(Total);
		int tot = Integer.parseInt(Total);
		
		ArrangementSaveDBUtil util = new ArrangementSaveDBUtil();
		boolean res = util.SavelDetails(type,Hall,Menu,Deco,Band,tot,date,participation);
		
		if(res==true) {
			//data entered successfully
			System.out.println("Success");
			
			
		}else {
			//data fail page
			System.out.println("not Success");
		}
		
		response.sendRedirect("UpdateList.jsp");
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
