package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import test.Junit;

public class ConcateTest extends TestCase{

	@Test
	public void testConcate() {
		Junit test = new Junit();
		String result = test.concatenate("one", "two");
		assertEquals("onetwo",result);
		
	}

}
