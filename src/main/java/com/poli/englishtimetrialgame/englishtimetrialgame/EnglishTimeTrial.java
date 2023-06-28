package com.poli.englishtimetrialgame.englishtimetrialgame;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 *
 * @author Mateo Palomá
 * -Santiago Santana
 * -Juan Diego Castro
 * -Cristian Camilo Patino
 * -Juan Carlos Botero
 * 
 */

/*
 *  
 * La clase EnglishTimeTrial representa la aplicación principal de EnglishTimeTrial.
 */
public class EnglishTimeTrial extends Application {
    
    /*
     * Método start que se llama cuando se inicia la aplicación.
     * Este método carga la vista FXML de inicio y la muestra en el escenario principal.
     *
     * @param stage el escenario principal de la aplicación
     * @throws Exception si ocurre un error al cargar la vista FXML
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/poli/englishtimetrialgame/inicio/Inicio.fxml"));
        Scene scene = new Scene(root,805,460);
        stage.setTitle("English Trial Task");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    /*
     * Método main que se llama cuando se ejecuta la aplicación desde la línea de comandos.
     */
    public static void main(String[] args) {
        launch(args);
    }
}