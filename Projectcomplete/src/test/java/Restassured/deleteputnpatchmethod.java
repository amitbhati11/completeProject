package Restassured;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import org.json.simple.JSONObject;


public class deleteputnpatchmethod {
	
	@Test//delete
	public void deletem() {
		
	 baseURI="https://reqres.in";
	 given().when()
	 .delete("/api/users/2").then().statusCode(204).log().all();

}
	
	@DataProvider(name="Testput")
	
	public Object [][] putmet() {
		return new Object[][] {
			{"yomesh","dance"},{"tusjar","sqa"}
		};
	}
	
	@Test(dataProvider="Testput")
	
	public void testput(String name,String job) {
		baseURI="https://reqres.in";
		JSONObject rt=new JSONObject();
		rt.put("name",name);
		rt.put("job", job);
		
		given().contentType(ContentType.JSON).accept(ContentType.JSON).body(rt.toJSONString()).when().put("/api/users/2")
		.then().statusCode(200).log().all();
	}
}