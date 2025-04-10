import java.io.*;

public class principal {
static BufferedReader lector=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		File f=new File("Usuarios.txt");
		int opc=0;
		do {
		opc=menu();
		switch(opc) {
		case 1:login(f);break;
		case 2:New(f);break;
		}
		}while(opc!=1 && opc!=2);
		
	}

	private static boolean login(File f) throws IOException {
		boolean ok=false;
		if(f.exists()) {
			
			System.out.println("Introduzca su numbre de usuario");
			String user=lector.readLine();
			System.out.println("Introduzca su contraseña");
			String pass=lector.readLine();
			try(BufferedReader br=new BufferedReader(new FileReader(f))){
				String var=br.readLine();
				while(var!=null || ok==false) {
					if(var.equals(user+";"+pass)) {
						System.out.println("acceso concedido");
						ok=true;
						
					}
					var=br.readLine();
				}
				if(ok==false)
					System.out.println("Usuario o contraseña erroneas");
			}
		}
		return ok;
		
	}

	private static void New(File f) throws IOException {
		String user,pass1,pass2;
		System.out.println("Introduzca el nombre de usuario nuevo");
		user=lector.readLine();
		do {
		System.out.println("Introduzca su contraseña");
		pass1=lector.readLine();
		System.out.println("Introduzca otra vez la contraseña");
		pass2=lector.readLine();
		if(!pass1.equals(pass2))
			System.out.println("error las contraseñas deben ser iguales");
		}while(!pass1.equals(pass2));
		System.out.println("Bienvenido "+user);
		try(PrintWriter pw=new PrintWriter(new FileWriter(f,true))){
			pw.println(user+";"+pass1);
		}
		login(f);
	}

	private static int menu() throws NumberFormatException, IOException {
		int x=0;
		do {
			System.out.println("Bienvenido seleccione una opcion para loguearse");
			System.out.println("1. Ya tienes usuario y contraseña");
			System.out.println("2. Crear un usuario y contraseña");
			
			x=Integer.parseInt(lector.readLine());
		}while(x<1 || x>2);
		return x;
	}
	
}
