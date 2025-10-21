package ua.com.kisit.laba3;

import java.awt.*;
import javax.swing.*;

public class ClockFrame2 {

    JFrame frame;
    JPanel panel;
    JLabel label;

    public ClockFrame2() {
        frame = new JFrame("Clock");
        panel = new JPanel(new BorderLayout());
        label = new JLabel("", SwingConstants.CENTER);

        panel.setBackground(new Color(30, 30, 30));
        label.setForeground(new Color(0, 255, 100));
        label.setFont(new Font("Consolas", Font.BOLD, 28));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        panel.add(label, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ClockExt2 clock = new ClockExt2(9, 36, 12, 0);

        Timer timer = new Timer(10, e -> {
            clock.addMilliseconds();
            label.setText(clock.toString());
        });
        timer.start();

        frame.setVisible(true);
    }
}
