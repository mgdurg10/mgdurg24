package utilities;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class restApiTests {
	RequestSpecification request = RestAssured.given();
	@Test
	public String verifyresponsecode()
	{
	
	// Setting Base URI
	request.baseUri("https://open.er-api.com/v6/latest/USD");
	String response=request.given().log().all().when().get().then().assertThat().
			log().all().statusCode(200).extract().response().asString();
	Assert.assertEquals(response, "200");
	return response;
}
	@Test
	public void verifyINRPrice() {
		String response=request.given().log().all().when().get().then().assertThat().
				log().all().statusCode(200).extract().response().asString();
		JsonPath js=new JsonPath(response);
		int size=js.get("rates.size()");
		for(int i=0;i<size;i++)
		{
			String inrValue=js.get("rates.INR");
			if(inrValue.equalsIgnoreCase("83.02"))
			{
				System.out.println("Found valid INR value");
			}
		}
	}
}
