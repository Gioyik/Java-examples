package Equivalente;

public class Equivalente {

	private int segundos;
	
	public void inicializar(int pSegundos){
		segundos = pSegundos;
		
	}
	
	public int calcularMinutos(){
		return segundos%60;
		
	}

	public int calcularSegundos(){
		return segundos/60; 
	}
}
