package Day36BeforeTestAndAfterTest;
import org.testng.annotations.*;
public class Test2 {


    @AfterTest
	private void AfterTestMethod() {
		System.out.println("After test method from test 2");
	}
    @Test
    private void NormalMethod() {
    	System.out.println("normal method of test2 method");
    }
}
