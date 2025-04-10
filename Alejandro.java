 private static void entradaNueva(Diario dir) throws IOException {
		rellenarDiario(dir);
		File fil=new File("Diario.txt");
		FileWriter fw=new FileWriter(fil);
		PrintWriter pw=new PrintWriter(fw);
		pw.println(dir.getFechaCambio().getDayOfMonth()+"-"+dir.getFechaCambio().getMonth()+"-"+dir.getFechaCambio().getYear());
		pw.println(dir.getActividades());
		pw.println(dir.getDificultdes());
		pw.println(dir.getHerramientas());
	
		pw.close();
		fw.close();