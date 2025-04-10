
import java.time.LocalDate;

public class Diario {
	private String Actividades;
	private String dificultdes;
	private String herramientas;
	private LocalDate fechaCambio;

Diario(){
	
}

public String getActividades() {
	return Actividades;
}

public void setActividades(String actividades) {
	Actividades = actividades;
}

public String getDificultdes() {
	return dificultdes;
}

public void setDificultdes(String dificultdes) {
	this.dificultdes = dificultdes;
}

public String getHerramientas() {
	return herramientas;
}

public void setHerramientas(String herramientas) {
	this.herramientas = herramientas;
}

public LocalDate getFechaCambio() {
	return fechaCambio;
}

public void setFechaCambio() {
	fechaCambio =LocalDate.now();
}



}
