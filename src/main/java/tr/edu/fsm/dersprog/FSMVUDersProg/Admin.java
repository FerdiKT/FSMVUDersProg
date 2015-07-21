package tr.edu.fsm.dersprog.FSMVUDersProg;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Admin {
	public String takvim(){
		return "takvim";
	}
}
