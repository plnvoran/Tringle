package Game;

import java.util.Scanner;

import Tringle.Tringle;

public class Game {


	
	public static void main(String[] args) {

		Tringle.inputSides();
		Tringle.validateInput();

		if (Tringle.isValid==true) {

			Tringle.calculateStatus();
			
		}

		System.out.println(Tringle.result);
	}

}
