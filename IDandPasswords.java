import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("tobi","robi");
		
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}

}
