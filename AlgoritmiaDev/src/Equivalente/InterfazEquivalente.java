package Equivalente;
import Equivalente.Equivalente;
import javax.swing.*;
public class InterfazEquivalente {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		Equivalente eqv = new Equivalente();
		int pSegundos;
		
		pSegundos = Integer.parseInt(JOptionPane.showInputDialog("INGRESAR SEGUNDOS"));
		
		eqv.calcularMinutos();
		eqv.calcularSegundos();
		eqv.inicializar(pSegundos);
		
		
		JOptionPane.showMessageDialog(null,"EL NUMERO EN MINUTOS ES: "+ eqv.calcularMinutos()+" Y EN SEGUNDO ES: "+ eqv.calcularSegundos(),"CONVERSION", JOptionPane.INFORMATION_MESSAGE);
		
			
			
			
	}

}
