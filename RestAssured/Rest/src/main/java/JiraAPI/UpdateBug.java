package JiraAPI;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateBug extends BaseClass {
	
	@Test(dependsOnMethods ="JiraAPI.CreateBug.create")   
	public void update() {


		RequestSpecification contentType = RestAssured.given()
		.contentType("application/json");
		
		Response response = RestAssured.given()
		.contentType("application/json")
		.when()
		.body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"description\": \"Tested\"\r\n"
				+ "    }\r\n"
				+ "}").put(issueID);
		response.then().assertThat().statusCode(204);		
		
}
}