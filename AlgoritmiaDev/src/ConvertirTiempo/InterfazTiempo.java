package ConvertirTiempo;

import javax.swing.JOptionPane;

import ConvertirTiempo.Tiempo;

/*Archivo de interfaz*/
public class InterfazTiempo {

	public static void main(String[] args) {
		
		
		Tiempo emp = new Tiempo();
		int pMinutos;
		
		pMinutos = Integer.parseInt(JOptionPane.showInputDialog("Insertar minutos a convertir: "));
		
		emp.inicializar(pMinutos);
		
        emp.calcularMinutos();
        emp.calcularHoras();		
        
        JOptionPane.showMessageDialog(null,emp.getMinutos()+" equivalen a "+ emp.calcularHoras()+ " horas y a " + emp.calcularMinutos() + " minutos.","Calculadora de tiempo",JOptionPane.INFORMATION_MESSAGE);

	}

}

