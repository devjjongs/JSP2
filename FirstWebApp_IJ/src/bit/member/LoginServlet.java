package bit.member;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.GregorianCalendar;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GregorianCalendar today = new GregorianCalendar();

        request.setAttribute("loginYear", today.get(GregorianCalendar.YEAR));

//        response.sendRedirect("login.jsp");
//        request.getRequestDispatcher("어디로누구한테 doGet()호출한 정보를 같이전달할까").forward(request, response);
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}
