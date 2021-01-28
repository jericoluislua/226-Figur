import javax.swing.*;
import java.awt.Graphics;
import java.util.Vector;

class Zeichnung extends JPanel{

    private Vector<Figur> figuren;

    Zeichnung(Vector<Figur> f){
        this.figuren = f;
    }

    /**
     * Zeichnet alle Figuren.
     * @param g Referenz auf das Graphics-Objekt zum zeichnen.
     */
    public void zeichnen(Graphics g) {
        for (Figur f : figuren) {
            f.zeichne(g);
        }
    }

    public void hinzufuegen(Figur figur){
        figuren.add(figur);
        repaint();
    }
}