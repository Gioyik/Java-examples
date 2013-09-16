package Empleado;

public class Empleado {

	/*Declaramos los atributos del empleado*/
	private String cedula;
	private String nombre;
	private String email;
	private char genero;
	private int horasTrabajo;
	private double valorHora;
	
	/*Inicializamos el empleado*/
	public void inicializar(String pCedula, String pNombre, String pEmail, char pGenero, int pHorasTrabajo, double pValorHora){
		
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

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double calcularSalarioN(){
		return horasTrabajo * valorHora; 	
	}
	
	public double calcularAporteEPS(){
		return calcularSalarioN() * 7/100; 	
	}
	
	public double calcularBonificacion(){
		return calcularSalarioN() * 10/100; 	
	}
	
	public double calcularSalarioNeto(){
		return calcularSalarioN() + calcularBonificacion() - calcularAporteEPS(); 	
	}
}