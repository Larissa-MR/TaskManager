import java.time.LocalDate;
import java.util.*;

public class Task {
	private long id;
	private String title;
	private ArrayList<String> description;
	private LocalDate dueDate;
	private int priority;
	
	
	
	public Task(long id) {
		this.id=id;
	}

	public Task(String title, ArrayList<String> description, LocalDate dueDate, int priority) {
		this.title=title;
		this.description=description;
		this.dueDate=dueDate;
		this.priority=priority;
	}

	


	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public ArrayList<String> getDescription() {
		return description;
	}



	public void setDescription(ArrayList<String> description) {
		this.description = description;
	}




	
	
}
