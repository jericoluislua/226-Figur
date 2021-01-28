import java.awt.Graphics;

class Kreis extends Figur{
    private int radius;

    public Kreis(int x, int y, int radius){
        super(x, y);
        this.radius = radius;
    }
    @Override
    public void zeichne(Graphics g){
        g.drawOval(x, y, radius, radius);
        //g.fillOval(x, y, radius, radius);
    }

    @Override
    public String toString(){
        return "Figur: Kreis x: " + super.x + " y: " + super.y + " Radius: " + radius;
    }
}