package beans;

import java.util.HashSet;
import java.util.Set;

import javax.ejb.Stateful;

@Stateful
public class VisitasBean {

	private Set<String> listaVisitantes = new HashSet<String>();

	/**
	 * Metodo que recebe o novo visitante e adiciona a lista
	 * 
	 * @param visitante
	 */
	public void cadastrarVisitante(String visitante) {
		listaVisitantes.add(visitante);
	}

	/**
	 * Getter e Setter
	 */
	public Set<String> getListaVisitantes() {
		return listaVisitantes;
	}

	public void setListaVisitantes(Set<String> listaVisitantes) {
		this.listaVisitantes = listaVisitantes;
	}

}
