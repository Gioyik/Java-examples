package CalcularIVA;

import javax.swing.JOptionPane;

import CalcularIVA.IVA;

/*Archivo de interfaz*/
public class InterfazIVA {

	public static void main(String[] args) {
		
		IVA emp = new IVA();
		int pItems, pCompra, pDinero;
		
		pItems = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos comprados: "));
		pCompra = Integer.parseInt(JOptionPane.showInputDialog("Valor de los productos comprados: "));
		pDinero = Integer.parseInt(JOptionPane.showInputDialog("Dinero recibido del cliente: "));
		
		emp.inicializar(pItems, pCompra, pDinero);
		
        emp.calcularValorCompra();
        emp.calcularIVA();
        emp.calcularCambio();
        
        JOptionPane.showMessageDialog(null,"Productos comprados: " + emp.getItems() + "\nValor de la compra: " + emp.calcularValorCompra() + "\nIVA de la compra: " + emp.calcularIVA() + "\nCambio para el cliente: " + emp.calcularCambio(),"Caja",JOptionPane.INFORMATION_MESSAGE);

	}

}
