import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeamLeader b=new TeamLeader(0, null, null, 0, null);
		try {
			b.newTeam(0, null, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		TeamLeader a = new TeamLeader(0,null,null,0,null);
		try {
			b.deleteTeam(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
