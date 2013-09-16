package Atributos;

public class Atributos {
	
	private int celular;
	private String factura;
	private int fecha;
	private String pelicula;
	private String Tablet;
	private String Vehiculo;
	
	public void inicializar(int pCelular, String pFactura, String pEmail, char pGenero, int pHorasTrabajo, double pValorHora){
		
		cedula = pCedula;
		nombre = pNombre;
		genero = pGenero;
		email = pEmail;
		horasTrabajo = pHorasTrabajo;
		valorHora = pValorHora;
			
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getHorasTrabajo() {
		return horasTrabajo;
	}

	public void setHorasTrabajo(int horasTrabajo) {
		this.horasTrabajo = horasTrabajo;
	}

	public double getValorHora() {
		return valorHora;
	}
}
