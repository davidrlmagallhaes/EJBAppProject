package beans;

import javax.ejb.Local;
import javax.ejb.Singleton;

@Singleton
@Local
public class ContadorBean {

	int contador;

	public void incrementar() {
		contador++;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

}
