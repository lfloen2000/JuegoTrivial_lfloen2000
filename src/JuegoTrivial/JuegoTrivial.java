package JuegoTrivial;

import javax.swing.JOptionPane;

public class JuegoTrivial { 

public static void main(String[] args) {
	System.out.println("\n"
			+ "  ____  _                           _     _   ____       \n"
			+ " | __ )(_) ___ _ ____   _____ _ __ (_) __| | / __ \\ ___  \n"
			+ " |  _ \\| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ / _` / __| \n"
			+ " | |_) | |  __/ | | \\ V /  __/ | | | | (_| | | (_| \\__ \\ \n"
			+ " |____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\ \\__,_|___/ \n"
			+ "                                             \\____/      \n"
			+ "");
	System.out.println("\n"
			+ "  _____ ____  _____     _____    _    _        ____    _    __  __ _____ \n"
			+ " |_   _|  _ \\|_ _\\ \\   / /_ _|  / \\  | |      / ___|  / \\  |  \\/  | ____|\n"
			+ "   | | | |_) || | \\ \\ / / | |  / _ \\ | |     | |  _  / _ \\ | |\\/| |  _|  \n"
			+ "   | | |  _ < | |  \\ V /  | | / ___ \\| |___  | |_| |/ ___ \\| |  | | |___ \n"
			+ "   |_| |_| \\_\\___|  \\_/  |___/_/   \\_\\_____|  \\____/_/   \\_\\_|  |_|_____|\n"
			+ "                                                                         \n"
			+ "");
	
	int puntuacion = 0;
	System.out.println("1.- ¿Cuál de las siguientes afirmaciones es incorrecta en relación al concepto de informática?");
	System.out.println("a) En Latinoamérica, se utiliza como sinónimo la palabra computación, que proviene de cómputo (o cálculo).");
	System.out.println("b) La informática es la ciencia que estudia el tratamiento automático de la información por medio de computadoras.");
	System.out.println("c) La palabra «informática» del inglés informatique, derivado de la contracción de las palabras information y automatique, para dar idea de la automatización de la información");
	System.out.println("d) Todas las afirmaciones anteriores son correctas");
	int num1;
	int num2 = 3; 
	
	String str = JOptionPane.showInputDialog("Introduce el número de la respuesta: ");
	num1 = Integer.parseInt(str);
	
	if (num1==num2){
		System.out.println("Acierto");
		puntuacion += 10;
	}
	else {
		System.out.println("Error");
		puntuacion += -5;
	}
	
	
	
	System.out.println("2.- En el origen de la programación están las tarjetas perforadas utilizadas en el siglo XIX en ...");
	System.out.println("a) La información estadística");
	System.out.println("b) La industria textil");
	System.out.println("c) Los censos de población de Estados Unidos");
	System.out.println("d) El desarrollo del ferrocarril");
	
	int num3;
	int num4 = 2; 
	
	String str1 = JOptionPane.showInputDialog("Introduce el número de la respuesta: ");
	num3 = Integer.parseInt(str1);
	
	if (num3==num4){
		System.out.println("Acierto");
		puntuacion += 10;
	}
	else {
		System.out.println("Error");
		puntuacion += -5;
	}
	
	
	System.out.println("3.- La parte esencial de dicho sistema operativo era el intérprete de comandos Hablamos de ...");
	System.out.println("a) Windows");
	System.out.println("b) Pc Shell");
	System.out.println("c) Linux");
	System.out.println("d) MS-DOS");
	
	int num5;
	int num6 = 4; 
	
	String str2 = JOptionPane.showInputDialog("Introduce el número de la respuesta: ");
	num5 = Integer.parseInt(str2);
	
	if (num5==num6){
		System.out.println("Acierto");
		puntuacion += 10;
	}
	else {
		System.out.println("Error");
		puntuacion += -5;
	}
	
	
	System.out.println("4.- Hardware dentro de un ordenador u otros dispositivos programables, que interpreta las instrucciones de un programa informático mediante la realización de las operaciones básicas aritméticas, lógicas y de entrada/salida del sistema.");
	System.out.println("a) CPU");
	System.out.println("b) Chip");
	System.out.println("c) Bios");
	System.out.println("d) Memoria");
	
	int num7;
	int num8 = 1; 
	
	String str3 = JOptionPane.showInputDialog("Introduce el número de la respuesta: ");
	num7 = Integer.parseInt(str3);
	
	if (num7==num8){
		System.out.println("Acierto");
		puntuacion += 10;
	}
	else {
		System.out.println("Error");
		puntuacion += -5;
	}
	
	
	
	System.out.println("5.- Recientemente las Tecnologías de la Información y la Comunicación (TIC), están revolucionando especialmente al sector ...");
	System.out.println("a) Industrial");
	System.out.println("b) Educativo");
	System.out.println("c) De la robótica");
	System.out.println("d) Armamentístico");
	
	int num9;
	int num10 = 2; 
	
	String str4 = JOptionPane.showInputDialog("Introduce el número de la respuesta: ");
	num9 = Integer.parseInt(str4);
	
	if (num9==num10){
		System.out.println("Acierto");
		puntuacion += 10;
	}
	else {
		System.out.println("Error");
		puntuacion += -5;
	}
	
	
	System.out.println("6.- Sistema digital que transfiere datos entre los componentes de una computadora o entre varias computadoras. Está formado por cables o pistas en un circuito impreso, dispositivos como resistores y condensadores además de circuitos integrados.");
	System.out.println("a) Sistema Operativo");
	System.out.println("b) Chip");
	System.out.println("c) Bus");
	System.out.println("d) Zócalo");
	
	int num11;
	int num12 = 3; 
	
	String str5 = JOptionPane.showInputDialog("Introduce el número de la respuesta: ");
	num11 = Integer.parseInt(str5);
	
	if (num11==num12){
		System.out.println("Acierto");
		puntuacion += 10;
	}
	else {
		System.out.println("Error");
		puntuacion += -5;
	}
	
	
	System.out.println("7.- La icónica red social de mensajes cortos, Twitter, ha anunciado que aumentará el límite de los caracteres de los mensajes de la plataforma desde 140 a ...");
	System.out.println("a) 150 caracteres");
	System.out.println("b) 280 caracteres");
	System.out.println("c) 180 caracteres");
	System.out.println("d) 200 caracteres");
	
	int num13;
	int num14 = 2; 
	
	String str6 = JOptionPane.showInputDialog("Introduce el número de la respuesta: ");
	num13 = Integer.parseInt(str6);
	
	if (num13==num14){
		System.out.println("Acierto");
		puntuacion += 10;
	}
	else {
		System.out.println("Error");
		puntuacion += -5;
	}
	
	
	System.out.println("8.- ¿Cuál de los siguientes personajes relevantes de la historia de la informática terminó su formación universitaria?");
	System.out.println("a) Bill Gates");
	System.out.println("b) Steve Jobs");
	System.out.println("c) Mark Zuckerberg");
	System.out.println("d) Ninguno de ellos");
	
	int num15;
	int num16 = 4; 
	
	String str7 = JOptionPane.showInputDialog("Introduce el número de la respuesta: ");
	num15 = Integer.parseInt(str7);
	
	if (num15==num16){
		System.out.println("Acierto");
		puntuacion += 10;
	}
	else {
		System.out.println("Error");
		puntuacion += -5;
	}
	
	
	System.out.println("9.- ¿Cuál de las siguientes asociaciones es indebida?");
	System.out.println("a) Bill Gates con Windows");
	System.out.println("b) Steve Jobs con Apple");
	System.out.println("c) Mark Zuckerberg con Google");
	System.out.println("d) Todas las asociaciones son debidas o correctas");
	
	int num17;
	int num18 = 3; 
	
	String str8 = JOptionPane.showInputDialog("Introduce el número de la respuesta: ");
	num17 = Integer.parseInt(str8);
	
	if (num17==num18){
		System.out.println("Acierto");
		puntuacion += 10;
	}
	else {
		System.out.println("Error");
		puntuacion += -5;
	}
	
	
	System.out.println("10.- Las primeras computadoras, comúnmente denominadas Computadora Personal o PC aparecen en la década de ...");
	System.out.println("a) Los ochenta");
	System.out.println("b) Los cincuenta");
	System.out.println("c) Los setenta");
	System.out.println("d) Los noventa");
	
	int num19;
	int num20 = 1; 
	
	String str9 = JOptionPane.showInputDialog("Introduce el número de la respuesta: ");
	num19 = Integer.parseInt(str9);
	
	if (num19==num20){
		System.out.println("Acierto");
		puntuacion += 10;
	}
	else {
		System.out.println("Error");
		puntuacion += -5;
	}
	
	System.out.println(puntuacion);
	
}
}


