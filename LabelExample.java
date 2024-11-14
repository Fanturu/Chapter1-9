import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LabelExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("JLabel Example");

        // Set the frame size
        frame.setSize(300, 200);

        // Create a new JLabel with text
        JLabel label1 = new JLabel("Label with text");

        // Create a panel to hold the label
        JPanel panel = new JPanel();
        panel.add(label1);  // Add the label to the panel

        // Add the panel to the frame's content pane
        frame.getContentPane().add(panel);

        // Set default close operation and make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
