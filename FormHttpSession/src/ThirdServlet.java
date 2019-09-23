

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ThirdServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s6=request.getParameter("t6");
		String s7=request.getParameter("t7");
		
		HttpSession session=request.getSession();
		
		session.setAttribute("skill", s6);
		session.setAttribute("salary", s7);
		
		PrintWriter pw=response.getWriter();
		pw.println("<table align:'centre' border=1>");
		pw.println("<th>Nmae</th><th>Email</th><th>Nmae</th><th>City</th><th>Age</th><th>Skill</th><th>Salary</th>");
		/*pw.println(session.getAttribute("name").toString());
		pw.println(session.getAttribute("email").toString());
		pw.println(session.getAttribute("name").toString());
		pw.println(session.getAttribute("city").toString());
		pw.println(session.getAttribute("age").toString());
		pw.println(session.getAttribute("skill").toString());
		pw.println(session.getAttribute("salary").toString());*/
		pw.println("<tr><td>"+session.getAttribute("name").toString()+"</td><td>"+session.getAttribute("email").toString()+"</td>"
				+ "<td>"+session.getAttribute("name").toString()+"</td><td>"+session.getAttribute("city").toString()+"</td>"
						+ "<td>"+session.getAttribute("age").toString()+"</td><td>"+session.getAttribute("skill").toString()+"</td>"
								+ "<td>"+session.getAttribute("salary").toString()+"</td></tr>");
	}

}
