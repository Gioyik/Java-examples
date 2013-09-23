package Multisiempre;

public class Multisiempre {

	private int dinero;
	private int valorArticulo;
	private int cantidadArticulo;
	
	public void inicializar(int pDinero, int pValorArticulo, int pCantidadArticulo){
		
		dinero = pDinero;
		valorArticulo = pValorArticulo;
		cantidadArticulo = pCantidadArticulo;
					
	}
	
	public int calcularCambio(){
		return (valorArticulo*cantidadArticulo)- dinero;
		
	}

}
