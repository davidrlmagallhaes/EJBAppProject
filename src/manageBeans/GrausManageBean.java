package manageBeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import beans.GrausBean;

@ManagedBean
public class GrausManageBean {

	@EJB
	GrausBean grausBeans;

	double c;
	double resultado;

	public void converterParaFahrenheit() {
		this.resultado = this.grausBeans.conveterParaFahrenheit(c);
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

}
