import java.io.FileNotFoundException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

//	Employee neu = DataBase.addnewEmployee(1111, "einVorname", "einNachname", 40, new LoginData("einUsername", "einPasswort"));
//	System.out.println(neu.getFirstName());

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1000, "Manuel", "Mueller", 40, new LoginData("us1", "pw1")));
		empList.add(new Employee(1001, "Jochen", "Lauter", 40, new LoginData("us2", "pw2")));
		empList.add(new Employee(1002, "Nina", "Lambrecht", 40, new LoginData("us3", "pw3")));
		empList.add(new Employee(1003, "Giselle", "Stecher", 40, new LoginData("us4", "pw4")));
		/*
		 * Employee emp5 = new Employee(1005,"Paul","Stehr",30, new LoginData("us5",
		 * "pw5")); Employee emp6 = new Employee(1006,"Janine","Steinberger",20, new
		 * LoginData("us6", "pw6")); Employee emp7 = new
		 * Employee(1007,"Tom","Lauber",40, new LoginData("us7", "pw7"));
		 */

		// NUTZER LOGIN ABFRAGE

		Employee rightEmployee = null;
		Scanner keyboard = new Scanner(System.in);
		String inpUser = "", inpPass = "";

		while (SystemManager.loginIsValid(empList, inpUser, inpPass) == null) {
			System.out.println("Username: ");
			inpUser = keyboard.nextLine();
			System.out.println("Passwort: ");
			inpPass = keyboard.nextLine(); // gets input from user
		}

		rightEmployee = SystemManager.loginIsValid(empList, inpUser, inpPass);

		// HAUPTMENÜ

		ArrayList<Task> empTasks = new ArrayList<Task>();
		Task t1 = new Task(1);
		t1.setTitle("Meine erste Aufgabe");
		ArrayList<String> description= new ArrayList<String>();
		description.add("rumsitzen");
		t1.setDescription(description);
		empTasks.add(t1);

		System.out.println(
				"                WELCOME " + rightEmployee.getFirstName() + " " + rightEmployee.getLastName() + "!");

		System.out.println("\n_______________________MY TASKS_______________________");
		for (int i = 0; i < empTasks.size(); i++) {
			System.out.println("\nID:          " + empTasks.get(i).getId() + "\nTitle:       "
					+ empTasks.get(i).getTitle() + "\n" + "Description: " + empTasks.get(i).getDescription());
		}

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
				System.out.println("You chose 1");
				// method
				System.out.println("_________________");
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
	}
}