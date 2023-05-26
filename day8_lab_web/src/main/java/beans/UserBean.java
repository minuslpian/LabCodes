package beans;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import dao.UserDaoImpl;
import pojos.User;

public class UserBean {
	
	private String fn;
	private String ln;
	private String em;
	private String pass;
	private String dob;
	private UserDaoImpl userDao;
	
	public UserBean() throws SQLException {
		userDao = new UserDaoImpl();
		System.out.println("user bean created");
	}


	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public String getEm() {
		return em;
	}
	public void setEm(String em) {
		this.em = em;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public UserDaoImpl getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}
	
	public String registerVoter() throws SQLException {
		System.out.println("in reg voter: Javabean B.L"+fn+" "+dob);
		LocalDate date = LocalDate.parse(dob);
		int ageInYears = Period.between(date, LocalDate.now()).getYears();
		if(ageInYears > 21) {
			User newVoter = new User(fn,ln,em,pass,Date.valueOf(date));
			return userDao.registerNewVoter(newVoter);
		}
		return "Voter reg failed, invalid age";
	}

}
