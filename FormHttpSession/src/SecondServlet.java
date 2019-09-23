

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SecondServlet() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s3=request.getParameter("t3");
		String s4=request.getParameter("t4");
		String s5=request.getParameter("t5");
		
		HttpSession session= request.getSession();
		
		session.setAttribute("name", s3);
		session.setAttribute("city", s4);
		session.setAttribute("age",s5);
		PrintWriter pw=response.getWriter();
		pw.println("<form action='ThirdServlet' method='post'>");
		pw.println("Skill:<input type='text' name='t6'><br><br>");
		pw.println("Salary:<input type='text' name='t7'><br><br>");
		pw.println("<input type='submit'><br><br>");
		pw.println("</form>");
	}

}
