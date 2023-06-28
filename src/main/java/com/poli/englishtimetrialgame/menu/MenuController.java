package com.poli.englishtimetrialgame.menu;

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
 *Clase controlador para el menú
 * 
 * @author matep
 */
public class MenuController implements Initializable {
    
    /*
     * Este método se llama cuando se presiona el botón PlayGame.
     * Carga el archivo FXML llamado Juego.fxml 
     * y lo establece como la raíz de la escena actual.
     */
    @FXML
    private void PlayGame(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/poli/englishtimetrialgame/juego/Juego.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Scene scene = (Scene) ((Node) event.getSource()).getScene();
            scene.setRoot(root1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /*
     * Este método se llama cuando se presiona el botón Instruction.
     * Carga el archivo FXML llamado instructions.fxml
     * y lo establece como la raíz de la escena actual.
     */
    @FXML
    private void Instruction(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/poli/englishtimetrialgame/menu.instructions/instructions.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Scene scene = (Scene) ((Node) event.getSource()).getScene();
            scene.setRoot(root1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /*
     * Este método se llama cuando se presiona en el botón Record.
     * Carga el archivo FXML llamado record.fxml 
     * y lo establece como la raíz de la escena actual.
     */
    @FXML
    private void Record(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/poli/englishtimetrialgame/menu/records/record.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Scene scene = (Scene) ((Node) event.getSource()).getScene();
            scene.setRoot(root1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * Este método se llama para inicializar 
     * la clase controladora del menú
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
