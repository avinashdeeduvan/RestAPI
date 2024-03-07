package Rest;

import org.testng.Assert;

import ReuseFiles.PayLoad;
import io.restassured.path.json.JsonPath;
import netscape.javascript.JSObject;

public class ComplexJSON {
	  	
	public static void main(String[] args) {
	
	/*1. Print No of courses returned by API

	2.Print Purchase Amount

	3. Print Title of the first course

	4. Print All course titles and their respective Prices

	5. Print no of copies sold by RPA Course

	6. Verify if Sum of all Course prices matches with Purchase Amount */
	
   JsonPath js = new JsonPath(PayLoad.CoursePrice());
   
   //Print No of courses returned by API
   int coursesize =  js.getInt("courses.size()");
   System.out.println(coursesize);
   
   //Print Purchase Amount
   int purchaeamount = js.getInt("dashboard.purchaseAmount");
   System.out.println(purchaeamount);
   
   //Print Title of the first course
   String titleoffirstcourse = js.getString("courses[0].title");
   System.out.println(titleoffirstcourse);
   
   //Print Title of the first course
   String titleofcourse = js.get("courses[2].title");
   System.out.println(titleofcourse);
   System.out.println("****");
   // Print All course titles and their respective Prices
    for(int i=0; i<coursesize;i++)
    {
    	String titles=js.get("courses["+i+"].title");
    	int price = js.getInt("courses["+i+"].price");
    	 
    	 System.out.println("****");
    	 System.out.println(titles);
    	 System.out.println(price);
    	 System.out.println("****");
    	
    }
    System.out.println("Print no of copies sold by RPA Course");
    //  Print no of copies sold by RPA Course
    for(int i=0; i<coursesize;i++)
    {
    	String title=js.get("courses["+i+"].title");
    	
    	if(title.equalsIgnoreCase("RPA"))
    	{
    	    int copiessold = js.getInt("courses["+i+"].copies");
    		System.out.println("Copies Sold by RPA="+copiessold);
    		break;
    	}
    	
    }
    // Verify if Sum of all Course prices matches with Purchase Amount
    
    int sumofallcourse=0;
    
    for(int i=0; i<coursesize;i++)
    {
    	int price = js.getInt("courses["+i+"].price");
    	int copiessold = js.getInt("courses["+i+"].copies");
    	int amount = price*copiessold;
    	sumofallcourse = sumofallcourse+amount;
    	System.out.println("amount of Each Course="+amount);
    }
    System.out.println("sumofallcourse="+sumofallcourse);
    
    if(sumofallcourse==purchaeamount)
    {
    	System.out.println("Sum of all Course prices matches with Purchase Amount");
    }
    Assert.assertEquals(sumofallcourse, purchaeamount
    		);
  } 
}
