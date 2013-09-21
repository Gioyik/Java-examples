package EjercicioEvaluacion2;

public class Separar {
	
     int numero;
     
	public void inicializar(int pNumero){
		
		numero = pNumero;
			
	}
    
	public int calcularPrimerNumero(){
		return (numero / 1000) %10;
	}
	
	public int calcularSegundoNumero(){
		return (numero / 100) %10;
	}
	
	public int calcularTercerNumero(){
		return (numero / 10) %10;
	}
	
	public int calcularCuartoNumero(){
		return numero % 10;
	}

}
