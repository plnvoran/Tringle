package Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Tringle.Tringle;

public class EqualSidedTest {

	@DataProvider(name = "EqualSidedTestData")
	public String[][] generatorForThreeSides() {

		String[][] arr = new String[1][3];

		arr[0][0] = "2";
		arr[0][1] = "2";
		arr[0][2] = "2";

		return arr;

	}

	@Test(dataProvider = "EqualSidedTestData")
	public void testForThreeSides(String first, String second, String third) {

		Tringle.tringle.add(first);
		Tringle.tringle.add(second);
		Tringle.tringle.add(third);

		Tringle.validateInput();
		Tringle.calculateStatus();

		Assert.assertEquals(Tringle.result, "Равностор");

		Tringle.tringleInt.clear();
		Tringle.tringle.clear();

	}

}
