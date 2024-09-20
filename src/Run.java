import Views.MainView;
import com.wizylab.duck2d.*;

import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        Environment.put("window.height", MainView.HEIGHT);
        Environment.put("window.width", MainView.WIDTH);
        Game.addView(new MainView());
        Game.start(MainView.class);
    }
}
