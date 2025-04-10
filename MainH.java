import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Prueba {

	public static void main(String[] args) throws IOException {
		Diario dir=new Diario();
		
		entradaNueva(dir);
		mostrarEntrada(dir);
		
	}

    private static void rellenarDiario(Diario dir) throws IOException {
		BufferedReader lector=new BufferedReader(new InputStreamReader(System.in));
		String activ,herr,dific;
		boolean bool=false;
		do {
			bool=true;
			System.out.println("Introduce Actividad");
			activ=lector.readLine();
			System.out.println("Introduce Herramientas");
			herr=lector.readLine();
			System.out.println("Introduce Dificultades");
			dific=lector.readLine();
			if(activ.isEmpty() || herr.isEmpty() || dific.isEmpty()) {
				bool=false;
				System.out.println("Vuelve a introducir los datos de manera correcta");
			}
			
		}while(bool==false);
		dir.setActividades(activ);
		dir.setHerramientas(herr);
		dir.setDificultdes(dific);
		dir.setFechaCambio();
	}
}