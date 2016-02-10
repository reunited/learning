package API.learning;

import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.io.IOException;
import org.apache.http.HttpStatus;

public class NSGetChartDataTest {

	String baseURI = "http://accounts.icharts.net/icharts/rest/chartservice/getChartData";
	
@Test(priority = 0, enabled = true)
	public void pieNSLive() throws IOException {
			
	String chart = new FileReader().getPropValues("MH7Tzi1N.Prod.NS");
	
		given()
			.param("chartId", "MH7Tzi1N")
			.param("authJsonMap", "{}")
		.when()
			.post(baseURI)
		.then()
			.statusCode(HttpStatus.SC_OK)
			.body(is(chart));
	}

@Test(priority = 1, enabled = true)
	public void verticalLineNSLive() throws IOException {

	String chart = new FileReader().getPropValues("MH7TziJF.Prod.NS");
	
		given()
			.param("chartId", "MH7TziJF")
			.param("authJsonMap", "{}")
		.when()
			.post(baseURI)
		.then()
			.statusCode(HttpStatus.SC_OK)
			.body(is(chart));
	}

@Test(priority = 2, enabled = true)
	public void lineNSLive() throws IOException {
	
	String chart = new FileReader().getPropValues("MH7TziJE.Prod.NS");
	
		given()
			.param("chartId", "MH7TziJE")
			.param("authJsonMap", "{}")
		.when()
			.post(baseURI)
		.then()
			.statusCode(HttpStatus.SC_OK)
			.body(is(chart));
	}

@Test(priority = 3, enabled = true)
	public void areaNSLive() throws IOException {
	
	String chart = new FileReader().getPropValues("MH7TziJH.Prod.NS");
	
		given()
			.param("chartId", "MH7TziJH")
			.param("authJsonMap", "{}")
		.when()
			.post(baseURI)
		.then()
			.statusCode(HttpStatus.SC_OK)
			.body(is(chart));
	}

@Test(priority = 4, enabled = true)
	public void halfRingNSLive() throws IOException {
	
	String chart = new FileReader().getPropValues("MH7TziJG.Prod.NS");
	
		given()
			.param("chartId", "MH7TziJG")
			.param("authJsonMap", "{}")
		.when()
			.post(baseURI)
		.then()
			.statusCode(HttpStatus.SC_OK)
			.body(is(chart));
	}

@Test(priority = 5, enabled = true)
	public void ringNSLive() throws IOException {
	
	String chart = new FileReader().getPropValues("MH7TziJB.Prod.NS");
	
		given()
			.param("chartId", "MH7TziJB")
			.param("authJsonMap", "{}")
		.when()
			.post(baseURI)
		.then()
			.statusCode(HttpStatus.SC_OK)
			.body(is(chart));
	}

@Test(priority = 6, enabled = true)
	public void columnNSLive() throws IOException {
	
	String chart = new FileReader().getPropValues("MH7TziJA.Prod.NS");
	
		given()
			.param("chartId", "MH7TziJA")
			.param("authJsonMap", "{}")
		.when()
			.post(baseURI)
		.then()
			.statusCode(HttpStatus.SC_OK)
			.body(is(chart));
	}

@Test(priority = 7, enabled = true)
	public void barNSLive() throws IOException {
	
	String chart = new FileReader().getPropValues("MH7TziJD.Prod.NS");
	
		given()
			.param("chartId", "MH7TziJD")
			.param("authJsonMap", "{}")
		.when()
			.post(baseURI)
		.then()
			.statusCode(HttpStatus.SC_OK)
			.body(is(chart));
	}

@Test(priority = 8, enabled = true)
	public void stacked100BarNSLive() throws IOException {
	
	String chart = new FileReader().getPropValues("MH7TziNF.Prod.NS");
	
		given()
			.param("chartId", "MH7TziNF")
			.param("authJsonMap", "{}")
		.when()
			.post(baseURI)
		.then()
			.statusCode(HttpStatus.SC_OK)
			.body(is(chart));
	}

@Test(priority = 9, enabled = true)
	public void columnNS1Live() throws IOException {
	
	String chart = new FileReader().getPropValues("MH7TziNE.Prod.NS");
	
		given()
			.param("chartId", "MH7TziNE")
			.param("authJsonMap", "{}")
		.when()
			.post(baseURI)
		.then()
			.statusCode(HttpStatus.SC_OK)
			.body(is(chart));
	}

@Test(priority = 10, enabled = true)
	public void stackedColumnNSLive() throws IOException {
	
	String chart = new FileReader().getPropValues("MH7RzixE.Prod.NS");
	
		given()
			.param("chartId", "MH7RzixE")
			.param("authJsonMap", "{}")
		.when()
			.post(baseURI)
		.then()
			.statusCode(HttpStatus.SC_OK)
			.body(is(chart));
	}

@Test(priority = 11, enabled = true)
	public void stackedBarNSLive() throws IOException {
	
	String chart = new FileReader().getPropValues("MH7RzixH.Prod.NS");
	
		given()
			.param("chartId", "MH7RzixH")
			.param("authJsonMap", "{}")
		.when()
			.post(baseURI)
		.then()
			.statusCode(HttpStatus.SC_OK)
			.body(is(chart));
	}

@Test(priority = 12, enabled = true)
	public void pieNSDatasetLive() throws IOException {
	
	String chart = new FileReader().getPropValues("MH7TziNB.Prod.NS");
	String authJsonMap = new FileReader().getPropValues("Prod.authJsonMap");
	
		given()
			.param("chartId", "MH7TziNB")
			.param("authJsonMap", authJsonMap)
		.when()
			.post(baseURI)
		.then()
			.statusCode(HttpStatus.SC_OK)
			.body(is(chart));
	}

@Test(priority = 13, enabled = true)
	public void columnNSDatasetLive() throws IOException {
	
	String chart = new FileReader().getPropValues("MH7TziNG.Prod.NS");
	String authJsonMap = new FileReader().getPropValues("Prod.authJsonMap");
	
		given()
			.param("chartId", "MH7TziNG")
			.param("authJsonMap", authJsonMap)
		.when()
			.post(baseURI)
		.then()
			.statusCode(HttpStatus.SC_OK)
			.body(is(chart));
	}

@Test(priority = 14, enabled = true)
	public void barNSDatasetLive() throws IOException {
	
	String chart = new FileReader().getPropValues("MH7TziNH.Prod.NS");
	String authJsonMap = new FileReader().getPropValues("Prod.authJsonMap");
	
		given()
			.param("chartId", "MH7TziNH")
			.param("authJsonMap", authJsonMap)
		.when()
			.post(baseURI)
		.then()
			.statusCode(HttpStatus.SC_OK)
			.body(is(chart));
	}

@Test(priority = 15, enabled = true)
	public void invalidChartIdNSLive() throws IOException {
	
	String error = new FileReader().getPropValues("invalid.Chart.ID.Error");
	
		given()
			.param("chartId", "InvalidChartId")
			.param("authJsonMap", "{}")
		.when()
			.post(baseURI)
		.then()
			.statusCode(HttpStatus.SC_INTERNAL_SERVER_ERROR)
			.body(is(error));
	}

@Test(priority = 16, enabled = true)
	public void invalidChartAuthNSLive() throws IOException {
	
	String authJsonMap = new FileReader().getPropValues("Prod.authJsonMap.Invalid");
	String error = new FileReader().getPropValues("invalid.Login.Error");
	
		given()
			.param("chartId", "MH7TziNH")
			.param("authJsonMap", authJsonMap)
		.when()
			.post(baseURI)
		.then()
			.statusCode(HttpStatus.SC_INTERNAL_SERVER_ERROR)
			.body(is(error));
	}

}