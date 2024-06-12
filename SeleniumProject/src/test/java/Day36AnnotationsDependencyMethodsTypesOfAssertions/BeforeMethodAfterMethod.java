package Day36AnnotationsDependencyMethodsTypesOfAssertions;
import org.testng.annotations.*;
public class BeforeMethodAfterMethod {
@BeforeMethod
public void Login() {
	System.out.println("Login------------");
}
@Test(priority = 1)
public  void Search() {
	System.out.println("Search------------");
}
@Test(priority=2)
public void AdvancedSearch() {
	System.out.println("AdvancedSearch------------");
}
@AfterMethod
public void LogOut(){
	System.out.println("Logout---------");
}
}
