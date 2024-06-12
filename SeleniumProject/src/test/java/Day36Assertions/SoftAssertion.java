package Day36Assertions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
public class SoftAssertion {
	@Test
public void softAssertionPositiveTest() {
	int x =10;
	int y=10;
	boolean condition = (x>y);
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(x,y);
	System.out.println("Positive test done");
}
	@Test
public void softAssertionNegativeTest() {
	int x =10;
	int y=15;
	boolean condition = (x>y);
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(x,y,"X and Y is not equal");//here this test does not fails even if they are not equal
	System.out.println("negative test done");
	sa.assertAll();//reporting all the failed assertion if exist
}

}
