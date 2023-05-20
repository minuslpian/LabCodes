package dao;

import static utils.DBUtils.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojos.User;
public class UserDaoImp implements UserDao {
	private Connection cn;
	private PreparedStatement pst1;
	public UserDaoImp() throws SQLException {
		cn=openConnection();
		pst1=cn.prepareStatement("select * from users where email=? and password=?");
		
	}
	@Override
	public User authenticateUser(String email,String pass) throws SQLException {
		pst1.setString(1, email);
		pst1.setString(2,pass);
		try(ResultSet rs=pst1.executeQuery()){
			if(rs.next()) {
				return new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6),rs.getBoolean(7),rs.getString(8));
			}
		}
		return null;
//		catch(Exception e){
//			e.printStackTrace();
//		}
	}
	public void cleanUp() throws SQLException {
		if(pst1!=null)
			pst1.close();
		closeConnection();
	}
	
	
}
