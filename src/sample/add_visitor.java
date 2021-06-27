package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class add_visitor implements Initializable {

    @FXML
    private AnchorPane back1;

    @FXML
    private TextField phone;

    @FXML
    private TextField surname;

    @FXML
    private TextField name;

    @FXML
    private TextField last_name;

    @FXML
    private TextField email;

    @FXML
    private ComboBox<String> combo_gender;

    @FXML
    private Button add_button;

    @FXML
    private Button add_visitor_button;

    @FXML
    private Button add_sotrud_button;

    @FXML
    private Button add_inventar_button;

    @FXML
    private Button add_sdelka_button;

    @FXML
    private ComboBox<String> create_otchet_button;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> genders = FXCollections.observableArrayList();
        genders.addAll("Мужской", "Женский");
        combo_gender.setItems(genders);

        ObservableList<String> otchet = FXCollections.observableArrayList();
        otchet.addAll("Отчёт 1", "Отчёт 2", "Отчёт 3");
        create_otchet_button.setItems(otchet);
    }

    @FXML
    void add(ActionEvent event) {

    }


//    @FXML
//    void create_otch1(ActionEvent event) {
//
//    }
//
//    @FXML
//    void create_otch2(ActionEvent event) {
//
//    }
//
//    @FXML
//    void create_otch3(ActionEvent event) {
//
//    }

    @FXML
    void go_add_invent(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) add_inventar_button.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("add_invent.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Добавить новый инвентарь");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    @FXML
    void go_add_pos(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) add_visitor_button.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("add_visitor.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Добавить нового посетителя");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void go_add_sotrud(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) add_sotrud_button.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("add_sotrud.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Добавить нового сотрудника");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void go_add_sdelka(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) add_sdelka_button.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("add_new_sdelka.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Добавить новую сделку");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }
}
