package CalcularIVA;

public class IVA {

	private int items, compra, dinero;
	
	public void inicializar( int pCompra, int pItems, int pDinero){
		
		items = pItems;
		compra = pCompra;
		dinero = pDinero;
			
	}
	
	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}
	
	public int getCompra() {
		return compra;
	}

	public void setCompra(int compra) {
		this.compra = compra;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	
	public int calcularValorCompra(){
		return items * compra;
	}
	
	public int calcularIVA(){
		return calcularValorCompra() * 16/100; 	
	}
	
	public int calcularCambio(){
		return dinero - calcularValorCompra(); 	
	}
}

