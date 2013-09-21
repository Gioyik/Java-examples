package NotasAlumno;

public class NotasAlumno {
	
	private String nombrealumno1;
	private int notaalumno1;
	private int notaalumno2;
	private int notaalumno3;
	
	public void inicializar(int pNAlumno1, int pNAlumno2, int pNAlumno3, String pNombrealumno){
		
		nombrealumno1 = pNombrealumno;
		notaalumno1 = pNAlumno1;
		notaalumno2 = pNAlumno2;
		notaalumno3 = pNAlumno3;
			
	}

	
	
	public String getNombrealumno1() {
		return nombrealumno1;
	}

	public void setNombrealumno1(String nombrealumno1) {
		this.nombrealumno1 = nombrealumno1;
	}

	public int getNotaalumno1() {
		return notaalumno1;
	}

	public void setNotaalumno1(int notaalumno1) {
		this.notaalumno1 = notaalumno1;
	}

	public int getNotaalumno2() {
		return notaalumno2;
	}

	public void setNotaalumno2(int notaalumno2) {
		this.notaalumno2 = notaalumno2;
	}

	public int getNotaalumno3() {
		return notaalumno3;
	}

	public void setNotaalumno3(int notaalumno3) {
		this.notaalumno3 = notaalumno3;
	}

	public int calcularPorcentagePrimeraNota(){
		return notaalumno1 * 15/100; 	
	}
	
	public int calcularPorcentageSegundaNota(){
		return notaalumno2 * 20/100; 	
	}
	
	public int calcularPorcentageTerceraNota(){
		return notaalumno3 * 15/100; 	
	}
	
	public int calcularNotaPrimerCorte(){
		return (calcularPorcentagePrimeraNota() + calcularPorcentageSegundaNota() + calcularPorcentageTerceraNota()); 	
	}

}
