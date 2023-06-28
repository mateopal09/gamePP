package com.poli.englishtimetrialgame.juego;

/*
 *Esta clase representa una pregunta en un juego.
 */
public class Question {
    private String questionText;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private int correctAnswer;

    
    /*
    * Constructor de la clase Question.
    */
    public Question(String questionText, String optionA, String optionB, String optionC, String optionD, int correctAnswer) {
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = correctAnswer;
    }

    // Métodos getter para acceder a los campos
    public String getQuestionText() {
        return questionText;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
    
    int getCorrectAnswerIndex() {
        return correctAnswer; 
    }
}
