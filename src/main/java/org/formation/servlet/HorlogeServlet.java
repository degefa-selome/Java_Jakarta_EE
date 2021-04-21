package org.formation.servlet;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Horloge")
public class HorlogeServlet extends HttpServlet {

	//Page web sans JSP
	//static String PAGE_HEADER = "<html><head><title>horloge</title></head><body>";
	//static String PAGE_FOOTER = "</body></html>";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException{
		// Page web sans JSP
		/*resp.setContentType("text/plain");
		PrintWriter writer = resp.getWriter();
        writer.println(PAGE_HEADER);

        try {
            writer.println("Horloge !");
        } catch (Exception e) {
            e.printStackTrace();
        }

        writer.println(PAGE_FOOTER);
        writer.close();*/

		//Page web avec JSP
		Date date = new Date(System.currentTimeMillis());
		req.setAttribute("hour", date.getHours());
		req.getRequestDispatcher("/jsp/Horloge.jsp").forward(req, resp);

	}

}
