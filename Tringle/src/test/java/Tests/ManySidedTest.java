package Tests;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Tringle.Tringle;

public class ManySidedTest {
	
	@DataProvider(name = "ManySidedTestData")
	public String[][] generatorNotEqual() {

		String[][] arr = new String[1][3];

		arr[0][0] = "1";
		arr[0][1] = "2";
		arr[0][2] = "3";

		return arr;
	}

	
	
	@Test(dataProvider = "ManySidedTestData")
	public void testForThreeSides(String first, String second, String third) {

		Tringle.tringle.add(first);
		Tringle.tringle.add(second);
		Tringle.tringle.add(third);

		Tringle.validateInput();
		Tringle.calculateStatus();

		Assert.assertEquals(Tringle.result, "Разностор");

		Tringle.tringleInt.clear();
		Tringle.tringle.clear();

	}
}
