import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Basic {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Validate if Add place API is working
		//given - all input details
		//when - Submit the API 
		//then - validate the response
		RestAssured.authentication = RestAssured.preemptive().basic("Feb2023restAPI@gmail.com", "ATATT3xFfGF0d39TsozfFQWR0Hvr0UfPqKKtyFJxQvnaGGtSvez8FvOvhfzSTapOBEUGx0ZAdIbWfM5tjeU8rFw7Rh72pbanmBdYhtysnC3yH89HMn-lXz9PTGKVKtWFV2vp6GyZ_75P27LqLCAbHxqOjYds1SNn5oFZQFDi3ufeUI3cJwdCy20=5543D93F");
		RestAssured.baseURI = "https://testjirafeb2023.atlassian.net/";
		given().header("Content-Type", "application/json")
		.body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"project\": {\r\n"
				+ "            \"key\": \"TES\"\r\n"
				+ "        },\r\n"
				+ "        \"summary\": \"create issue in RA project\",\r\n"
				+ "        \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "        \"issuetype\": {\r\n"
				+ "            \"name\": \"Bug\"\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}").when().post("rest/api/2/issue/")
		.then().log().all().assertThat().statusCode(201);
		
	}

}
