package ejercicio3;

public class vehiculo {

	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private String n_bastidor;
	private String motor;
	private String combustible;
	
	
	public vehiculo(String marc, String mode , String col,
			String matricu, String n_bast , String mot  , String combus){
}
	public String getmarca() {
		return marca;
	}
	
	public String getmodelo() {
		return modelo;
	}
	
	public String  getcolor() {
		return color;
	}
	
	public String getmatricula() {
		return matricula;
	}
	
	public String getbastidor() {
		return n_bastidor;
	}
	
	public String getmotor() {
		return motor;
	}
	
	public String getcombustible() {
		return combustible;
	}
	
	public void setmarca(String marc) {
		marca=marc;
	}
	
	public void setmodelo(String mode) {
		modelo=mode;
	}
	
	public void setcolor( String col) {
		color=col;
	}
	
	public void setmatricula(String matricu) {
		matricula=matricu;
	}
	
	public void setbastidor(String basti) {
		n_bastidor=basti;
	}
	
	public void setmotor(String mot) {
		motor=mot;
	}
	
	public void setcombustible(String combus) {
		combustible=combus;
	}

	public String toString()
	{
		return "Ficha del cliente \n"
				+"Marca del coche:  "+getmarca()+"\n"
				+"Modelo del vehiculo: "+ getmodelo()+"\n"
				+"Color  : "+getcolor()+"\n" 
				+"Matricula :"+getmatricula()+"\n"
				+"Nº Bastidor :"+getbastidor()+"\n"
				+"Tipo de motor   :"+getmotor()+"\n"
				+"Tipo de Combustible :"+getcombustible()+"\n";	
	
	}
	
	
	
	
	
	
}