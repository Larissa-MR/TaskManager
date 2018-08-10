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

		Employee emp1 = a.newEmployee(1, "Heine", "Heinrich", 35);
		Employee emp2 = a.newEmployee(2, "Langstrumpf", "Pipi", 40);
		Employee emp3 = a.newEmployee(3, "Din", "Ala", 20);
		Employee emp4 = a.newEmployee(4, "B", "Cardi", 50);
		Employee emp5 = a.newEmployee(5, "cool", "ok", 30);
		Employee emp6 = a.newEmployee(6, "Man", "Iron", 20);
		Employee emp7 = a.newEmployee(7, "Skurrt", "Skurrt", 0);

		// LOGIN
		Scanner keyboard = new Scanner(System.in);
		boolean isLoggedIn = false;
		while (!isLoggedIn) {
			Employee currEmployee = LoginMenu.showLoginMenu();
			isLoggedIn=true;

			// HAUPTMENÜ

			System.out.println(
					"                WELCOME " + currEmployee.getFirstName() + " " + currEmployee.getLastName() + "!");

			System.out.println("                 MY TASKS           \n");
			currEmployee.viewTasks();

			System.out.println("\n______________Please choose an option_______________");

			String userOption = "";

			boolean ext = true;
			do {
				System.out.println("\n(1) Add a task ");
				System.out.println("(2) Delete a task ");
				System.out.println("(3) Delegate a task ");
				System.out.println("(0) Log out ");

				userOption = keyboard.nextLine();

				switch (userOption) {
				case "1":
					Task currTask = AddTaskConsole.taskQuery();
					currEmployee.addTask(currTask);
					SystemManager.taskSummaryOutput(currTask);
					break;
				case "2":
					long taskId = DeleteConsole.deleteTaskQuery();
					currEmployee.deleteTask(taskId);
					System.out.println("Successfully deleted!");
					break;
				case "3":
					System.out.println("_______EMPLOYEES:_________ (for your tasks see above");
					SystemManager.viewEmployees();
					long delegationTaskId = DelegationConsole.delegationQueryTask();
					long delegationEmpId = DelegationConsole.delegationQueryEmp();
					currEmployee.delegateTask(delegationEmpId, delegationTaskId);
					System.out.println("Successfully delegated!");
					break;
				case "0":
					currEmployee = null;
					ext=false;
					isLoggedIn=false;
					break;
				}
			} while (userOption.equals("") || ext);
		}

	}
}