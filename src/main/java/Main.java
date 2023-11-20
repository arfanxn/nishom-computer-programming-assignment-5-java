
import Components.AUFrame;
import Components.AUTabbedPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author arfanxn
 */
public class Main {

    private static final int FRAME_WIDTH = 500, FRAME_HEIGHT = 500;

    public static void main(String[] args) {
        // instantiate frame
        AUFrame frame = new AUFrame();

        // instantiate tabbed pane
        AUTabbedPane tabbedPane = new AUTabbedPane();

        // add component(s) to frame
        frame.getContentPane().add(tabbedPane);

        // configure frame
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setVisible(true);
    }
}
