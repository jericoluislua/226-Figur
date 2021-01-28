import java.awt.Graphics;

class Linie extends Figur{
    private int sPunkt, ePunkt;

    public Linie(int x, int y, int sPunkt, int ePunkt){
        super(x, y);
        this.sPunkt = sPunkt;
        this.ePunkt = ePunkt;
    }
    @Override
    public void zeichne(Graphics g){
        g.drawLine(x, y, sPunkt, ePunkt);
    }

    @Override
    public String toString(){
        return "Figur: Linie x: " + super.x + " y: " + super.y + " Startpunkt: " + sPunkt + " Endpunkt: " + ePunkt;
    }
}
