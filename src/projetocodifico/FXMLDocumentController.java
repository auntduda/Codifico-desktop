package projetocodifico;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("initialize");
    }
    
    public void loadCursosInicial(ActionEvent event) throws IOException {
        Parent cursos;
        cursos = FXMLLoader.load(getClass().getResource("../telas/cursos.fxml"));
        System.out.println(cursos);

        Scene newScene;
        newScene = new Scene(cursos);
        
        Stage mainWindow;
        mainWindow = (Stage) ((Node)event.getSource()).getScene().getWindow();
        mainWindow.setScene(newScene);
    }
    
    @FXML
    private void loadCursos(javafx.scene.input.MouseEvent event) throws IOException {
        Parent cursos;
        cursos = FXMLLoader.load(getClass().getResource("../telas/cursos.fxml"));
        System.out.println(cursos);

        Scene newScene;
        newScene = new Scene(cursos);
        
        Stage mainWindow;
        mainWindow = (Stage) ((Node)event.getSource()).getScene().getWindow();
        mainWindow.setScene(newScene);
    }
    
    public void loadCadastro(ActionEvent event) throws IOException {
        Parent cadastro;
        cadastro = FXMLLoader.load(getClass().getResource("../telas/cadastro.fxml"));
        System.out.println(cadastro);

        Scene newScene;
        newScene = new Scene(cadastro);

        Stage mainWindow;
        mainWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        mainWindow.setScene(newScene); 
        
    }

    @FXML
    private void loadPerfil(javafx.scene.input.MouseEvent event) throws IOException {
        Parent perfil;
        perfil = FXMLLoader.load(getClass().getResource("../telas/perfil.fxml"));
        System.out.println(perfil);

        Scene newScene;
        newScene = new Scene(perfil);

        Stage mainWindow;
        mainWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        mainWindow.setScene(newScene);
    }
    
    @FXML
    private void loadCurso(javafx.scene.input.MouseEvent event) throws IOException {
        Parent curso;
        curso = FXMLLoader.load(getClass().getResource("../telas/curso.fxml"));
        System.out.println(curso);

        Scene newScene;
        newScene = new Scene(curso);

        Stage mainWindow;
        mainWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        mainWindow.setScene(newScene);
    }
    
    @FXML
    private void loadRank(javafx.scene.input.MouseEvent event) throws IOException {
        Parent rank;
        rank = FXMLLoader.load(getClass().getResource("../telas/ranking.fxml"));
        System.out.println(rank);

        Scene newScene;
        newScene = new Scene(rank);

        Stage mainWindow;
        mainWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        mainWindow.setScene(newScene);
    }
    
    @FXML
    private void loadLogin(javafx.scene.input.MouseEvent event) throws IOException {
        Parent login;
        login = FXMLLoader.load(getClass().getResource("../telas/login.fxml"));
        System.out.println(login);

        Scene newScene;
        newScene = new Scene(login);

        Stage mainWindow;
        mainWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        mainWindow.setScene(newScene);
    }
    
    @FXML
    private void loadCursosInscritos(javafx.scene.input.MouseEvent event) throws IOException {
        Parent cursosInscritos;
        cursosInscritos = FXMLLoader.load(getClass().getResource("../telas/cursosInscritos.fxml"));
        System.out.println(cursosInscritos);

        Scene newScene;
        newScene = new Scene(cursosInscritos);

        Stage mainWindow;
        mainWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        mainWindow.setScene(newScene);
    }
    
    private void loadAula1(javafx.scene.input.MouseEvent event) throws IOException {
        Parent aula1;
        aula1 = FXMLLoader.load(getClass().getResource("../telas/aula1.fxml"));
        System.out.println(aula1);

        Scene newScene;
        newScene = new Scene(aula1);

        Stage mainWindow;
        mainWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        mainWindow.setScene(newScene);
    }
    
    private void loadAula1Ex(javafx.scene.input.MouseEvent event) throws IOException {
        Parent aula1ex;
        aula1ex = FXMLLoader.load(getClass().getResource("../telas/aula1ex.fxml"));
        System.out.println(aula1ex);

        Scene newScene;
        newScene = new Scene(aula1ex);

        Stage mainWindow;
        mainWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        mainWindow.setScene(newScene);
    }
    
    private void loadAula2(javafx.scene.input.MouseEvent event) throws IOException {
        Parent aula2;
        aula2 = FXMLLoader.load(getClass().getResource("../telas/aula2.fxml"));
        System.out.println(aula2);

        Scene newScene;
        newScene = new Scene(aula2);

        Stage mainWindow;
        mainWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        mainWindow.setScene(newScene);
    }
    
    private void loadAula2Ex(javafx.scene.input.MouseEvent event) throws IOException {
        Parent aula2ex;
        aula2ex = FXMLLoader.load(getClass().getResource("../telas/aula2ex.fxml"));
        System.out.println(aula2ex);

        Scene newScene;
        newScene = new Scene(aula2ex);

        Stage mainWindow;
        mainWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        mainWindow.setScene(newScene);
    }
    
    private void loadAula3(javafx.scene.input.MouseEvent event) throws IOException {
        Parent aula3;
        aula3 = FXMLLoader.load(getClass().getResource("../telas/aula3.fxml"));
        System.out.println(aula3);

        Scene newScene;
        newScene = new Scene(aula3);

        Stage mainWindow;
        mainWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        mainWindow.setScene(newScene);
    }
    
    private void loadAula3Ex(javafx.scene.input.MouseEvent event) throws IOException {
        Parent aula3ex;
        aula3ex = FXMLLoader.load(getClass().getResource("../telas/aula3ex.fxml"));
        System.out.println(aula3ex);

        Scene newScene;
        newScene = new Scene(aula3ex);

        Stage mainWindow;
        mainWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        mainWindow.setScene(newScene);
    }
    
    private void loadAula4(javafx.scene.input.MouseEvent event) throws IOException {
        Parent aula4;
        aula4 = FXMLLoader.load(getClass().getResource("../telas/aula4.fxml"));
        System.out.println(aula4);

        Scene newScene;
        newScene = new Scene(aula4);

        Stage mainWindow;
        mainWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        mainWindow.setScene(newScene);
    }
    
    private void loadAula4Ex(javafx.scene.input.MouseEvent event) throws IOException {
        Parent aula4ex;
        aula4ex = FXMLLoader.load(getClass().getResource("../telas/aula4ex.fxml"));
        System.out.println(aula4ex);

        Scene newScene;
        newScene = new Scene(aula4ex);

        Stage mainWindow;
        mainWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        mainWindow.setScene(newScene);
    }
}
