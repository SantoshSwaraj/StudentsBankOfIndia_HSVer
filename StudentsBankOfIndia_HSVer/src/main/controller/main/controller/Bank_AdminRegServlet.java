package main.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.dao.StudentsBankOfIndiaDao;
import main.model.Bank_Admin;

public class Bank_AdminRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String emp_fname = request.getParameter("emp_fname");
		String emp_mname = request.getParameter("emp_mname");
		String emp_lname = request.getParameter("emp_lname");
		String emp_design = request.getParameter("emp_design");
		String email	=	request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("EMP_FNAME : "+emp_fname);
		System.out.println("EMP_MNAME : "+emp_mname);
		System.out.println("EMP_LNAME : "+emp_lname);
		System.out.println("EMP_DESIGN: "+emp_design);
		System.out.println("EMAIL     :"+email);
		System.out.println("USERNAME  :"+username);
		System.out.println("PASSWORD  :"+password);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentsBankOfIndiaDao dao = (StudentsBankOfIndiaDao)context.getBean("Sdao");
		System.out.println("Dao got successfully");
		
		Bank_Admin bankAdmin = new Bank_Admin();
		bankAdmin.setEmp_fname(emp_fname);
		bankAdmin.setEmp_mname(emp_mname);
		bankAdmin.setEmp_lname(emp_lname);
		bankAdmin.setEmp_design(emp_design);
		bankAdmin.setEmp_email(email);
		bankAdmin.setUser_name(username);
		bankAdmin.setPassword(password);
		
		dao.saveBankAdmin(bankAdmin);
		
	}

}
