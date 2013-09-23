package Radio;
import Radio.Radio;

import javax.swing.*;
public class InterfazRadio {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Radio r = new Radio();
		double pRadio;
		
		pRadio = Double.parseDouble(JOptionPane.showInputDialog("VALOR DEL RADIO"));
		r.inicializar(pRadio);
		r.calcularArea();
		r.calcularVolumen();
		
		JOptionPane.showMessageDialog(null, "EL AREA DE LA ESFERA ES: "+ r.calcularArea()+ " Y EL VOLUMEN ES: "+ r.calcularVolumen(),"AREA Y RADIO", JOptionPane.INFORMATION_MESSAGE);
		
		
		
		
		
	}

}
