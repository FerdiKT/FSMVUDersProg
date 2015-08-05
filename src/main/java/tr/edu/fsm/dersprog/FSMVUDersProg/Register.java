package tr.edu.fsm.dersprog.FSMVUDersProg;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Session;

@ManagedBean
@SessionScoped
public class Register {
	
	Session session = HibernateUtil.getSessionFactory().openSession();
	
	private String uname;
	private String password;

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void kaydet(){
		Users userInfo = new Users();
		userInfo.setUname(uname);
		userInfo.setPassword(password);
		session.beginTransaction();
		session.save(userInfo);
		session.getTransaction().commit();
		session.close();
	}
}
