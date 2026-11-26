import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        try {
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/view/menuInicio.fxml")));
            stage.setTitle("Snake Game");
            stage.setScene(scene);
            stage.show();   
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
