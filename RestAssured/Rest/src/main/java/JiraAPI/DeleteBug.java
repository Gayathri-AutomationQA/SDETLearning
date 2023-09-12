package JiraAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteBug extends BaseClass{

	@Test(dependsOnMethods = "JiraAPI.CreateBug.create")
	public void delete() {

		Response response = RestAssured.given()
				.contentType("application/json")
				.when()
				.delete(issueID);
		response.then().assertThat().statusCode(204);	

	}

}
