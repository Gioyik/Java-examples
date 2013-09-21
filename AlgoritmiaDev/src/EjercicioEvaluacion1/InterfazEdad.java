package EjercicioEvaluacion1;

import javax.swing.JOptionPane;

import EjercicioEvaluacion1.Edad;

public class InterfazEdad {

		public static void main(String[] args) {
			
			Edad emp = new Edad();
			int pAmigo1, pAmigo2, pAmigo3;
			
			pAmigo1 = Integer.parseInt(JOptionPane.showInputDialog("Edad del primer amigo: "));
			pAmigo2 = Integer.parseInt(JOptionPane.showInputDialog("Edad del segundo amigo: "));
			pAmigo3 = Integer.parseInt(JOptionPane.showInputDialog("Edad del tercer amigo: "));
			
			emp.inicializar(pAmigo1, pAmigo2, pAmigo3);
			
	        emp.calcularPromedioEdades();
			
	        JOptionPane.showMessageDialog(null,"La edad promedio de sus amigos es: "+ emp.calcularPromedioEdades(),"Calculadora de edad promedio",JOptionPane.INFORMATION_MESSAGE);
	        

		}

}
