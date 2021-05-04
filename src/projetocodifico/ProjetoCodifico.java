package projetocodifico;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.plaf.RootPaneUI;

public class ProjetoCodifico extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent telaLogin = FXMLLoader.load(getClass().getResource("../telas/login.fxml"));

        Scene scene = new Scene(telaLogin);

        stage.setScene(scene);
        stage.setTitle("CODIFICO");
        stage.setResizable(false);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
