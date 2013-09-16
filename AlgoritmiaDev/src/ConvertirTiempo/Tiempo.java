package ConvertirTiempo;

public class Tiempo {

	private int minutos;
	
	public void inicializar(int pMinutos){
		
		minutos = pMinutos;
			
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public int calcularMinutos(){
		return minutos % 60; 	
	}
	
	public int calcularHoras(){
		return minutos / 60; 	
	}
}
