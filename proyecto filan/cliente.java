package ejercicio3;

public class cliente {

	private String dni;
	private String nombre;
	private String apellido;
	private int telefono;
	private String direccion;
	private String vehiculos;
	private String id_cliente;
	
	
	
	public cliente(String nie, String nomb, String apell, int tlfno, 
			String direc, String vehi , String id_client) {
		dni=nie;
		nombre=nomb;
		apellido=apell;
		telefono=tlfno;
		direccion=direc;
		vehiculos=vehi;
		id_cliente=id_client;		
	}
	
	public String getdni() {
		return dni;
		}
	
	public String getnombre() {
		return nombre;
	}
	
	public String  getapellido() {
		return apellido;
		}
	
	public int gettelefono(){
		return telefono;
	}
	
	public String getdireccion(){
		return direccion;
	}
	public String getvehiculo(){
		return vehiculos;
	}
	
	public String getid(){
		return id_cliente;
	}

	public void setdni(String nie) {
		dni=nie;
	}
	
	public void setnombre(String nomb) {
		nombre=nomb;
	}
	
	public void setapellido(String apell) {
		apellido=apell;
	}
	
	public void settelefono(int tlfno) {
		telefono=tlfno;
	}
	
	public void setdireccion(String direc) {
		direccion=direc;
	}
	
	public void setvehiculo(String vehi) {
		vehiculos=vehi;
	}
	public void setid(String id_client) {
		id_cliente=id_client;
	}
	
	
	public String toString()
	{
		return "Ficha del cliente \n"
				+"DNI:  "+getdni()+"\n"
				+"Nombre: "+ getnombre()+"\n"
				+"Apellido: "+getapellido()+"\n" 
				+"Telefono :"+gettelefono()+"\n"
				+"Direccion :"+getdireccion()+"\n"
				+"Vehiculo :"+getvehiculo()+"\n"
				+"ID_Cliente :"+getid()+"\n";	
	
	}
	
	
	
	
	
	
	
	
}
