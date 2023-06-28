package com.poli.englishtimetrialgame.inicio;

//JavaFX
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;


/*
*
*Controlador para el inicio del juego
*/
public class InicioController implements Initializable {
    
    /*
    *Este método es llamado cuando el botón StartGame se clickea
    *Este carga el archivo menu.fxml una vez sea clickeado y
    *La ajusta como nueva raíz de la escena.
    */ 
    @FXML
    private void StartGame(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/poli/englishtimetrialgame/menu/menu.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Scene scene = (Scene) ((Node) event.getSource()).getScene();
            scene.setRoot(root1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    *Este método es llamado cuando el bóton EndGame es presionado
    *Se sale del juego
    */
    @FXML
    private void EndGame(ActionEvent event){
        Platform.exit();   
    }
    /*
     *Este método inicializa la clase del controlador después 
     *Que la raíz de su elemento ha sido completamente procesado
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }       
}
