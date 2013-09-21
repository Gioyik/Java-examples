package EjercicioEvaluacion2;

import javax.swing.JOptionPane;

import EjercicioEvaluacion2.Separar;

public class InterfazSeparar {
    public static void main ( String args[] ) {
     
    	
     Separar emp = new Separar();
     int pNumero;
     
     pNumero = Integer.parseInt(JOptionPane.showInputDialog("Numero a separar: "));
     
     emp.inicializar(pNumero);
     
     emp.calcularPrimerNumero();
     
     JOptionPane.showMessageDialog(null,"El numero separado quedo asi: "+ emp.calcularPrimerNumero()+"   "+emp.calcularSegundoNumero()+"   "+emp.calcularTercerNumero()+"   "+emp.calcularCuartoNumero(),"Separadora de numeros",JOptionPane.INFORMATION_MESSAGE);

    }
}
