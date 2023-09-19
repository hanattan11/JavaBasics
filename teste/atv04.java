package teste;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class atv04 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Desenho de Círculo");

        // Cria um círculo com raio 50 e o posiciona no centro da janela
        Circle circle = new Circle(150, 150, 50);
        circle.setFill(Color.BLUE);

        Pane root = new Pane();
        root.getChildren().add(circle);

        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}