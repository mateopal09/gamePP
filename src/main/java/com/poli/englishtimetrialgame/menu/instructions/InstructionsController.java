package com.poli.englishtimetrialgame.menu.instructions;

//JavaFX
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

/*
 * Esta es una clase controladora para las instrucciones de un juego.
 */
public class InstructionsController implements Initializable {
    
    /*
     * Este método se llama cuando presiona el botón backInstruc.
     * Carga un nuevo archivo FXML llamado menu.fxml 
     * y lo establece como la raíz de la escena actual.
     */
    @FXML
    private void backInstruc(ActionEvent event){
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
     * Este método se llama para inicializar 
     * la clase controladora de las instrucciones
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
