package co.simplon;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Donnez moi votre nom, SVP");
		String answer = in.nextLine();
		
		String line1 = "#########";
		String line2 = "##       ";
		String line3 = "##       ";
		String line4 = "##       ";
		String line5 = "#########";
		
		
		int lineLength = answer.length() + 6;
		for (int i = 0; i < lineLength; i++) {
			line1 += "#";
			line2 += " ";
			line4 += " ";
			line5 += "#";

		}
		line1 += "#########";
		line2 += "       ##";
		line4 += "       ##";
		line5 += "#########";
		line3 += "Hello " + answer + "       ##";
		
		//Affichage des lignes
		
		System.out.println(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5);
		
	in.close();	
	}

}
