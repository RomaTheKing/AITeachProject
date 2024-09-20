package Objects;

import com.sun.glass.ui.Size;
import com.wizylab.duck2d.Graph;

import java.awt.*;

public class Vertex {
    private static final int SIZE = 60;
    private double x, y;
    private int type, id;

    public Vertex(int x, int y, int type, int id) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.id = id;
    }

    public void draw(Graph g) {
        g.setColor(Color.GRAY);
        g.fillCircle((int) x, (int) y, SIZE);
    }
}
