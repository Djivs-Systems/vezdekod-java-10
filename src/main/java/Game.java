package main.java;

import lib.Window;
import lib.render.Texture;

public class Game extends Window {
    private final Texture backgroundTexture = Texture.load("back.jpg");

    public Game() {
        super(800, 600, "Vezdekod :3", true, "Arial", 30);
    }

    @Override
    protected void onFrame(double elapsed) {
        canvas.drawTexture(backgroundTexture, 0, 0, width, height, width, height);
    }

    public static void main(String[] args) {
        new Game().show();
    }
};
