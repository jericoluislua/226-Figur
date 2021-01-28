import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
final class EditorFrame extends JFrame {
  private EditorPanel ePanel;
  private EditorControl editorControl;

  public EditorFrame(int breite, int hoehe) {
    erzeugeUndSetzeEditorPanel();
    fensterEinmitten(breite, hoehe);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);

    addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent kevent) {
            if(kevent.getKeyCode() == KeyEvent.VK_R) {
                System.out.println("Key Pressed: R");
                editorControl.setFigurTyp('R');
            }
            else if(kevent.getKeyCode() == KeyEvent.VK_K) {
                System.out.println("Key Pressed: K");
                editorControl.setFigurTyp('K');

            }
            else if(kevent.getKeyCode() == KeyEvent.VK_L) {
                System.out.println("Key Pressed: L");
                editorControl.setFigurTyp('L');

            }
        }
    });
  }

  private void erzeugeUndSetzeEditorPanel() {

      editorControl = new EditorControl(ePanel);
      JPanel panel = new EditorPanel(editorControl);
      setContentPane(panel);
  }

  private void fensterEinmitten(int breite, int hoehe) {
    Dimension bildschirmGroesse = Toolkit.getDefaultToolkit().getScreenSize();
    Rectangle fensterAusschnitt = new Rectangle();
    fensterAusschnitt.width = breite;
    fensterAusschnitt.height = hoehe;
    fensterAusschnitt.x = (bildschirmGroesse.width - fensterAusschnitt.width) / 2;
    fensterAusschnitt.y = (bildschirmGroesse.height - fensterAusschnitt.height) / 2;
    setBounds(fensterAusschnitt);
  }
}
