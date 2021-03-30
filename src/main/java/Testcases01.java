import org.testng.annotations.Test;

public class Testcases01 {
	
	
	@Test
    public void exampleOfTestNgMaven() {
        System.out.println("This is TestNG-Maven Example");
    }
	@Test(priority=1)
    public void exampleOfTestNgMaven1() {
        System.out.println("This is TestNG-Maven Example");
    }
	
	
	@Test(priority=1)
    public void exampleOfTestNgMaven2() {
        System.out.println("This is TestNG-Maven Example");
    }
}


