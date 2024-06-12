package Day36BeforeTestAndAfterTest;
import org.testng.annotations.*;
public class Test1 {
@BeforeTest
public void BeforeTest() {
	System.out.println("Before Starting any test");
}
@BeforeSuite
public void BeforeSuite() {
	System.out.println("Before suite method getting called in Test1 class");
}
@Test
public void normalTest() {
	System.out.println("i am normalTest method of Test1");
	
}

}
