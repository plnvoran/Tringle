package Tringle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tringle {

	static Scanner scanner = new Scanner(System.in);
	static public List<String> tringle = new ArrayList<String>();
	static public List<Integer> tringleInt = new ArrayList<Integer>();
	public static boolean isValid;
	public static String result="ОК";
	

	public static void validateInput() {
		int side;

		for (String t : tringle) {
			try {

				side = Integer.parseInt(t);

				if (side <= 0) {
					throw new NumberFormatException();				
			
				}

				else {
					tringleInt.add(side);
					isValid = true;
				}

			} catch (NumberFormatException e) {
				tringleInt.add(0);
				isValid = false;
				result="Ошибка!";
				break;

			}
		}

	}

	public static void inputSides() {

		for (int i = 1; i < 4; i++) {
			System.out.println("Input side " + i + ":");
			tringle.add(scanner.nextLine());
		}

	}

	public static void calculateStatus() {
		if (tringleInt.get(0) == tringleInt.get(1) && tringleInt.get(0) == tringleInt.get(2)) {
			result = "Равностор";
		} else if (tringleInt.get(0) != tringleInt.get(1) && tringleInt.get(0) != tringleInt.get(2)
				&& tringleInt.get(1) != tringleInt.get(2)) {
			result = "Разностор";
		} else {
			result = "Равнобедр";
		}


	}

	

}
