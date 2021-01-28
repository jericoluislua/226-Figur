import java.awt.Graphics;
import java.awt.Point;
import java.util.Vector;

final class EditorControl {

  private Zeichnung zeichnung;
  private char figurTyp;
  private Point ersterPunkt;
  private Point zweiterPunkt;
  private EditorPanel ePanel;
  public Vector<Figur> figuren = new Vector<Figur>();

  public EditorControl(EditorPanel ePanel){
    this.ePanel = ePanel;
    zeichnung = new Zeichnung(figuren);
  }


  public void allesNeuZeichnen(Graphics g) {
    zeichnung = new Zeichnung(figuren);
    if(ersterPunkt != null) {
      zeichnung.zeichnen(g);
    }
  }

  public void setFigurTyp(char figurTyp) {
    this.figurTyp = figurTyp;
  }

  public void setErsterPunkt(Point ersterPunkt) {
    this.ersterPunkt = ersterPunkt;
  }

  public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
    int width =  zweiterPunkt.x -  ersterPunkt.x;
    int height =  zweiterPunkt.y -  ersterPunkt.y;
    if (figurTyp == 'R') {
      zeichnung.hinzufuegen(new Rechteck(Math.min(ersterPunkt.x, zweiterPunkt.x), Math.min(ersterPunkt.y, zweiterPunkt.y), Math.abs(width), Math.abs(height)));
      System.out.println("Width: " + width);
      System.out.println("Height: " + height);
    }
    else if(figurTyp == 'K'){
      zeichnung.hinzufuegen(new Kreis(Math.min(ersterPunkt.x, zweiterPunkt.x), Math.min(ersterPunkt.y, zweiterPunkt.y), Math.abs(width)));
      System.out.println("Width: " + width);
    }
    else if(figurTyp == 'L'){
      zeichnung.hinzufuegen(new Linie((int)ersterPunkt.getX(), (int)ersterPunkt.getY(), (int)zweiterPunkt.getX(),(int)zweiterPunkt.getY()));
    }
  }
}
