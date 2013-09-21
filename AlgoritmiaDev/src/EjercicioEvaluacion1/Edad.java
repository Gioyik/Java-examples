package EjercicioEvaluacion1;

public class Edad {
	
	private int amigo1;
	private int amigo2;
	private int amigo3;
	
	public void inicializar(int pAmigo1, int pAmigo2, int pAmigo3){
		
		amigo1 = pAmigo1;
		amigo2 = pAmigo2;
		amigo3 = pAmigo3;
			
	}
	
	public int calcularPromedioEdades(){
		return (amigo1 + amigo2+ amigo3) / 3; 	
	}

}
