public class LiczbaO {
        private int liczba;
        public LiczbaO(int liczba) {
                this.liczba=liczba;
        }//zbedny drugi komentarz

        public String liczbaBasedOn(int n) throws LiczbaException{ 
                int liczba=this.liczba;        
                if (n>16||n< 2){                      //warunek musi byc system od 2 do 16;
                        throw new LiczbaException("zla podstawa");
                        }
                        else{
                        char[] array = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
                                'B', 'C', 'D', 'E', 'F' };
                        String wynik = "";

                        do {
                            wynik=wynik+array[liczba%n];
                            liczba=liczba/n;
                        } while (liczba != 0);
                        
                        wynik = new StringBuilder(wynik).reverse().toString();
                        System.out.println(wynik);    
                        return wynik;
                        }
        }
}