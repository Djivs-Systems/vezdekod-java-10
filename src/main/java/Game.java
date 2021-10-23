package main.java;

import lib.Window;
import lib.render.Canvas;
import lib.render.Texture;
import lib.vertex.DefaultVertexFormats;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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
