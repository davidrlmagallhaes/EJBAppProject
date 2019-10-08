package manageBeans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import beans.VisitasBean;

@ManagedBean
@SessionScoped
public class VisitasManageBean {

	/**
	 * Inject
	 */
	@EJB
	VisitasBean visitasBean;

	/*
	 * Variavais
	 */
	private String visitante;

	/**
	 * metodo que sera chamado no property binding
	 */
	public void cadastrarVisitante() {
		visitasBean.cadastrarVisitante(visitante);
	}


	public List<String> getVisitas() {
		return new ArrayList<String>(visitasBean.getListaVisitantes());
	}

	
	// Getter e Setter
	public String getVisitante() {
		return visitante;
	}

	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}

}
