import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Main {

	public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Administrator a = new Administrator(0, "Milch", "Mueller", 40);
		a.newEmployee(1, "Jauch", "Gunther", 30);
		
		
		
		a.newEmployee(1, "Heine", "Heinrich", 35);
		a.newEmployee(2, "Langstrumpf", "Pipi", 40);
		a.newEmployee(3, "Din", "Ala", 20);
		a.newEmployee(4, "B", "Cardi", 50);
		a.newEmployee(5, "cool", "ok", 30);
		a.newEmployee(6, "Man", "Iron", 20);
		a.newEmployee(7, "Skurrt", "Skurrt", 0);
		
		//LOGIN
		
		Employee currEmployee = null;
		Scanner keyboard = new Scanner(System.in);
		String inpUser = "", inpPass = "";
		
		do {
			System.out.println("Username: ");
			inpUser = keyboard.nextLine();
			System.out.println("Passwort: ");
			inpPass = keyboard.nextLine();    
		}
		while (SystemManager.loginIsValid(inpUser, inpPass)==null);
		
		currEmployee = SystemManager.getEmployeeByFileName(SystemManager.loginIsValid(inpUser, inpPass));



		// HAUPTMENÜ


		System.out.println(
				"                WELCOME " + currEmployee.getFirstName() + " " + currEmployee.getLastName() + "!");

		System.out.println("           MY TASKS           \n");
		currEmployee.viewTasks();
		
		System.out.println("\n______________Please choose an option_______________");

		String userOption = "";

		do {
			System.out.println("(1) Add a task ");
			System.out.println("(2) Remove a task ");
			System.out.println("(0) Log out ");

			userOption = keyboard.nextLine();

			switch (userOption) {
			case "1":
				Task currTask = AddTaskConsole.taskQuery();
				currEmployee.addTask(currTask);
				SystemManager.taskSummaryOutput(currTask);
				break;
			case "2":

				break;
			case "3":

				break;
			case "0":

				break;
			}
		}
		while (userOption.equals(""));
		
		
		
	}
}