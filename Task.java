import java.time.LocalDate;
import java.util.*;

public class Task {
	private long id;
	private String title;
	private String description; 
	private LocalDate dueDate;
	private int priority;
	private int hours;
	
	
	
/*	public Task(long id) {
		this.id=id;
	}
*/
	public Task(String title, LocalDate dueDate, int priority, int hours) {
		this.title=title;
//		this.description=description;
		this.dueDate=dueDate;
		this.priority=priority;
		this.hours=hours;
	}

	


	public int getHours() {
		return hours;
	}




	public void setHours(int hours) {
		this.hours = hours;
	}




	public LocalDate getDueDate() {
		return dueDate;
	}




	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}




	public int getPriority() {
		return priority;
	}




	public void setPriority(int priority) {
		this.priority = priority;
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




	
	
}
