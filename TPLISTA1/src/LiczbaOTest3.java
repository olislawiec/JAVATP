import junit.framework.TestCase;

public class LiczbaOTest3 extends TestCase {
    int liczba_2=100;
    LiczbaO naturalna = new LiczbaO(liczba_2);
    protected void setUp() throws  Exception {   //setUp()-sluzy do inicjacji kazdego przypadku testowego
            //super.setUp();
    }

    protected void tearDown() throws Exception { //tearDown przywraca stan sprzed testu
            //super.tearDown();
    }

    
 public void test1LiczbaBasedOn() throws LiczbaException {
        
            assertTrue("blad assert True", naturalna.liczbaBasedOn(2).equals(new String("1100100")));
 }
 public void test2LiczbaBasedOn() throws LiczbaException {
            assertEquals("blad","1100100", naturalna.liczbaBasedOn(2));
            }
 public void test3LiczbaBasedOn() throws LiczbaException {
            assertFalse("blad assert False", naturalna.liczbaBasedOn(2).equals(new String("1100110")));
 }
 public void test4LiczbaBasedOn() throws LiczbaException {
            assertNotNull(naturalna.liczbaBasedOn(2));
}	
 public void test5LiczbaBasedOn() throws LiczbaException {
            assertSame(Integer.valueOf(64), Integer.valueOf(naturalna.liczbaBasedOn(16)));
 }
}
