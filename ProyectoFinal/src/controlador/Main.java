package controlador;
import vista.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Se construyen las clases
		VLogin vLogin=new VLogin();
		VCliente vCliente=new VCliente();
		Coordinador miCoordinador=new Coordinador(); 
				
			// Se establecen relaciones entre las clases a traves del Coordinador
		vLogin.setCoordinador(miCoordinador);
		vCliente.setCoordinador(miCoordinador);
				
				// Se establecen relaciones con coordinador
		miCoordinador.setVLogin(vLogin);
		miCoordinador.setVCliente(vCliente);
				
		vLogin.setVisible(true);
		//vCliente.setVisible(true);
	}

}
