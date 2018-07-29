import java.util.*;

public class SystemManager {

	public static Employee loginIsValid(ArrayList<Employee> empList, String inpUser, String inpPass) {
		if (inpUser.equals("")||inpPass.equals(""))return null;
		for (int i = 0; i < empList.size(); i++) {
			if (inpUser.equals(empList.get(i).getLoginData().getUsername())) {
				if (inpPass.equals(empList.get(i).getLoginData().getPassword())) {
					return empList.get(i);
				}
			}
		}
		return null;
	}
	
/*	String choice="3";
	 do {
	        

	        switch (choice) {
	        case "1":
	            System.out.println("Add a task ");
	            choice = input.nextLine();
	            break;
	        case "2":
	            System.out.println("Remove a task");
	            choice = input.nextLine();
	            break;
	        case "3":
	            System.out.println("Update a task");
	            choice = input.nextLine();
	            break;
	        case "4":
	            System.out.println("List all tasks");
	            choice = input.nextLine();
	            break;
	        }
	    }

	    while (choice > 0) {
	        System.out.println("Exit");
	    }*/
}
