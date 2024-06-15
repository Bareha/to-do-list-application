package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerMain implements Initializable{
	
	@FXML
	public TextField taskTitle;
	@FXML
	public TextArea taskDescription;
	@FXML
	public Slider prioritySlider;
	@FXML
	public ListView<String> myListView;
	
	private List<Task> tasks = new ArrayList<>();
	private List<String> taskList = new ArrayList<>();
	String category = "all";
	
	public void createTask(){
		String title = taskTitle.getText();
		String description = taskDescription.getText();
		float priority = (float) prioritySlider.getValue();
		boolean isCompleted = false;
		
		taskList.add(title);
		
		Task task = new Task(title, description, priority, category, isCompleted);
		
		tasks.add(task);
		System.out.println(task);
		initializeTaskListView();
		
		taskTitle.clear();
		taskDescription.clear();
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



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeTaskListView();
        prioritySlider.setValue(50);
    }

    private void initializeTaskListView() {
    	myListView.getItems().clear();
        myListView.getItems().addAll(taskList);
    }
}
