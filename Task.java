package application;

public class Task {
	String title;
	String description;
	float priority;
	String category;
	boolean isCompleted;
	
	Task(String title, String description, float priority, String catgeory, boolean isCompleted){
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.isCompleted = isCompleted;
	}
	
	Task(String title, float priority, String catgeory, boolean isCompleted){
		this.title = title;
		this.priority = priority;
		this.isCompleted = isCompleted;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setTitle() {
		title = "no title";
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setDescription() {
		description = "no description";
	}
	
	public void setPriority(float priority) {
		this.priority = priority;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setStatus(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	@Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", category='" + category + '\'' +
                '}';
    }
}
