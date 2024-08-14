import org.example.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CsaladiAlapteruletSzamitasTest {

    /*
        Emelet: 32 nm
    */
    @Test
    public void TesztArSzamitas_1() {
        CsaladiAlapteruletSzamitas cas = new CsaladiAlapteruletSzamitas();
        int telekMerete = 100;
        int emeletekSzama = 2;
        String expected = "Alapterület: 164 nm";
        assertEquals(expected, cas.Szamitas(telekMerete, emeletekSzama));
    }

    @Test
    public void TesztArSzamitas_2() {
        CsaladiAlapteruletSzamitas cas = new CsaladiAlapteruletSzamitas();
        int telekMerete = 0;
        int emeletekSzama = 0;
        String expected = "Alapterület: 0 nm";
        assertEquals(expected, cas.Szamitas(telekMerete, emeletekSzama));
    }

    @Test
    public void TesztArSzamitas_3() {
        CsaladiAlapteruletSzamitas cas = new CsaladiAlapteruletSzamitas();
        int telekMerete = 234;
        int emeletekSzama = 0;
        String expected = "Alapterület: 234 nm";
        assertEquals(expected, cas.Szamitas(telekMerete, emeletekSzama));
    }

    @Test
    public void TesztArSzamitas_4() {
        CsaladiAlapteruletSzamitas cas = new CsaladiAlapteruletSzamitas();
        int telekMerete = -234;
        int emeletekSzama = 0;
        String expected = "Alapterület: 0 nm";
        assertEquals(expected, cas.Szamitas(telekMerete, emeletekSzama));
    }

    @Test
    public void TesztArSzamitas_5() {
        CsaladiAlapteruletSzamitas cas = new CsaladiAlapteruletSzamitas();
        int telekMerete = 234;
        int emeletekSzama = -2;
        String expected = "Alapterület: 234 nm";
        assertEquals(expected, cas.Szamitas(telekMerete, emeletekSzama));
    }

    @Test
    public void TesztArSzamitas_6() {
        CsaladiAlapteruletSzamitas cas = new CsaladiAlapteruletSzamitas();
        int telekMerete = -234;
        int emeletekSzama = -2;
        String expected = "Alapterület: 0 nm";
        assertEquals(expected, cas.Szamitas(telekMerete, emeletekSzama));
    }
}
