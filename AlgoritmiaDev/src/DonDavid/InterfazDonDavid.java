package DonDavid;

import javax.swing.JOptionPane;

import DonDavid.DonDavid;

public class InterfazDonDavid {

	public static void main(String[] args) {
		
		DonDavid don = new DonDavid();
		int pDolares, pValorDolares;
		
		pDolares = Integer.parseInt(JOptionPane.showInputDialog("Cuantos dolares posee: "));
		pValorDolares = Integer.parseInt(JOptionPane.showInputDialog("Valor en peso del dolar: "));
		
		don.inicializar(pDolares, pValorDolares);
		
        don.calcularPesos();
        
        JOptionPane.showMessageDialog(null,don.getDolares()+" equivalen a "+ don.calcularPesos()+ " pesos.","Conversora de moneda",JOptionPane.INFORMATION_MESSAGE);
	
	}

}
