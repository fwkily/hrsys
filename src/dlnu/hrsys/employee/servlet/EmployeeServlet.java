package dlnu.hrsys.employee.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dlnu.hrsys.employee.entity.Employee;
import dlnu.hrsys.employee.impl.EmployeeDaoImpl;
import dlnu.hrsys.util.DBUtil.DBException;

@WebServlet(name="EmployeeServlet", urlPatterns="/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		EmployeeDaoImpl edm;
		try {
			edm = new EmployeeDaoImpl();
	
		HttpSession session = request.getSession(true);
		Employee e;
		String flag = request.getParameter("flag");

		  if("add".equals(flag)){ 

			  //int id=Integer.valueOf(request.getParameter("id")); 
			  String name=request.getParameter("name");
			  int sex_id=Integer.valueOf(request.getParameter("sex_id"));
			  Date birth_date=Date.valueOf(request.getParameter("birth_date"));
			  String id_card=request.getParameter("id_card");
			  int department_id=Integer.valueOf(request.getParameter("department_id"));
			  int job_id=Integer.valueOf(request.getParameter("job_id"));
			  Date hire_date=Date.valueOf(request.getParameter("hire_date"));
			  Date join_date=Date.valueOf(request.getParameter("join_date"));
			  int hire_type_id=Integer.valueOf(request.getParameter("hire_type_id"));
			  int hr_type_id=Integer.valueOf(request.getParameter("hr_type_id"));
			  int politics_status_id=Integer.valueOf(request.getParameter("politics_status_id"));
			  int nationality_id=Integer.valueOf(request.getParameter("nationality_id"));
			  String native_place=request.getParameter("native_place");
			  String phone=request.getParameter("phone");
			  String email=request.getParameter("email");
			  int height_cm=Integer.valueOf(request.getParameter("height_cm"));
			  int blood_type_id=Integer.valueOf(request.getParameter("blood_type_id"));
			  int marital_status_id=Integer.valueOf(request.getParameter("marital_status_id"));
			  String birth_place=request.getParameter("birth_place");
			  String domicile_place=request.getParameter("domicile_place");
			  int education_status_id=Integer.valueOf(request.getParameter("education_status_id"));
			  int degree_id=Integer.valueOf(request.getParameter("degree_id"));
			  String graduate_school=request.getParameter("graduate_school");
			  String major_name=request.getParameter("major_name");
			  Date graduate_date=Date.valueOf(request.getParameter("graduate_date"));
			  		  
			  e=new Employee(1,name,sex_id,birth_date,id_card,department_id,job_id,hire_date,join_date,hire_type_id,hr_type_id,
			  politics_status_id,nationality_id,native_place,phone,email,height_cm,blood_type_id,marital_status_id,birth_place,
			  domicile_place,education_status_id,degree_id,graduate_school,major_name,graduate_date);
			  
			  /*e=new Employee(1,name,1,birth_date,id_card,1,1,hire_date,join_date,9,9,
			  8,7,native_place,phone,email,height_cm,6,5,birth_place,
			  domicile_place,4,3,graduate_school,major_name,graduate_date);*/
			  
			  boolean bool=edm.addEmployee(e); 
			  if(bool){ 
				  session.setAttribute("Employee", e);
				  request.getRequestDispatcher("/index.jsp").forward(request,response); 
			  			}
		  }
		} catch (DBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		
	}

}