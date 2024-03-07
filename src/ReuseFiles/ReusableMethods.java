package ReuseFiles;

import io.restassured.path.json.JsonPath;

public class ReusableMethods {
	
	public static JsonPath ConvertJSONToString(String respone) {
		
	JsonPath js = new JsonPath(respone);
	return js;
		
	}

}
