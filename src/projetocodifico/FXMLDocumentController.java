package projetocodifico;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private AnchorPane rootPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    public void loadCursos(ActionEvent event) throws IOException {
        System.out.println("Acerto");
        AnchorPane telaCadastro = (AnchorPane)FXMLLoader.load(getClass().getResource("/../telas/cadastro.fxml"));
//        rootPane.getChildren().setAll(telaCadastro); //Exception in thread "JavaFX Application Thread" java.lang.RuntimeException: java.lang.reflect.InvocationTargetException
        
    }
    
}
