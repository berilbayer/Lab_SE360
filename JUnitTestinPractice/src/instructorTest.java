import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class instructorTest {
	Instructor mrNobody ;
	Student s1 ;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		mrNobody = new Instructor();
	    s1 = new Student();
		s1.setFinal(60);
		s1.setMidterm(60); 
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		mrNobody.ComputeAvg(s1);
		String actual = s1.getCase();
		assertEquals("passed", actual);
	}

}
