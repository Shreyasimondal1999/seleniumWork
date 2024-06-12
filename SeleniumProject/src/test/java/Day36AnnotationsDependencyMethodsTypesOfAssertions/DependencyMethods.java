package Day36AnnotationsDependencyMethodsTypesOfAssertions;
import org.testng.Assert;
import org.testng.annotations.*;
public class DependencyMethods {
@Test(priority=1)
public void OpenApp() {
	Assert.assertTrue(true);//to run the method succesfully
}
@Test(priority=2,dependsOnMethods= {"OpenApp"})
public void Login() {
	Assert.assertTrue(true);
}
@Test(priority=3,dependsOnMethods= {"Login"})
public void Search() {
	Assert.assertTrue(false);//this test will fail
}
@Test(priority=4,dependsOnMethods= {"Login","Search"})
public void AdvancedSearch() {
	Assert.assertTrue(true);
}
 @Test(priority=5,dependsOnMethods= {"Login"})
 public void LogOut() {
	 Assert.assertTrue(true);
 }

 
}
