import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class gui implements ActionListener {

    private int count = 0;

    private JFrame frame;
    private JLabel lbl;
    private JPanel panel;
    private JButton btn;

    public gui() {
        frame = new JFrame();

        btn = new JButton("Click Me"); // button
        btn.addActionListener(this);

        lbl = new JLabel("Clicks: 0"); // label

        panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.add(btn);
        panel.add(lbl);

        frame.add(panel, BorderLayout.CENTER); // Adds the panel to the screen (the window).
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when closing the window.
        frame.setTitle("First GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new gui();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        lbl.setText("Clicks: " + count);
    }
}