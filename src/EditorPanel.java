import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

@SuppressWarnings("serial")
final class EditorPanel extends JPanel {

    private EditorControl editorControl;
    EditorPanel(EditorControl control) {
        editorControl = control;

        addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent mevent) {


                System.out.println("Mouse pressed at: " + mevent.getPoint());
                editorControl.setErsterPunkt(mevent.getPoint());
            }
            @Override
            public void mouseReleased(MouseEvent mevent) {
                System.out.println("Mouse released at: " + mevent.getPoint());
                editorControl.erzeugeFigurMitZweitemPunkt(mevent.getPoint());
                repaint();
            }
        }
        );
    }


    // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
    // Methode beim EditorFrame oder beim EditorPanel aufruft.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        editorControl.allesNeuZeichnen(g);

    }
}