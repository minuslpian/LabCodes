package pages;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDaoImp;

@WebServlet(value="/authenticate",loadOnStartup=1)
public class LoginServ extends HttpServlet {
	public UserDaoImp udi;
	public void init() throws ServletException{
		try {
			udi=new UserDaoImp();
		} catch (SQLException e) {
			
			throw new ServletException("err in init "+e.getMessage(),e);
		}
		
	}
	public void destroy() {
		try {
			udi.cleanUp();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		
	}
} 
