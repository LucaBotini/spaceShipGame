package mygame.Model;

import javax.swing.*;
import java.awt.*;

public class Enemy1 {
    private Image image;
    private int x, y;
    private int height, width;
    private boolean isVisible;

    //    private static final int WIDTH = 938;
    private static int SPEED = 4;

    public Enemy1(int x, int y) {
        this.x = x;
        this.y = y;
        isVisible = true;
    }


    public void load() {
        ImageIcon reference = new ImageIcon("src/res/enemyOne.png");
        image = reference.getImage();

        this.width = image.getWidth(null);
        this.height = image.getHeight(null);
    }

    public void update() {
        this.x -= SPEED;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public static int getSPEED() {
        return SPEED;
    }

    public static void setSPEED(int SPEED) {
        Enemy1.SPEED = SPEED;
    }
}
