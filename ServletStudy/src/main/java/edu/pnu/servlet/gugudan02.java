package edu.pnu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/gugudan02")
public class gugudan02 extends HttpServlet {
	private static final long serialVersionUID= 1L;

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("gugudan02");
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();

		String sdir=req.getParameter("dir");

		if(sdir.equals("ver")){
			for(int i=2;i<10;i++){
				out.print("<h2>" + "구구단 "+ i + "단</h2>");
				for(int j=1;j<10;j++) {
					out.println(i+"*"+j+"="+i*j+"<br />");}
			}
		}else{
				out.print("<div style='display:flex'>");
			for(int i=2;i<10;i++){
				out.print("<div align='center'>");
				out.print("<h2>" + "구구단 "+ i + "단"+"&nbsp"+"\t"+"</h2>");
				for(int j=1;j<10;j++) {
					out.println(i+"*"+j+"="+i*j+"\t"+"<br/>");
				}out.print("</div>");
			}	out.print("</div>");
		}
	}
}