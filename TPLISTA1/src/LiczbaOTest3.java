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
        
            assertTrue("blad assert True", naturalna.liczbaBasedOn(2).equals(new String("1100100")));       //bada poprawnosc warunków
            assertEquals("blad","1100100", naturalna.liczbaBasedOn(2));                                                                     //czy poprawna konwersja
            assertFalse("blad assert False", naturalna.liczbaBasedOn(2).equals(new String("1100110")));     //bada poprawnosc warunków
            assertNotNull(naturalna.liczbaBasedOn(2));
            assertSame(Integer.valueOf(64), Integer.valueOf(naturalna.liczbaBasedOn(16)));					// czy podana referencja wskazuje na obiekt
            //assertSame("b³d assertSame", naturalna.liczbaBasedOn(2),"1100100");                            // sprawdza poprawnosc parametrów
    }
}
