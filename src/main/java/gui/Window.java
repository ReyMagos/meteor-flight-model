package gui;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        init();
        createContent();
    }

    protected void init() {

    }

    protected void createContent() {

    }

    public void open() {
        setVisible(true);
    }

    public void close() {
        setVisible(false);
    }

    public static Rectangle fullscreen() {
        return new Rectangle(0, 0, getScreenWidth(), getScreenHeight());
    }

    public static Rectangle center(int width, int height) {
        int x = (getScreenWidth() - width) / 2;
        int y = (getScreenHeight() - height) / 2;
        return new Rectangle(x, y, width, height);
    }
    public static Dimension getScreenSize() {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }

    public static int getScreenWidth() {
        return getScreenSize().width;
    }

    public static int getScreenHeight() {
        return getScreenSize().height;
    }
}
