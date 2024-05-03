package edu.pnu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/gugudan01")
public class gugudan01 extends HttpServlet {
	private static final long serialVersionUID= 1L;

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("gugudan01");
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		
		String snum=req.getParameter("num");
		int num=2;
		if(snum!=null) {
			num=Integer.parseInt(snum);
		}
		
		out.print("<h2>" + "구구단 "+ num + "단</h2>");
		for(int i=1;i<10;i++){
			out.println(num+"*"+i+"="+num*i+"<br />");}
	}

}
