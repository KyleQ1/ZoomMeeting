import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ZoomGUI extends JFrame {
    // Create JFrame that can be added to
    static JFrame window;

    // In pixels
    final int WINDOW_WIDTH = 600;
    final int WINDOW_HEIGHT = 800;

    public ZoomGUI() {
        // Create a window
        window = new JFrame();

        // Set the title
        window.setTitle("Zoom Links");

        // Set the size of the window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify what happens when the close button is clicked
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();

        // Display the window.
        window.setVisible(true);
    }

    public void buildPanel() {
        // Make area for text panel
        JPanel panel = new JPanel();

        // Text to input zoom links
        JLabel textArea = new JLabel("WOWEE");
        textArea.setVerticalAlignment(WINDOW_WIDTH / 4);

        JButton addButton = new JButton("Add Zoom");
        JButton removeButton = new JButton("Remove Zoom");

        panel.add(textArea);
        panel.add(addButton);
        panel.add(removeButton);


        window.add(panel);
    }

    public static ArrayList<Zoom> load() {
        try {
            FileInputStream inputFile = new FileInputStream(new File("zoomlink.txt"));


        } catch (FileNotFoundException e) {
            System.out.println("Could not find zoom links!");
        }

        return null;
    }

    public static void main(String[] args) {
        ZoomGUI zoom = new ZoomGUI();
    }
}
