package Day36Assertions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.*;
public class assertMethod {
//	@Test
//public void test() {
//	int x =10;
//	int y =15;
//	if(x==y) {
//		System.out.println("Test  got passed ");
//	}
//	else {
//		System.out.println("Test got failed");
//	}
//}
	@Test
	public void test() {
		int x=10;
		int y =15;
	//	Assert.assertEquals(x,y,"x is not equal to y");
		boolean condition = x>y;
		//Assert.assertTrue(condition,"X is not greater than y");
		//Assert.assertFalse(condition,"X is greater then Y");
		String str = "Happy";
		Assert.assertNull(str,"Object is not null");
	}

}
