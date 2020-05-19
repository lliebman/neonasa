package liebman.nasa.neo;

import javax.swing.*;
import java.awt.*;

public class NearEarthObjectView extends JComponent {

    public void setNearEarthObjects(NeoFeed.NearEarthObject neo) {
        this.neo = neo;
        repaint();
    }

    NeoFeed.NearEarthObject neo;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (neo == null) {
            return;
        }

        g.setColor(Color.BLUE);
        g.fillOval(-100, 200, 100, 100);

        g.setColor(Color.RED);
        g.fillOval(getWidth() - 10, 200, 10, 10);

        double lunars = neo.closestLunarDistance();
        double uiDistance = getWidth()-10;
        double moonX = uiDistance / lunars;


        g.setColor(Color.GRAY);
        g.fillOval((int) moonX, 200, 25, 25);

//        double lunars = neo.closeApproachData.get(0).missDistance.lunar;
    }




}
