package bit.member;

import java.io.IOException;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		GregorianCalendar today = new GregorianCalendar();

		request.setAttribute("loginYear", today.get(GregorianCalendar.YEAR));

//		response.sendRedirect("login.jsp");
//		request.getRequestDispatcher("어디로 누구한테, doGet()을 호출한 정보를 같이 전달할까").forward(request, response)
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

}
