package API.learning;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

public class LandLordTest {
	
	public static String id;
	
@BeforeClass
	public static void init() {
		RestAssured.baseURI = "http://localhost:8080/";
	}

@Test(priority = 1, enabled = false)
	public void getLandlords() {
		
		when()
			.get("/landlords")
		.then()
			.statusCode(200)
			.body("", is(empty()));
		
	}
	
@Test(priority = 2, enabled = true)
	public void postLandlord01() {
		
		LandLord landLord = new LandLord("123", "321");
		
		id = given()
			.contentType(ContentType.JSON)
			.body(landLord)
		.when()
			.post("/landlords")
		.then()
			.statusCode(201)
			.body("firstName", is(landLord.getFirstName()))
			.body("lastName", is(landLord.getLastName()))
			.body("trusted", is(false))
			.body("apartments", is(empty()))
		.extract()
			.path("id");
		
		given()
			.pathParam("id", id)
		.when()
			.get("/landlords/{id}")
		.then()
			.statusCode(200)
			.body("id", is(id))
			.body("firstName", is(landLord.getFirstName()))
			.body("lastName", is(landLord.getLastName()))
			.body("trusted", is(false))
			.body("apartments", is(empty()));
	}
	
@Test(priority = 2, enabled = true)
	public void postLandlord02() {
		
		LandLord landLord = new LandLord("Privet", "World", true);
		
		String id = given()
			.contentType(ContentType.JSON)
			.body(landLord)
		.when()
			.post("/landlords")
		.then()
			.statusCode(201)
			.body("firstName", is(landLord.getFirstName()))
			.body("lastName", is(landLord.getLastName()))
			.body("trusted", is(true))
			.body("apartments", is(empty()))
		.extract()
			.path("id");
		
		given()
			.pathParam("id", id)
		.when()
			.get("/landlords/{id}")
		.then()
			.statusCode(200)
			.body("id", is(id))
			.body("firstName", is(landLord.getFirstName()))
			.body("lastName", is(landLord.getLastName()))
			.body("trusted", is(true))
			.body("apartments", is(empty()));
	}
	
@Test(priority = 3, enabled = false)
	public void postLandlordNegative01() {
		
		LandLord landLord = new LandLord("", "");
		
		given()
			.contentType(ContentType.JSON)
			.body(landLord)
		.when()
			.post("/landlords")
		.then()
			.statusCode(400)
			.body("message", is("Fields are with validation errors"))
			.body("fieldErrorDTOs[0].fieldName", is("firstName"))
			.body("fieldErrorDTOs[0].fieldError", is("First name can not be empty"))
			.body("fieldErrorDTOs[1].fieldName", is("lastName"))
			.body("fieldErrorDTOs[1].fieldError", is("Last name can not be empty"));
		
	}
	
@Test(priority = 4, enabled = false)
	public void putLandLord() {
		
		LandLord landLord = new LandLord("Alex", "Hello", true);
		
		String id = given()
			.contentType(ContentType.JSON)
			.body(landLord)
		.when()
			.post("/landlords")
		.then()
			.statusCode(201)
		.extract()
			.path("id");
		
		LandLord landLordForUpdate = new LandLord("Test", "Case");
		
		given()
			.contentType(ContentType.JSON)
			.body(landLordForUpdate)
			.pathParam("id", id)
		.when()
			.put("/landlords/{id}")
		.then()
			.statusCode(200)
			.body("message", is("LandLord with id: " + id + " successfully updated"));
		
		given()
			.pathParam("id", id)
		.when()
			.get("/landlords/{id}")
		.then()
			.statusCode(200)
			.body("id", is(id))
			.body("firstName", is(landLordForUpdate.getFirstName()))
			.body("lastName", is(landLordForUpdate.getLastName()))
			.body("trusted", is(false));
		
	}
	
@Test(priority = 5, enabled = false)
	public void deleteLandlord01() {
		
		LandLord landLord = new LandLord("Alexey", "Fruzenshtein");
		
		String id = given()
			.contentType(ContentType.JSON)
			.body(landLord)
		.when()
			.post("/landlords")
		.then()
			.statusCode(201)
		.extract()
			.path("id");
		
		given()
			.pathParam("id", id)
		.when()
			.delete("/landlords/{id}")
		.then()
			.statusCode(200)
			.body("message", is("LandLord with id: " + id + " successfully deleted"));
		
		given()
			.pathParam("id", id)
		.when()
			.get("/landlords/{id}")
		.then()
			.statusCode(404)
			.body("message", is("There is no LandLord with id: " + id));
	}

@Test(priority = 6, enabled = true)
	public void deleteLandlordOne() {
		
		given()
			.pathParam("id", id)
		.when()
			.delete("/landlords/{id}")
		.then()
			.statusCode(200)
			.body("message", is("LandLord with id: " + id + " successfully deleted"));
	
	}
}
