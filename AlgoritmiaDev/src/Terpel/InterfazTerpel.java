package Terpel;
import Terpel.Terpel;
import javax.swing.*;
public class InterfazTerpel {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Terpel tpl = new Terpel();
		double pNumeroDeGalones;
		
		pNumeroDeGalones = Double.parseDouble(JOptionPane.showInputDialog("INGRESE NUMERO DE GALONES"));
		
		tpl.calcularNumeroDeGalones();
		tpl.calcularPrecio();	
		tpl.inicializar(pNumeroDeGalones);
		
		JOptionPane.showMessageDialog(null, "EL PRECIO ES: "+ tpl.calcularPrecio(),"VALOR", JOptionPane.INFORMATION_MESSAGE);
		
		
		
	}

}
