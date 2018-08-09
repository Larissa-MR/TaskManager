import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Main {

	public static void main(String[] args) throws ParseException, IOException {
		// TODO Auto-generated method stub
		
		Administrator a = new Administrator(0, "Milch", "Mueller", 40);
		a.newEmployee(1, "Jauch", "Gunther", 30);
		//LOGIN
		
		Employee rightEmployee = null;
		Scanner keyboard = new Scanner(System.in);
		String inpUser = "", inpPass = "";
		
		while (!SystemManager.loginIsValid(inpUser, inpPass)) {
			System.out.println("Username: ");
			inpUser = keyboard.nextLine();
			System.out.println("Passwort: ");
			inpPass = keyboard.nextLine();     // gets input from user
		}
		


		// HAUPTMENÜ


		System.out.println(
				"                WELCOME " + rightEmployee.getFirstName() + " " + rightEmployee.getLastName() + "!");

	/*	SystemManager.viewEmpTasks(rightEmployee.getTasks());
		
		System.out.println("\n______________Please choose an option_______________");

		String userOption = "";

		do {
			System.out.println("(1) Add a task ");
			System.out.println("(2) Remove a task ");
			System.out.println("(3) Edit a task ");
			System.out.println("(0) Log out ");

			userOption = keyboard.nextLine();

			switch (userOption) {
			case "1":
				// method
				// cancel option fehlt (zurück zum Hauptmenü)
				System.out.println("\n\n\n______Add task______");
				String titleInp="";
				while(titleInp.equals("")) {
					System.out.println("Title: ");
					titleInp=keyboard.nextLine();
				}
				
				String descriptionInp="";
				while(descriptionInp.equals("")) {
					System.out.println("Description: ");
					descriptionInp=keyboard.nextLine();
				}
				
				String dueDateInp="";
				Date d=null;
				while(dueDateInp.equals("")|| !SystemManager.dateIsValid(dueDateInp)) {
					System.out.println("Due date (dd.mm.yyyy): ");
					dueDateInp=keyboard.nextLine();
				}
				LocalDate dueDate= SystemManager.convertStringToLocalDate(dueDateInp);

				String timeInp="";
				int hours=0;
				do {
				System.out.println("Time exposure (in h): ");
				timeInp=keyboard.nextLine();
				}
				while(timeInp.equals("")||SystemManager.StringToInt(timeInp)==-1);
				hours=SystemManager.StringToInt(timeInp);
						
				String priorityInp="";
				int priority=0;
				do {
					System.out.println("Priority (1-low to 3-high): ");
					priorityInp=keyboard.nextLine();
				}
				while(SystemManager.priorityIsValid(priorityInp)==0);
				priority=SystemManager.priorityIsValid(priorityInp);
				
				Task myTask = new Task(titleInp, dueDate, priority, hours);
				ArrayList<String>descriptionInpList=new ArrayList<String>();
				descriptionInpList.add(descriptionInp);
				myTask.setDescription(descriptionInpList);
				rightEmployee.addTask(myTask);
				
				SystemManager.taskSummaryOutput(myTask);
				
				break;
			case "2":

				break;
			case "3":

				break;
			case "0":

				break;
			}
		}

		while (userOption.equals("")); // Input-Validation (1,2,3,0)
		
		
		*/
	}
}