package Views;

import Objects.Vertex;
import com.wizylab.duck2d.Graph;
import com.wizylab.duck2d.View;

import java.awt.*;

public class MainView implements View {
    public static final int HEIGHT = 720, WIDTH = 960;

    @Override
    public void onTimer(long l) {

    }

    @Override
    public void onDraw(Graph g) {
        g.setBackground(Color.BLACK);
        new Vertex(150, 150, 1, 1).draw(g);
    }
}
