import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.net.URL;

public class JavaFXThing extends Application{

  public static void main(String[] args) {
    launch(args);
  }
  @Override
  public void start(Stage primaryStage) throws Exception {

    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(new URL("file:///C:/Users/ray-p/OneDrive/Documents/Hello.fxml"));
    AnchorPane anchorpane = loader.<AnchorPane>load();

    Scene scene = new Scene(anchorpane);
    primaryStage.setScene(scene);
    primaryStage.show();

  }

}
