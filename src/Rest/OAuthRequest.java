/*package Rest;

import org.testng.annotations.Test;

import ReuseFiles.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.util.List;
C:\Program Files (x86)\Common Files\Oracle\Java\javapathC:\Program Files (x86)\Common Files\Oracle\Java\javapath

public class OAuthRequest<API> {
	
	@Test
	public void CreateOAuth()
	{
		
		RestAssured.baseURI="https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token";
		
		String OAuthToken =given().log().all()
		.formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		.formParam("grant_type", "client_credentials")
		.formParam("scope", "trust")
		.when().log().all().post().then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println("OAuthToken="+OAuthToken);
		
		JsonPath js = ReusableMethods.ConvertJSONToString(OAuthToken);
		
		String GeneratedToken = js.getString("access_token");
		System.out.println("Gnerated Access Token="+GeneratedToken);
		
		
	 	RestAssured.baseURI="https://rahulshettyacademy.com/";
	
	 //	GetCoursePOJO CourseRespone = given().queryParam("access_token", GeneratedToken).log().all()
	 			.when().get("oauthapi/getCourseDetails")
	 			.then().log().all().assertThat().statusCode(401).extract().body().as(GetCoursePOJO.class);
		
		//Reading the Course Details Data
		System.out.println("Linked in="+CourseRespone.getLinkedIn());
		System.out.println("Instructor="+CourseRespone.getInstructor());
		System.out.println("***************************************");
		System.out.println("Required Course="+CourseRespone.getCourses().getApi().get(0).getCourseTitle());
		
		List<API> CourseList=(List<API>) CourseRespone.getCourses().getApi();
		
		for(int i=0; i<CourseList.size();i++)
		{
			String CourseName = CourseRespone.getCourses().getApi().get(i).getCourseTitle();
			
			if(CourseName.equalsIgnoreCase("SoapUI Webservices testing"))
			{
				String price = CourseRespone.getCourses().getApi().get(i).getPrice();
				System.out.println("***********"+CourseName+"*********PRCIE*******************="+price);
			}
		}
		
		//*****************PRINTING COURSE TITLES****************////
	
/*System.out.println("***************************************");
		
		List<WebAutomation> CourseNames=CourseRespone.getCourses().getWebAutomation();
		
		for(int i=0; i<CourseNames.size();i++)
		{
			System.out.println("*****WEB AUTOMATION COURSE TITLES******"+CourseNames.get(i).getCourseTitle());
			
		}
		//*****************PRINTING AVAILABLE COURSE *****************/////
		
				//System.out.println("*****WEB AUTOMATION COURSE ******"+CourseRespone.getCourses().getWebAutomation().indexOf(1));
		
	//}

//}

