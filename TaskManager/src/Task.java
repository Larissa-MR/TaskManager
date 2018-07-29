import java.time.LocalDate;
import java.util.*;

public class Task {
	private long id;
	private String title, description;
	private LocalDate dueDate;
	private String Priority;
	
	
	
	
	public Task(long id) {
		this.id=id;
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



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getDueDate() {
		return dueDate;
	}


	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}


	public String getPriority() {
		return Priority;
	}


	public void setPriority(String priority) {
		Priority = priority;
	}
	

	



}
