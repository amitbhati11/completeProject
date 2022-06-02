package Restassured;
import static io.restassured.RestAssured.*;
import  org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class getnpostmethod {
	@DataProvider(name="testputdata")
	public Object [][] putdata() {
	return new  Object [][] {
		{"Sourabh","SQA"},{"Rohit","Crickter"},{"murli","wk"}
	 };
	}
//@Test	
public void putmethod() {
	baseURI="https://reqres.in";
	JSONObject js=new JSONObject();
	js.put("name", "Bikash");
	js.put("job", "softqa");
	
	given().contentType(ContentType.JSON).accept(ContentType.JSON).body(js.toJSONString())
	.when().post("/api/users").then().statusCode(201).log().all();
}

@Test(dataProvider="testputdata")

public void putmethodtest(String name, String job) {
	baseURI="https://reqres.in";
	JSONObject req=new JSONObject();
	req.put("name", name);
	req.put("job",job);
	
	given().contentType(ContentType.JSON).accept(ContentType.JSON)
	.body(req.toJSONString())
	.when().post("/api/users").then().statusCode(201).log().all();
	
}

@Test

public void getmethodtest() {
	baseURI="https://reqres.in";
	given().when().get("/api/users?page=2").then().statusCode(200).log().all();
}
}
