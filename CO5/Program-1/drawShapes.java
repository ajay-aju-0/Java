/* Program to draw Circle, Rectangle, Line in Applet.  */

import java.awt.*;
import java.applet.*;
/*
<applet code="Shapes" width=400 height=400>
</applet>
*/
public class Shapes extends Applet {
  public void paint(Graphics g) {
    g.drawLine(10, 10, 100, 100);
    g.drawRect(100, 150, 100, 150);
    g.drawOval(200, 200, 200, 200);
  }
}