import org.example.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CsaladiArSzamitasTest {

    // nm ár: 150796
    // emeletek száma * 132765 -> random szám
    @Test
    public void TesztArSzamitas_1() {
        CsaladiArSzamitas csArSz = new CsaladiArSzamitas();
        int telekMerete = 100;
        int emeletekSzama = 2;
        String expected = "Irányár: 15345130 Ft";
        assertEquals(expected, csArSz.Szamitas(telekMerete, emeletekSzama));
    }

    @Test
    public void TesztArSzamitas_2() {
        CsaladiArSzamitas csArSz = new CsaladiArSzamitas();
        int telekMerete = 0;
        int emeletekSzama = 0;
        String expected = "Irányár: 0 Ft";
        assertEquals(expected, csArSz.Szamitas(telekMerete, emeletekSzama));
    }

    @Test
    public void TesztArSzamitas_3() {
        CsaladiArSzamitas csArSz = new CsaladiArSzamitas();
        int telekMerete = 0;
        int emeletekSzama = 3;
        String expected = "Irányár: 398295 Ft";
        assertEquals(expected, csArSz.Szamitas(telekMerete, emeletekSzama));
    }

    @Test
    public void TesztArSzamitas_4() {
        CsaladiArSzamitas csArSz = new CsaladiArSzamitas();
        int telekMerete = 235;
        int emeletekSzama = 0;
        String expected = "Irányár: 35437060 Ft";
        assertEquals(expected, csArSz.Szamitas(telekMerete, emeletekSzama));
    }

    @Test
    public void TesztArSzamitas_5() {
        CsaladiArSzamitas csArSz = new CsaladiArSzamitas();
        int telekMerete = -1;
        int emeletekSzama = 2;
        String expected = "Irányár: 265530 Ft";
        assertEquals(expected, csArSz.Szamitas(telekMerete, emeletekSzama));
    }

    @Test
    public void TesztArSzamitas_6() {
        CsaladiArSzamitas csArSz = new CsaladiArSzamitas();
        int telekMerete = 322;
        int emeletekSzama = -1;
        String expected = "Irányár: 48556312 Ft";
        assertEquals(expected, csArSz.Szamitas(telekMerete, emeletekSzama));
    }
}
