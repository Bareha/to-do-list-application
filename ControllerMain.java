package application;

import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerMain {
	
	@FXML
	public TextField taskTitle;
	@FXML
	public TextArea taskDescription;
	@FXML
	public Slider prioritySlider;
	
	private List<Task> tasks = new ArrayList<>();
	String category;
	
	int i = 0;
	
	public void createTask(){
		String title = taskTitle.getText();
		String description = taskDescription.getText();
		float priority = (float) prioritySlider.getValue();
		boolean isCompleted = false;
		
		Task task = new Task(title, description, priority, category, isCompleted);
		
		tasks.add(task);
		System.out.println(task);
	}
	
	public void selectWork(ActionEvent e) {
		category = "work";
	}
	public void selectPersonal(ActionEvent e) {
		category = "personal";
	}
	public void selectShopping(ActionEvent e) {
		category = "shopping";
	}
	public void selectErrands(ActionEvent e) {
		category = "errands";
	}
	public void selectHealth(ActionEvent e) {
		category = "health";
	}
	public void selectStudy(ActionEvent e) {
		category = "study";
	}
	public void selectHome(ActionEvent e) {
		category = "home";
	}
}
