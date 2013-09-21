package NotasAlumno;

import javax.swing.JOptionPane;

import NotasAlumno.NotasAlumno;

public class InterfazNotasAlumno {

	public static void main(String[] args) {
		
		NotasAlumno not = new NotasAlumno();
		String pNombrealumno;
		int pNAlumno1, pNAlumno2, pNAlumno3;
		
		pNombrealumno = JOptionPane.showInputDialog("Nombre del Alumno: ");
		pNAlumno1= Integer.parseInt(JOptionPane.showInputDialog("Primera nota: "));
		pNAlumno2= Integer.parseInt(JOptionPane.showInputDialog("Segunda nota: "));
		pNAlumno3= Integer.parseInt(JOptionPane.showInputDialog("Tercera nota: "));
		
		not.inicializar(pNAlumno1, pNAlumno2, pNAlumno3, pNombrealumno);
		
        not.calcularNotaPrimerCorte();
		
        JOptionPane.showMessageDialog(null,"El nombre del alumno es "+ not.getNombrealumno1() + ", y la nota promedio para el primer corte (50%) es: " + not.calcularPorcentagePrimeraNota(),"Calculadora de notas promedio primer corte",JOptionPane.INFORMATION_MESSAGE);
        

	}

}
