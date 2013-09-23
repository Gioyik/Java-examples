package Terpel;

public class Terpel {

		private double numeroDeGalones;
		
	public void inicializar(double pNumeroDeGalones){
	
	numeroDeGalones  = pNumeroDeGalones;
	}
	
	public double calcularNumeroDeGalones(){
		return numeroDeGalones*(3.785);
		
	}
	public double calcularPrecio(){
		return calcularNumeroDeGalones()*1025;
	}


}

