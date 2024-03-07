package Rest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import ReuseFiles.PayLoad;
import ReuseFiles.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class DynamicJson {
	
	@Test(dataProvider = "BooksData")
	public  void ADDBook(String isbn, String aisle) {
	
		
		RestAssured.baseURI="http://216.10.245.166";
		
		String AddBookRespone = given().log().all().header("Content-Type","application/json")
		.body(PayLoad.addBook(isbn,aisle))
		.when().post("Library/Addbook.php")
		.then().log().all().statusCode(200).extract().response().asString();
		
		JsonPath js = ReusableMethods.ConvertJSONToString(AddBookRespone);
		String BookId = js.get("ID");
		System.out.println(BookId);
	}
	@DataProvider(name="BooksData")
	public Object[][] getData()
	{
		//Array Collection of Elements
		//Multi Dimensional array collections of Arrays
		return new Object[][] { {"AVI","852"}, {"KHAN","898"}, {"BUJJI","9122"} };
	}

}
