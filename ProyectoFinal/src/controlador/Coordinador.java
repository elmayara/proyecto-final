package controlador;

import vista.*;

public class Coordinador {
	//private Logica miLogica;
	private VLogin vLogin;
	private VCliente vCliente;
	
	public VLogin getVLogin() {
		return vLogin;
	}
	public void setVLogin(VLogin vLog) {
		vLogin=vLog;
	}
	public void mostrarVLogin(){
		vLogin.setVisible(true);
	}
	public void ocultarVLogin(){
		vLogin.setVisible(false);
	}
	
	public VCliente getVCliente() {
		return vCliente;
	}
	public void setVCliente(VCliente vCli) {
		vCliente=vCli;
	}
	public void mostrarVCliente() {
		vCliente.setVisible(true);
	}
	public void ocultarVCliente() {
		vCliente.setVisible(false);
	}
}
