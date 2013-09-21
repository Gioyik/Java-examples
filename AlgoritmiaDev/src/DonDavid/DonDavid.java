package DonDavid;

public class DonDavid {
	
	private int dolares;
	private int valordolares;
	
	public void inicializar(int pDolares, int pValorDolares){
		
		dolares = pDolares;
		valordolares = pValorDolares;
			
	}

	public int getDolares() {
		return dolares;
	}

	public void setDolares(int dolares) {
		this.dolares = dolares;
	}
	
	public int calcularPesos(){
		return dolares * valordolares; 	
	}
	
}
