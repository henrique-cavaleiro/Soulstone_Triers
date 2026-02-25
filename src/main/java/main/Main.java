package main;

import engine.Game;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Canvas canvas = new Canvas(800, 600);
        Game game = new Game(canvas);

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Soulstone Triers");
        stage.show();

        game.start();
    }

    public static void main(String[] args) {
        launch();
    }
}