package test.java.sriram_task3;

import static org.junit.jupiter.api.Assertions.*;
import main.java.sriram_task3.Simple_Interst;
import org.junit.jupiter.api.Test;

class Simple_InterstTest {

	private static final double DELTA=1e-15;
	@Test
	public void testSimpleinterst() {
		Simple_Interst si=new Simple_Interst();
		assertEquals(800,si.simpleinterst(2000,10,4),DELTA);
	}
	

}