package Day39TestNGListenersAndExtentReport;
import org.testng.Assert;
import org.testng.annotations.*;
public class TestNGListeners {
	@Test(priority=1)
public void test1() {
	Assert.assertEquals(1, 1);
}
	@Test(priority =2)
public void test2() {
	Assert.assertEquals(1,2);
}
	@Test(priority=3, dependsOnMethods= {"test2"})
public void test3() {
	Assert.assertEquals(1, 1);
}
}
