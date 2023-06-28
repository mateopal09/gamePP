package com.poli.englishtimetrialgame.menu.records;

//Java
import java.net.URL;
import java.util.ResourceBundle;

//JavaFX
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

/*
 * Esta es una clase controladora FXML para el registro de los desarrolladores.
 * Del juego 
*/
public class RecordController implements Initializable {
    /*
     * Este método se llama cuando se presiona el botón BackRecord.
     * Carga un nuevo archivo FXML llamado menu.fxml
     * y lo establece como la raíz de la escena actual.
     */
    @FXML
    public void BackRecord(ActionEvent event){
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
     * Este método se llama para inicializar la 
     * clase controladora de record.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
