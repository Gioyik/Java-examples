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

	public int getAmigo1() {
		return amigo1;
	}

	public void setAmigo1(int amigo1) {
		this.amigo1 = amigo1;
	}
	
	public int getAmigo2() {
		return amigo2;
	}

	public void setAmigo2(int amigo2) {
		this.amigo2 = amigo2;
	}
	
	public int getAmigo3() {
		return amigo3;
	}

	public void setAmigo3(int amigo3) {
		this.amigo3 = amigo3;
	}
	
	public int calcularPromedioEdades(){
		return (amigo1 + amigo2+ amigo3) / 3; 	
	}

}
