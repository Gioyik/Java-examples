package Multisiempre;
import Multisiempre.Multisiempre;
import javax.swing.*;
public class InterfazMultisiempre {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multisiempre mtc = new Multisiempre();
		int pDinero;
		int pValorArticulo;
		int pCantidadArticulo;
		
		pDinero =  Integer.parseInt(JOptionPane.showInputDialog("DINERO DEL CLIENTE"));
		pValorArticulo = Integer.parseInt(JOptionPane.showInputDialog("VALOR ARTICULO"));
		pCantidadArticulo = Integer.parseInt(JOptionPane.showInputDialog("CANTIDAD ARTICULO"));
		
		mtc.inicializar(pDinero, pValorArticulo, pCantidadArticulo);
		mtc.calcularCambio();
		
		JOptionPane.showMessageDialog(null,"EL CAMBIO DEL CLIENTE ES"+ mtc.calcularCambio(),"CAJA",JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}
