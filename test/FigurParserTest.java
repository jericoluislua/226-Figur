import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;

public class FigurParserTest {

    public FigurDAO dao;
    public FigurParser fp;

    @Before
    public void setup(){
        dao = new FigurDAOStub();
        fp = new FigurParser(dao);
    }

    @Test
    public void parse() {
        List<Figur> figuren = fp.parse();
        assertEquals(2, figuren.size());
        assertEquals("Figur: Rechteck x: 27 y: 5 Breite: 167 Hoehe: 60", figuren.get(0).toString());
        assertEquals("Figur: Kreis x: 20 y: 70 Radius: 270", figuren.get(1).toString());
    }
}