package com.poli.englishtimetrialgame.juego;

//Java
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

//JavaFX
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

/*
* 
* Clase controladora FXML de JavaFX para un el Juego.
*/
public class JuegoController implements Initializable {
    
    private int correctAnswercount = 0;
    private int incorrectAnswercount = 0;
    
    @FXML
    private Text question_number;
    
    @FXML
    private Text txt_question;
    
    @FXML
    private Button bt_tryagain;
    
    @FXML
    private Button bt_a;
    
    @FXML
    private Button bt_b;
    
    @FXML
    private Button bt_c;
    
    @FXML 
    private Button bt_d;
    
    @FXML
    private Label lbl_result;
    
    private int currentQuestionIndex = 0;
    
    //Creación de variable questions para crear las preguntas 
    private List<Question> questions = new ArrayList<>();
    
    /*
     * Este método inicializa las preguntas del juego.
     */
    private void initializeQuestions() {
        questions.add(new Question("¿What could be an example of present simple?", 
                "I was dreaming","He takes a bus every day", "She walk in the park",
                "You are eating something", 2));
        questions.add(new Question("¿Cuál es la traducción al inglés de correr?", 
                "Eat", "Sleep", "Understand", "Run", 4 ));
        questions.add(new Question("¿How do you say your age in past?",
                "I were 10 years old", "I have been 10 years old", 
                "I was 10 years old", "I am 10 years old", 3));
        questions.add(new Question("¿What is the number: one hundred eleven?",
                "111", "45","101","011",1));
        questions.add(new Question("Answer the question: '¿What time is it?'",
                "Let me check the phone", "It's 3:40","Sorry I don't know,", 
                "It was 10 o'clock", 2 ));
    }
    
    public void showQuestion(int questionIndex){
        // Obtener la pregunta actual
        Question currentQuestion = questions.get(questionIndex);
        // Actualizar el número de la pregunta
        question_number.setText("QUESTION " + (questionIndex + 1));
        // Actualizar el texto de la pregunta
        txt_question.setText(currentQuestion.getQuestionText());
        // Actualizar las opciones de respuesta
        bt_a.setText(currentQuestion.getOptionA());
        bt_b.setText(currentQuestion.getOptionB());
        bt_c.setText(currentQuestion.getOptionC());
        bt_d.setText(currentQuestion.getOptionD());    
    }
    
    /*
    * Este método se llama cuando el usuario selecciona una opción.
    */
    @FXML
    private void handleOptionSelected(ActionEvent event) {
        
        try {
            int selectedOption = 0;
            if (event.getSource()== bt_a) {
                selectedOption = 1;
            } else if (event.getSource()==bt_b) {
                selectedOption = 2;
            } else if (event.getSource()==bt_c) {
                selectedOption = 3;
            } else if (event.getSource()==bt_d) {
                selectedOption = 4;
            }
            
            // Verificar si la opción seleccionada es correcta.
            Question currentQuestion = questions.get(currentQuestionIndex);
            if (selectedOption == currentQuestion.getCorrectAnswerIndex()) {
                //Contabiliza la respuesta correcta.
                correctAnswercount ++;     
            } else{
                //Contabiliza la respuesta incorrecta.
                incorrectAnswercount ++;
            }
            //Itera en la cantidad de preguntas que hay, entonces una vez que 
            //Se responde salta a la siguiente pregunta.
            currentQuestionIndex++;
            
            //Busca si la pregunta en la que esta, está dentro del limite del tamaño de la lista questions.
            if (currentQuestionIndex < questions.size()){
                //Si aún hay preguntas entonces las muestra.
                showQuestion(currentQuestionIndex);
            }else{
                //Si no hay preguntas entonces muestra el resultado obtenido.
                showResult();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
    
    private void showResult() {
    //Mostrar el resultado del juego
    String result = "Correct answers: " + correctAnswercount + "\nIncorrect answers: " + incorrectAnswercount;
    lbl_result.setText(result);
    lbl_result.setVisible(true);
    lbl_result.setAlignment(Pos.CENTER);
}
    
    
    @FXML
    private void handleTryAgain(ActionEvent event) {
        // Reiniciar el juego
        restartGame();
    }
    private void restartGame() {
        // Restablecer las variables del juego
        correctAnswercount = 0;
        incorrectAnswercount = 0;
        currentQuestionIndex = 0;
        
        // Mostrar la primera pregunta
        showQuestion(currentQuestionIndex);
        
        // Ocultar el Label de resultado
        lbl_result.setVisible(false);
    }
    
    /*
     * Este método se llama para inicializar la clase controladora del Juego
     * Después de que su elemento raíz haya sido completamente procesado.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        initializeQuestions();
        showQuestion(0);
    }
}
