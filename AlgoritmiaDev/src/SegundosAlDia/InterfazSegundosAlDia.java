package SegundosAlDia;

import javax.swing.JOptionPane;
import SegundosAlDia.SegundosAlDia;

public class InterfazSegundosAlDia {

	public static void main(String[] args) {
		
		SegundosAlDia lol = new SegundosAlDia();
		int pDias;
		
		pDias = Integer.parseInt(JOptionPane.showInputDialog("Insertar dias a convertir: "));
		
		lol.inicializar(pDias);
		
        lol.calcularSegundos();
        
        JOptionPane.showMessageDialog(null,lol.getDias()+" equivalen a "+ lol.calcularSegundos()+ " segundos.","Calculadora de dias en segundos",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
