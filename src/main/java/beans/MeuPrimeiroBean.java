package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="x")
public class MeuPrimeiroBean {
	
	private String ola = "my egg";

	public String getOla() {
		return ola;
	}

	public void setOla(String ola) {
		this.ola = ola;
	}
	
}
