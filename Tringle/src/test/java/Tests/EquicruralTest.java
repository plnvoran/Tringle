package Tests;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Tringle.Tringle;

public class EquicruralTest {
	
	@DataProvider(name = "EquicruralTestData")
	public String[][] generatorForTwoSides() {

		String[][] arr = new String[3][3];

		arr[0][0] = "2";
		arr[0][1] = "2";
		arr[0][2] = "1";

		arr[1][0] = "2";
		arr[1][1] = "1";
		arr[1][2] = "2";

		arr[2][0] = "1";
		arr[2][1] = "2";
		arr[2][2] = "2";

		return arr;

	}

	@Test(dataProvider = "EquicruralTestData")
	public void testForTwoSides(String first, String second, String third) {

		Tringle.tringle.add(first);
		Tringle.tringle.add(second);
		Tringle.tringle.add(third);
		
		Tringle.validateInput();
		Tringle.calculateStatus();
		

		Assert.assertEquals(Tringle.result,"Равнобедр");
		
		Tringle.tringleInt.clear();
		Tringle.tringle.clear();

	}
	

}
