import java.awt.Graphics;

public class Rechteck extends Figur{
    private int breite, hoehe;

    public Rechteck(int x, int y, int breite, int hoehe){
        super(x, y);
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public int getBreite() {
        return breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    @Override
    public void zeichne(Graphics g){
        g.drawRect(x, y, breite, hoehe);
        //g.fillRect(x, y, breite, hoehe);
    }

    @Override
    public String toString(){
        return "Figur: Rechteck x: " + super.x + " y: " + super.y + " Breite: " + breite + " Hoehe: " + hoehe;
    }

}
