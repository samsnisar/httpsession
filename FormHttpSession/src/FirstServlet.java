
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FirstServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		 
		HttpSession session=request.getSession();
		session.setAttribute("name", s1);
		session.setAttribute("email", s2);
	
		PrintWriter pw=response.getWriter();
		pw.println("<form action='SecondServlet' method='post'>");
		pw.println("Name:<input type='text' name='t3'><br><br>");
		pw.println("City:<input type='text' name='t4'><br><br>");
		pw.println("Age:<input type='text' name='t5'><br><br>");
		pw.println("<input type='submit'><br><br>");
		pw.println("</form>");
	}

}
