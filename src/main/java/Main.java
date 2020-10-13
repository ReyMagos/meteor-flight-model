import gui.Space;
import render.RenderFactory;

public class Main {
    public static void main(String[] args) {
        RenderFactory.init();

        Space space = new Space();
        space.open();


    }
}
