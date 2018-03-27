package test;

import org.junit.Test;

import junit.framework.TestCase;
import static org.junit.Assert.*;

/*public class JunitTest extends TestCase {
	
	@Test
	public void TestAdd(){
		Junit test = new Junit();
		assertEquals("paine",test.add("paine"));
	}
	@Test
	public void TestProd(){
		Junit test = new Junit();
		assertEquals("Result",6,test.lengthProdus(1));
	}

}
*/

public class JunitTest{
	@Test
	public void TestName(){
		Admin test = new Admin();
		 test.setName("Alex");
		assertEquals("Result","Alex",test.getName());
	}
	
	@Test
	public void TestAdd(){
		Admin test = new Admin();
		 test.setName("Alex");
		assertEquals("Result","Alex",test.getName());
	}
 
	
}
