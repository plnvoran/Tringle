package Tests;


public class PrintTestData {

	public void printTestData(String[][] arr, int i) {
		
		for (i = 0; i < 64; i++) {

			System.out.print(arr[i][0]);
			System.out.print(arr[i][1]);
			System.out.println(arr[i][2]);

		}
	}

}
