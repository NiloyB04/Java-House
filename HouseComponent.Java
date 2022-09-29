import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class HouseComponent extends JPanel {
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    drawGround(g);
    drawHouse(g);
  }
  private void drawGround(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    Rectangle2D ground = new Rectangle2D.Double(0, 300, 400, 100);
    g2d.setColor(Color.GREEN);
    g2d.fill(ground);
    g2d.draw(ground);
  }
  private void drawHouse(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    Color houseColor = new Color(172, 143, 87);
    Rectangle2D house = new Rectangle2D.Double(75, 150, 250, 150);
    g2d.setColor(houseColor);
    g2d.fill(house);
    g2d.draw(house);
    drawWindow(g, 100);
    drawWindow(g, 250);
    drawDoor(g);
  }
  private void drawWindow(Graphics g, int x) {
    Graphics2D g2d = (Graphics2D) g;
    Color windowColor = new Color(166, 235, 255);
    Color windowFrame = new Color(107, 68, 35);

    int centerX = x + 25;
    int centerY = 200 + 25;

    Rectangle2D pane = new Rectangle2D.Double(x, 200, 50, 50);
    Line2D vFrame = new Line2D.Double(centerX, 200, centerX, 250);
    Line2D hFrame = new Line2D.Double(x, centerY, x + 50, centerY);

    g2d.setColor(windowColor);
    g2d.fill(pane);
    g2d.draw(pane);
    g2d.setColor(windowFrame);
    g2d.fill(vFrame);
    g2d.draw(vFrame);
    g2d.fill(hFrame);
    g2d.draw(hFrame);
  }
  private void drawDoor(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    Color doorColor = new Color(107, 68, 35);
    Rectangle2D door = new Rectangle2D.Double(170, 185, 60, 115);
    Ellipse2D doorknob = new Ellipse2D.Double(215, 235, 10, 10);
    g2d.setColor(doorColor);
    g2d.fill(door);
    g2d.draw(door);
    g2d.setColor(Color.yellow);
    g2d.fill(doorknob);
    g2d.draw(doorknob);
  }
}