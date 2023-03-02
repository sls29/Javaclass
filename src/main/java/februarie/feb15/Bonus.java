package februarie.feb15;

import java.util.Scanner;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bonus {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawingPanel drawingPanel = new DrawingPanel();
        frame.add(drawingPanel);
        frame.pack();
        frame.setVisible(true);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a shape (c for circle, s for square, x to exit):");
            String input = scanner.nextLine();
            switch (input) {
                case "x" -> System.exit(0);
                case "c" -> {
                    drawingPanel.setShape("circle");
                    drawingPanel.repaint();
                }
                case "s" -> {
                    drawingPanel.setShape("square");
                    drawingPanel.repaint();
                }

                default -> System.out.println("Unknown shape");
            }
        }
    }

    static class DrawingPanel extends JPanel {
        private String shape;

        public DrawingPanel() {
            setPreferredSize(new Dimension(400, 400));
        }

        public void setShape(String shape) {
            this.shape = shape;
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            if (shape != null) {
                int x = getWidth() / 2;
                int y = getHeight() / 2;
                int size = 200;

                if (shape.equals("circle")) {
                    g2d.setColor(Color.RED);
                    g2d.fillOval(x - size / 2, y - size / 2, size, size);
                } else if (shape.equals("square")) {
                    g2d.setColor(Color.BLUE);
                    g2d.fillRect(x - size / 2, y - size / 2, size, size);
                }
            }
        }
    }
}
