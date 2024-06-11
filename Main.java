package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
			   Scene scene = new Scene(root);
			   scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			   stage.setScene(scene);
			   stage.setTitle("To-Do List Manager");
			   stage.show();
		} catch(Exception e) {
			e.printStackTrace()
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
