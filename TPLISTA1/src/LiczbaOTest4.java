import junit.framework.TestCase;

public class LiczbaOTest4 extends TestCase 
{
	public LiczbaO testowa;
	//@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	        
	}
	//@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	//@Before
	public void setUp() throws Exception {
	        testowa=new LiczbaO(20);
	}

	///@Test
	public void test1() {
	        assertNotNull(testowa); 
	}

	public void test2() throws LiczbaException {
	        assertEquals("10100",testowa.liczbaBasedOn(2));
	}
	//@Test(timeout=100)
	public void test3() throws NumberFormatException, LiczbaException {
	        assertSame(Integer.valueOf(14), Integer.valueOf(testowa.liczbaBasedOn(16)));
	}
	//@After
	public void test4() throws LiczbaException {
	        assertNotSame(testowa.liczbaBasedOn(11), null);
	}
	//@Ignore
	public void test5() throws NumberFormatException, LiczbaException {
	        assertEquals(Integer.parseInt("32"),Integer.parseInt(testowa.liczbaBasedOn(6)));
	}
}
