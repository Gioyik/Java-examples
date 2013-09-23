package Temperatura;
import Temperatura.Temperatura;
import javax.swing.*;
public class InterfazTemperatura {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		Temperatura tmp = new Temperatura();
		int pCelsius;

	pCelsius = Integer.parseInt(JOptionPane.showInputDialog("INSERTE GRADOS"));
	
	tmp.inicializar(pCelsius);
	tmp.calcularTemperatura();
	
	JOptionPane.showMessageDialog(null, "LOS GRADOS EN FAHRENHEIT SON "+ tmp.calcularTemperatura(),"CONVERSION", JOptionPane.INFORMATION_MESSAGE);	
	
	}

}
