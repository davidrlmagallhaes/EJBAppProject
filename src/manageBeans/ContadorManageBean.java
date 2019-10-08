package manageBeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import beans.ContadorBean;

@ManagedBean
@SessionScoped
public class ContadorManageBean {

	@EJB
	ContadorBean contadorBean;

	public void incrementar() {
		contadorBean.incrementar();
	}

	public int getContador() {
		return contadorBean.getContador();
	}
}
