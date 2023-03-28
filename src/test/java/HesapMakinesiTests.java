import org.example.HesapMakinesi;
import org.junit.jupiter.api.*;

public class HesapMakinesiTests {

    @BeforeAll
    public static void setupClass(){
        System.out.println("Setup class metotu calistirildi. ");
    }

    HesapMakinesi hesapMakinesi;
    @BeforeEach
    public void setup(){
        hesapMakinesi = new HesapMakinesi();
        System.out.println("Setup metotu calistirildi");
    }


    @Test
    public void toplamaTesi(){
        double toplamaSonucu = hesapMakinesi.toplama(1.5,3.6);
        Assertions.assertEquals(5.1, toplamaSonucu);
    }
    @Test
    public void cikartmaTesti(){
        double cikatmaSonucu = hesapMakinesi.cikartma(5.5,3.5);
        Assertions.assertEquals(2.0, cikatmaSonucu);
    }

    @Test
    public void carpmaTesti() {
        double carpmaSonucu = hesapMakinesi.carpma(2.0, 3.5);
        Assertions.assertEquals(7.0, carpmaSonucu);
    }
    @AfterEach
    public void teardown(){
        System.out.println("Teardown metotu calistirildi.");
    }
    @AfterAll
    public static void teardownClass(){
        System.out.println("Teardown class metotu calistirildi.");
    }
}
