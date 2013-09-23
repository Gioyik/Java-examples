package Radio;

public class Radio {

private double radio;

public void inicializar(double pRadio){
	
	radio = pRadio;
	
}

public double calcularArea(){
	return (4*(3.1416))*(radio*radio);
}

public double calcularVolumen(){
	return 4/3*(3.1416)*(radio*radio*radio);
}





}
