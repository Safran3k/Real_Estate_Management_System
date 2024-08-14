import org.example.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Assertions;

public class PanelAlapteruletSzamitasTest {

    /*
        Szoba: 20 nm
    */
    @Test
    public void TesztAlapteruletSzamitas_1() {
        PanelAlapteruletSzamitas pas = new PanelAlapteruletSzamitas();
        int szobakSzama = 3;
        int erkelyMerete = 3;
        String expected = "Alapterület: 63 nm";
        String actual  = pas.Szamitas(szobakSzama, erkelyMerete);
        assertEquals(expected, actual);
    }

    @Test
    public void TesztAlapteruletSzamitas_2() {
        PanelAlapteruletSzamitas pas = new PanelAlapteruletSzamitas();
        int szobakSzama = 0;
        int erkelyMerete = 3;
        String expected = "Alapterület: 3 nm";
        String actual = pas.Szamitas(szobakSzama, erkelyMerete);
        Assertions.assertThrows(ZeroSzobaSzamException.class, () -> { pas.Szamitas(szobakSzama, erkelyMerete); });
    }

    @Test
    public void TesztAlapteruletSzamitas_3() {
        PanelAlapteruletSzamitas pas = new PanelAlapteruletSzamitas();
        int szobakSzama = -1;
        int erkelyMerete = -1;
        String expected = "Alapterület: 0 nm";
        String actual  = pas.Szamitas(szobakSzama, erkelyMerete);
        Assertions.assertThrows(ZeroSzobaSzamException.class, () -> { pas.Szamitas(szobakSzama, erkelyMerete); });
    }

    @Test
    public void TesztAlapteruletSzamitas_4() {
        PanelAlapteruletSzamitas pas = new PanelAlapteruletSzamitas();
        int szobakSzama = 4;
        int erkelyMerete = -1;
        String expected = "Alapterület: 80 nm";
        String actual  = pas.Szamitas(szobakSzama, erkelyMerete);
        assertEquals(expected, actual);
    }
}
