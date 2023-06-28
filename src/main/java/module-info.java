module com.poli.englishtimetrialgame.englishtimetrialgame {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.poli.englishtimetrialgame.englishtimetrialgame to javafx.fxml;
    exports com.poli.englishtimetrialgame.englishtimetrialgame;
    opens com.poli.englishtimetrialgame.inicio to javafx.fxml;
    opens com.poli.englishtimetrialgame.menu to javafx.fxml;
    opens com.poli.englishtimetrialgame.menu.instructions to javafx.fxml;
    opens com.poli.englishtimetrialgame.menu.records to javafx.fxml;
    opens com.poli.englishtimetrialgame.juego to javafx.fxml;


}
