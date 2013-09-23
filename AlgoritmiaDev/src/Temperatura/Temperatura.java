package Temperatura;

public class Temperatura {

	private int celsius;
	
	
	public void inicializar(int pCelsius){
	
		celsius = pCelsius;
	}

    public int calcularTemperatura(){
    	return (celsius*9/5)+32;
    	    }
}
