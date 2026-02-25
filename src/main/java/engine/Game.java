package engine;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Game {

    private Canvas canvas;
    private GraphicsContext gc;

    private long lastTime = 0;

    public Game(Canvas canvas) {
        this.canvas = canvas;
        this.gc = canvas.getGraphicsContext2D();
    }

    public void start() {
        new AnimationTimer() {
            @Override
            public void handle(long now) {

                if (lastTime == 0) {
                    lastTime = now;
                    return;
                }

                double deltaTime = (now - lastTime) / 1_000_000_000.0;
                lastTime = now;

                update(deltaTime);
                render();
            }
        }.start();
    }

    private void update(double deltaTime) {
        // Hier komt game logic
    }

    private void render() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.fillText("Game Running...", 50, 50);
        Image image1 = new Image("file:Test.png",100,0,false,false);
        gc.drawImage(image1,150,150);
        // Hier teken je alles
    }
}
