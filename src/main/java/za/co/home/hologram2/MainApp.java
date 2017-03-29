package za.co.home.hologram2;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
 import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainApp extends Application {

  @Override
  public void start(Stage primaryStage) {

    BorderPane borderpane = new BorderPane();
    HologramPlayer hologramPlayer=new HologramPlayer("/home/migal/Videos/AmazingWorldOfGumball/Season1/AmazingWorldOfGumball_S1E15_TheGI.mp4");
    borderpane.setCenter(hologramPlayer);

    borderpane.setStyle("-fx-background-color: black");

    Scene scene = new Scene(borderpane, 600, 600);
    scene.setFill(Color.BLACK);

    primaryStage.setTitle("Media Player!");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  /**
   * The main() method is ignored in correctly deployed JavaFX application.
   * main() serves only as fallback in case the application can not be launched
   * through deployment artifacts, e.g., in IDEs with limited FX support.
   * NetBeans ignores main().
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }

}
