package Day36BeforeTestAndAfterTest;
import org.testng.annotations.*;
public class Test3 {
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After suite method in Test3");
	}
@Test
public void NormalMethod() {
	System.out.println("Normal method of test3");
}
}
