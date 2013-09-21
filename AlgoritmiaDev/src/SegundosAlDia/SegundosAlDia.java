package SegundosAlDia;

public class SegundosAlDia {
	
	private int dias;
	
	public void inicializar(int pDias){
		
		dias = pDias;
			
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}
	
	public int calcularSegundos(){
		return dias * 86400; 	
	}

}
