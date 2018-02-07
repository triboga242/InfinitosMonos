package mono;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Para facilitar la tarea al mono he obviado los signos de puntuacion en general, tambien he pensado en darle una probabilidad 
 * de aparicion a cada letra como las que tiene el quijote, pero entonces daria prioridad al español frente al resto de idiomas, 
 * y al tratarse de probabilidad, cuantas mas opciones se recojan mejor, asi que simplemente le he dado mas probabilidad al espacio por encima del resto
 * y a la 'e' que si que le he dado un poco mas de probabilidad que es de mayor frecuencia en la mayoria de idiomas, y la 'ñ' tambien la he obviado,
 * a la hora de analizar el texto la 'n' valdría como 'ñ'
 * 
 */
public class Mono {

	public static String caracter = "";
	public static String libro;

	public static void escribe() {
		BufferedWriter w = null;
		int cont = 0;
		float caps = 1f;
		while (true) {
			cont++;
			int letterval = (int) Math.floor(Math.random() * (0 - 40 + 1) + 40);

			if (letterval == 0 || letterval >= 27)
				caracter = " ";
			else if (letterval == 1)
				caracter = "A";
			else if (letterval == 2)
				caracter = "B";
			else if (letterval == 3)
				caracter = "C";
			else if (letterval == 4)
				caracter = "D";
			else if (letterval == 5 && letterval == 27)
				caracter = "E";
			else if (letterval == 6)
				caracter = "F";
			else if (letterval == 7)
				caracter = "G";
			else if (letterval == 8)
				caracter = "H";
			else if (letterval == 9)
				caracter = "I";
			else if (letterval == 10)
				caracter = "J";
			else if (letterval == 11)
				caracter = "K";
			else if (letterval == 12)
				caracter = "L";
			else if (letterval == 13)
				caracter = "M";
			else if (letterval == 14)
				caracter = "N";
			else if (letterval == 15)
				caracter = "O";
			else if (letterval == 16)
				caracter = "P";
			else if (letterval == 17)
				caracter = "Q";
			else if (letterval == 18)
				caracter = "R";
			else if (letterval == 19)
				caracter = "S";
			else if (letterval == 20)
				caracter = "T";
			else if (letterval == 21)
				caracter = "U";
			else if (letterval == 22)
				caracter = "V";
			else if (letterval == 23)
				caracter = "W";
			else if (letterval == 24)
				caracter = "X";
			else if (letterval == 25)
				caracter = "Y";
			else if (letterval == 26)
				caracter = "Z";

			if (cont % 100 == 0) {
				System.out.println(caracter);
				libro += caracter + "\n";
			} else {
				System.out.print(caracter);
				libro += caracter;
			}
			if (cont == 100000) {
				cont = 0;

				String nombre = "Capitulo_" + (caps);
				try {
					w = new BufferedWriter(new FileWriter(nombre + ".txt", true));
					w.write(libro);
					libro = "";
					w.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				caps++;
			}
		}
	}
}
