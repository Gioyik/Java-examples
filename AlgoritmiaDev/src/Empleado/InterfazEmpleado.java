package Empleado;

import javax.swing.JOptionPane;

/*Archivo de interfaz*/
public class InterfazEmpleado {

	public static void main(String[] args) {
		
		/* creacion de un objeto de la clase empleado */
		
		Empleado emp = new Empleado();
		String pCedula,pNombre, pEmail;
		char pGenero;
		int pHorasTrabajo;
		double pValorHora;
		
		
		/* Ingresar datos del empleadoo /*                                                                            */
		
		
		pCedula = JOptionPane.showInputDialog("Cedula del empleado");
		pNombre = JOptionPane.showInputDialog("Nombre del empleado");
		pEmail = JOptionPane.showInputDialog("Email del empleado");
		pGenero = JOptionPane.showInputDialog("Genero (M/F)").charAt(0);
		pHorasTrabajo = Integer.parseInt(JOptionPane.showInputDialog("Horas trabajadas"));
		pValorHora= Double.parseDouble(JOptionPane.showInputDialog("Valor por hora"));
		
		
		/* pasamos los valores a la clase empleado*/
		emp.inicializar(pCedula, pNombre, pEmail, pGenero, pHorasTrabajo, pValorHora);
		
		
		/*calcular salario */
        emp.calcularSalarioNeto();
        emp.calcularAporteEPS();
        emp.calcularBonificacion();
		
        
        JOptionPane.showMessageDialog(null,"Cedula del empleado: "+
        emp.getCedula()+"\nNombre del empleado: "+
        emp.getNombre()+"\nGenero: "+	
        emp.getGenero()+"\nEmail del empleado: "+
        emp.getEmail()+"\nHoras Trabajadas: "+	
        emp.getHorasTrabajo()+"\nValor de las horas trabajadas: "+
        emp.getValorHora()+"\nAporte EPS: "+
        emp.calcularAporteEPS()+"\nBonificacion Adicional: "+
        emp.calcularBonificacion()+"\nSalario neto: "+
        emp.calcularSalarioNeto(),
        "Nomina",
        JOptionPane.INFORMATION_MESSAGE);
        

	}

}
