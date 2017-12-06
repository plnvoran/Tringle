package Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Tringle.Tringle;

public class ValidateInputTest {
	
	@DataProvider(name = "WrongDataArray")
	public String[][] generatorForAnalyse() {

		String[][] arr = new String[63][3];

		String[] val = new String[4];

		val[0] = "0";
		val[1] = "-1";
		val[2] = "õ";
		val[3] = "1";

		int i = 0;

		for (int j = 0; j < 4; j++) {

			for (int k = 0; k < 4; k++) {

				for (int l = 0; l < 4; l++) {

					if (i == 63)
						break;

					arr[i][0] = val[j];
					arr[i][1] = val[k];
					arr[i][2] = val[l];

					i++;

				}
			}

		}

		return arr;

	}

	@Test(dataProvider = "WrongDataArray")
	public void testAnalyse(String first, String second, String third) {

		Tringle.tringle.add(first);
		Tringle.tringle.add(second);
		Tringle.tringle.add(third);
		
		Tringle.validateInput();
		
		Assert.assertEquals(Tringle.result,"Îøèáêà!");
		
		Tringle.tringle.clear();
		
		;
	}
}
