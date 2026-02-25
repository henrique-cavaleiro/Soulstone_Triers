package engine;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

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
        // Hier teken je alles
    }
}
