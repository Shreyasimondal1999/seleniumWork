package Day36Assertions;
import org.testng.annotations.*;
import org.testng.Assert;
public class HardAssertion {
	@Test
public void HardAssertionPositiveTesting() {
	System.out.println("Testing");
	Assert.assertTrue(true);
	System.out.println("Done Testing1");
}   @Test
	public void HardAssertionNegative() {
		System.out.println("Testing");
		Assert.assertTrue(false);
		//this statement will not get executed as the test is failing
		System.out.println("Done Testing2");
	}

}
