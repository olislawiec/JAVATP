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

    
 public void testLiczbaBasedOn() throws LiczbaException {
        
            assertTrue("b³d assert True", naturalna.liczbaBasedOn(2).equals(new String("1100100")));       //bada poprawnosc warunków
            assertEquals("B³d","1100100", naturalna.liczbaBasedOn(2));                                                                     //czy poprawna konwersja
            assertFalse("b³d assert False", naturalna.liczbaBasedOn(2).equals(new String("1100110")));     //bada poprawnosc warunków
            assertNotNull(naturalna.liczbaBasedOn(2));                                                      // czy podana referencja wskazuje na obiekt
            //assertSame("b³d assertSame", naturalna.liczbaBasedOn(2),"1100100");                            // sprawdza poprawnosc parametrów
    }
}
