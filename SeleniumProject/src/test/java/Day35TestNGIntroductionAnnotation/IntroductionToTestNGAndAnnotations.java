package Day35TestNGIntroductionAnnotation;

import org.testng.annotations.Test;

public class IntroductionToTestNGAndAnnotations {
  @Test(priority=1)
  public void f() {
	 System.out.println("FirstExecutionShouldHappen"); 
  }
  @Test(priority=2)
  public void c() {
	 System.out.println("Second execution should happen"); 
  }
  @Test(priority=3)
  public void a() {
	 System.out.println("Third Execution should happen"); 
  }
}
