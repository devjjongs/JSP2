package bit.member;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginPrcServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String userPasswd = request.getParameter("userPasswd");

        if (userId.equals("lee")){
            request.setAttribute("userID", userId);
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        } else {
            response.sendRedirect("login.do");
        }
    }
}
